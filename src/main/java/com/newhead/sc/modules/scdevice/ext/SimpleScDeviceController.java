package com.newhead.sc.modules.scdevice.ext;

import com.alibaba.fastjson.JSONObject;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.newhead.rudderframework.core.web.api.ApiEntity;
import com.newhead.rudderframework.core.web.api.ApiException;
import com.newhead.rudderframework.core.web.api.ApiStatus;
import com.newhead.rudderframework.tools.sc.AESTool;
import com.newhead.sc.modules.scdevice.base.AbstractScDeviceController;
import com.newhead.sc.modules.scdevice.ext.protocol.SimpleScDeviceQueryResponse;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import okhttp3.*;
import org.apache.commons.codec.digest.DigestUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * RudderFramework 自动生成
 * 设备控制
 * 2017年12月13日 12:17:48
 */
@Slf4j
@Api(tags = "设备", description = "相关的API")
@RestController
@RequestMapping(value = "/scdevice", method = RequestMethod.GET)
public class SimpleScDeviceController extends AbstractScDeviceController {

    public static final String APP_ID = "6B25E3BA0B9416CB30100378452CF4C8";

    public static final String APP_SECRET = "CBF72FB38B96117E54DD1CFE0E6F57F8";

    public static final String KEY = "20160226!#xm@837";

    public static final String IV_PARAMETER = "0231345874954435";

    public static final String AKAOL_CUSTOMER = "88536915";

    public static final String AKAOL_SECRET = "Llpq1ts51W8i5CJTRCGis";

    private static final MediaType JSON = MediaType.parse("application/json; charset=utf-8");

    private OkHttpClient client = new OkHttpClient();

    @Autowired
    private SimpleScDeviceService service;

    @Override
    public SimpleScDeviceService getService() {
        return service;
    }

    @ApiOperation(value = "获取", response = ApiEntity.class, notes = "设备ID")
    @RequestMapping(value = "getlistbyphonenumber", method = RequestMethod.GET)
    public ApiEntity<List<SimpleScDeviceQueryResponse>> getListByMobile(@RequestParam(required = false) String number) {
        List<SimpleScDeviceQueryResponse> sources = getService().queryListByPhoneNumber(number);
        return new ApiEntity<List<SimpleScDeviceQueryResponse>>(sources);
    }

    @ApiOperation(value = "获取", response = ApiEntity.class, notes = "设备ID")
    @RequestMapping(value = "getdevices", method = RequestMethod.GET)
    public ApiEntity<List<SimpleScDeviceQueryResponse>> getListByUserToken(@RequestParam String usertoken) {
        String accessToken = null;
        String number = null;

        try {
            accessToken = getAccessToken();
            number = getMobile(usertoken, accessToken);
        } catch (Exception e) {
            log.error("调用SmartCity接口错误", e);
            return new ApiEntity<>(ApiStatus.STATUS_500);
        }

        if (StringUtils.isBlank(number)) {
            return new ApiEntity<>(Lists.newArrayList());
        }
        List<SimpleScDeviceQueryResponse> sources = getService().queryListByPhoneNumber(number);
        return new ApiEntity<>(sources);
    }

    @ApiOperation(value = "获取佳乐开门二维码", response = ApiEntity.class, notes = "获取佳乐开门二维码")
    @RequestMapping(value = "getakaolqrcode", method = RequestMethod.GET)
    public ApiEntity<String> getAkaolQrCode(
            @RequestParam String cno,
            @RequestParam String bno,
            @RequestParam String ano,
            @RequestParam String hno,
            @RequestParam String account) throws IOException {
        String qrCode = getQrCode(cno, bno, ano, hno, account);
        return new ApiEntity<>(qrCode);
    }

    private String getAccessToken() throws Exception {
        String url = "http://59.61.216.123:39012/SmartCity/user/get_access_token";

        String params = "{\"app_id\":\"" + APP_ID + "\",\"app_secret\":\"" + APP_SECRET + "\"}";
        String encryptedParams = AESTool.Encrypt(params, KEY, IV_PARAMETER);

        JSONObject requestBody = new JSONObject();
        requestBody.put("signature", "");
        requestBody.put("timestamp", System.currentTimeMillis());
        requestBody.put("params", encryptedParams);

        JSONObject responseBody = postJson(url, requestBody);
        log.info("smartcity:get_access_toke响应, response={}", responseBody.toJSONString());

        if (!Objects.equals(responseBody.getString("result"), "0")) {
            throw new ApiException(ApiStatus.STATUS_500);
        }

        return responseBody.getString("access_token");
    }

    private String getMobile(String userToken, String accessToken) throws Exception {
        String url = "http://59.61.216.123:39012/SmartCity/user/getuserinfo";

        JSONObject requestBody = new JSONObject();
        requestBody.put("access_token", accessToken);
        requestBody.put("user_token", userToken);
        requestBody.put("signature", "");
        requestBody.put("timestamp", System.currentTimeMillis());
        requestBody.put("params", "");

        JSONObject responseBody = postJson(url, requestBody);
        log.info("smartcity:getuserinfo响应, response={}", responseBody.toJSONString());

        if (!Objects.equals(responseBody.getString("result"), "0")) {
            return "";
        }
        String dataEncrypted = responseBody.getString("data");
        log.info("smartcity:getuserinfo响应data密文, data={}", dataEncrypted);
        String dataStr = AESTool.getInstance().decrypt(dataEncrypted, KEY, IV_PARAMETER);
        log.info("smartcity:getuserinfo响应data解密, data={}", dataStr);
        JSONObject dataJsonObj = JSONObject.parseObject(dataStr);
        return dataJsonObj.getJSONObject("user").getString("mobile_phone");
    }

    private String getQrCode(String cno, String bno, String ano, String hno, String account) throws IOException {
        String url = "http://webservice.akaol.com/api/getQrcode";

        String nonceStr = getNonceStr();
        String sign = signAkaolParams(nonceStr);

        Map<String, String> params = Maps.newHashMap();
        params.put("cno", cno);
        params.put("bno", bno);
        params.put("ano", ano);
        params.put("hno", hno);
        params.put("account", account);
        params.put("customer", AKAOL_CUSTOMER);
        params.put("nonce_str", nonceStr);
        params.put("sign", sign);

        JSONObject responseBody = postForm(url, params);
        log.info("akaol:getqrcode响应, response={}", responseBody.toJSONString());

        if (!Objects.equals(responseBody.getString("errorCode"), "S0000")) {
            throw new ApiException(ApiStatus.STATUS_500);
        }

        return responseBody.getString("qrcode");
    }

    private JSONObject postJson(String url, JSONObject requestBody) throws IOException {
        RequestBody body = RequestBody.create(JSON, requestBody.toJSONString());
        Request request = new Request.Builder().url(url).post(body).build();
        Response response = client.newCall(request).execute();
        return JSONObject.parseObject(response.body().string());
    }

    private JSONObject postForm(String url, Map<String, String> requestBody) throws IOException {
        FormBody.Builder builder = new FormBody.Builder();

        for (String key : requestBody.keySet()) {
            builder.add(key, requestBody.get(key));
        }

        FormBody body = builder.build();
        Request request = new Request.Builder().url(url).post(body).build();
        Response response = client.newCall(request).execute();
        return JSONObject.parseObject(response.body().string());
    }

    private String getNonceStr() {
        return System.currentTimeMillis() + RandomStringUtils.random(11, true, true);
    }

    private String signAkaolParams(String nonceStr) {
        return DigestUtils.md5Hex(AKAOL_CUSTOMER + AKAOL_SECRET + nonceStr);
    }

    public static void main(String[] args) {
        System.out.println(System.currentTimeMillis());
    }

}
