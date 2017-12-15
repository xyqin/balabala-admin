package com.newhead.sc.modules.scdevice.ext;

import com.google.common.collect.Lists;
import com.newhead.rudderframework.modules.LabelValueItem;
import com.newhead.sc.modules.scdevice.base.AbstractScDeviceService;
import com.newhead.sc.modules.scdevice.base.repository.dao.ScDeviceMapper;
import com.newhead.sc.modules.scdevice.base.repository.entity.ScDevice;
import com.newhead.sc.modules.scdevice.ext.protocol.SimpleScDeviceQueryResponse;
import com.newhead.sc.modules.scdevicesignup.base.repository.dao.ScDeviceSignupMapper;
import com.newhead.sc.modules.scdevicesignup.base.repository.entity.ScDeviceSignup;
import com.newhead.sc.modules.scdevicesignup.base.repository.entity.ScDeviceSignupExample;
import io.swagger.annotations.Api;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * RudderFramework 自动生成
 * 设备服务
 * 2017年12月13日 12:17:48
 */
@Api(tags = "设备", description = "相关的API")
@Service
public class SimpleScDeviceService extends AbstractScDeviceService {

    @Autowired
    private ScDeviceMapper mapper;

    @Autowired
    private ScDeviceSignupMapper deviceSignupMapper;

    @Override
    protected ScDeviceMapper getMapper() {
        return this.mapper;
    }


    @Override
    protected void saveOrUpdate(ScDevice entity) {

    }

    /**
     * 查询
     *
     * @param request
     * @return list
     */
    public List<SimpleScDeviceQueryResponse> queryListByPhoneNumber(String phoneNumber) {
        List<SimpleScDeviceQueryResponse> results = new ArrayList<SimpleScDeviceQueryResponse>();

        ScDeviceSignupExample signupExample = new ScDeviceSignupExample();
        signupExample.createCriteria().andPhoneNumberEqualTo(phoneNumber).andDeletedEqualTo(Boolean.FALSE);
        List<ScDeviceSignup> signups = deviceSignupMapper.selectByExample(signupExample);
        List<ScDevice> devices = Lists.newArrayList();

        for (ScDeviceSignup signup : signups) {
            ScDevice device = getMapper().selectByPrimaryKey(signup.getDeviceId());
            devices.add(device);
        }

        //构造查询对象
        convertEntityToResponse(devices, results);
        return results;
    }

    /**
     * 对象转换
     *
     * @param entitys
     * @param results
     */
    private void convertEntityToResponse(List<ScDevice> entitys, List<SimpleScDeviceQueryResponse> results) {
        for (ScDevice entity : entitys) {
        }
        //第一组
        for (ScDevice entity : entitys) {
            SimpleScDeviceQueryResponse response = new SimpleScDeviceQueryResponse();
            BeanUtils.copyProperties(entity, response);
            LabelValueItem typeEnum = response.getTypeEnum();
            typeEnum.setName("type");
            typeEnum.setLabel(com.newhead.sc.modules.scdevice.ScDeviceTypeEnum.getLabel(entity.getType()));
            typeEnum.setValue(entity.getType());
            typeEnum.setChecked(true);
            results.add(response);
        }
    }

}
