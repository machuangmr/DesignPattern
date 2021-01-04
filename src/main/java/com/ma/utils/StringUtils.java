package com.ma.utils;

/**
 * 请添加注释
 *
 * @author <a href="mailto:macd@zjport.gov.cn">macd</a>
 * @version 3
 * @since 3.0
 */
public class StringUtils {
    public static boolean isBlank(String arg) {
        return  arg == null || arg.length() < 1;
    }

    public static boolean isNotBlank(String arg) {
        return !isBlank(arg);
    }
}
