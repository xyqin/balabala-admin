package com.newhead.barablah.resource;

import com.newhead.rudderframework.core.config.GlobalConfig;
import com.newhead.rudderframework.core.web.api.ApiEntity;
import com.newhead.rudderframework.core.web.api.ApiStatus;
import com.newhead.rudderframework.core.web.controller.FileController;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.commons.codec.digest.DigestUtils;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;
import org.apache.commons.io.IOUtils;
import org.apache.commons.lang3.time.DateFormatUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.Part;
import java.io.File;
import java.io.IOException;
import java.math.BigInteger;
import java.util.Date;

/**
 * Created by xyqin on 16/5/25.
 */
@Api(tags = "视频", description = "视频API")
@RestController
@RequestMapping("/video")
public class VideoController extends FileController {

    private static final String[] SUPPORTED_IMAGE_EXTENSIONS = {"mp4", "flv"};

    private static final int MAX_IMAGE_SIZE_KB = 5000;

    @Override
    protected String[] getSupportedExtensions() {
        return SUPPORTED_IMAGE_EXTENSIONS;
    }

    @Override
    protected int getMaxSize() {
        return MAX_IMAGE_SIZE_KB;
    }

    @Autowired
    private GlobalConfig config;

    @ApiOperation(value = "上传视频", notes = "上传视频")
    @RequestMapping(value = "/upload", method = RequestMethod.POST)
    public ApiEntity<String> uploadImage(@RequestParam("file") Part file) throws IOException {
        int fileSizeInKB = BigInteger.valueOf(file.getSize()).divide(BigInteger.valueOf(1024)).intValue();
        String submittedFilename = file.getSubmittedFileName();

        if (!FilenameUtils.isExtension(submittedFilename, SUPPORTED_IMAGE_EXTENSIONS)) {
            return new ApiEntity(ApiStatus.STATUS_400.getCode(), "不支持的文件类型");
        }

        String currentDate = null;
        String filename = null;

        try {
            byte[] bytes = IOUtils.toByteArray(file.getInputStream());
            currentDate = DateFormatUtils.format(new Date(), "yyyyMMdd");
            String localPath = config.storepath + "/video/" + currentDate + "/";
            filename = DigestUtils.md5Hex(bytes) + "." + FilenameUtils.getExtension(submittedFilename);
            File local = new File(localPath + filename);
            FileUtils.writeByteArrayToFile(local, bytes);
        } catch (IOException e) {
            return new ApiEntity<>(ApiStatus.STATUS_500.getCode(), e.getMessage());
        }

        String link = config.storelink + "/video/" + currentDate + "/" + filename;
        return new ApiEntity<>(link);
    }

}
