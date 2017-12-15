package com.newhead.rudderframework.tools.generator;

/**
 * Created by ling on 2017/4/25.
 */
public class RudderGeneratorFactory {
    public int version_1 = 1;

    public static RudderGenerator getRudderGenerator() {
        return new V1RudderGenerator();
    }
}
