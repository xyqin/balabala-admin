package com.newhead.barablah.resource;

import com.newhead.rudderframework.core.config.GlobalConfig;
import com.newhead.rudderframework.core.web.api.ApiEntity;
import com.newhead.rudderframework.core.web.api.ApiStatus;
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
@Api(tags = "文件", description = "文件API")
@RestController
@RequestMapping("/files")
public class FileController {

    private static final String[] SUPPORTED_AUDIO_EXTENSIONS = {"mp3"};

    private static final String[] SUPPORTED_VIDEO_EXTENSIONS = {"mp4", "flv"};

    @Autowired
    private GlobalConfig config;

    @ApiOperation(value = "上传文件", notes = "上传文件")
    @RequestMapping(value = "/upload", method = RequestMethod.POST)
    public ApiEntity<String> uploadImage(@RequestParam("file") Part file) throws IOException {
        int fileSizeInKB = BigInteger.valueOf(file.getSize()).divide(BigInteger.valueOf(1024)).intValue();
        String submittedFilename = file.getSubmittedFileName();
        String filePath = null;

        if (FilenameUtils.isExtension(submittedFilename, SUPPORTED_AUDIO_EXTENSIONS)) {
            filePath = "/audio/";
        } else if (FilenameUtils.isExtension(submittedFilename, SUPPORTED_VIDEO_EXTENSIONS)) {
            filePath = "/video/";
        } else {
            return new ApiEntity(ApiStatus.STATUS_400.getCode(), "不支持的文件类型");
        }

        String currentDate = null;
        String filename = null;

        try {
            byte[] bytes = IOUtils.toByteArray(file.getInputStream());
            currentDate = DateFormatUtils.format(new Date(), "yyyyMMdd");
            String localPath = config.storepath + filePath + currentDate + "/";
            filename = DigestUtils.md5Hex(bytes) + "." + FilenameUtils.getExtension(submittedFilename);
            File local = new File(localPath + filename);
            FileUtils.writeByteArrayToFile(local, bytes);
        } catch (IOException e) {
            return new ApiEntity<>(ApiStatus.STATUS_500.getCode(), e.getMessage());
        }

        String link = config.storelink + filePath + currentDate + "/" + filename;
        return new ApiEntity<>(link);
    }

}
