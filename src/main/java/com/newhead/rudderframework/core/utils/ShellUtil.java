package com.newhead.rudderframework.core.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by ling on 2017/7/29.
 */
public class ShellUtil {
    private static final Logger logger = LoggerFactory.getLogger(ShellUtil.class);

    /**
     *
     * @param shellString
     */
    public static void callShell(String shellString) throws Exception {
        try {
            Process process = Runtime.getRuntime().exec(new String[]{"/bin/sh","-c",shellString});
            int exitValue = process.waitFor();
            if (0 != exitValue) {
                logger.error("call shell failed. error code is :" + exitValue);

                throw new Exception();
            }
        } catch (Throwable e) {
            logger.error("call shell failed. " + e);
            throw new Exception();

        }
    }


    public static int callShells(String[] shellString) throws Exception {
        int exitValue = 0;
        try {
            Process process = Runtime.getRuntime().exec(shellString);
            exitValue = process.waitFor();
            if (0 != exitValue) {
                logger.error("call shell failed. error code is :" + exitValue);

            }
        } catch (Throwable e) {
            logger.error("call shell failed. " + e);
            throw new Exception();

        }
        return exitValue;
    }
}
