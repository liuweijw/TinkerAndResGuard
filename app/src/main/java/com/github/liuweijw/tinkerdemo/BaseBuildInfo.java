package com.github.liuweijw.tinkerdemo;

/**
 * Created by zhangshaowen on 16/6/30.
 * we add BaseBuildInfo to loader pattern, so it won't change with patch!
 */
public class BaseBuildInfo {
    public static String TEST_MESSAGE = "I won't change with tinker patch!";
    public static String BASE_TINKER_ID = BuildConfig.TINKER_ID;
}
