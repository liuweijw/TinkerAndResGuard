package com.github.liuweijw.tinkerdemo;

import com.tencent.tinker.loader.app.TinkerApplication;
import com.tencent.tinker.loader.shareutil.ShareConstants;

public class MainApplication extends TinkerApplication {

    public MainApplication() {
        super(ShareConstants.TINKER_ENABLE_ALL, "com.github.liuweijw.tinkerdemo.MainApplicationLike",
                "com.tencent.tinker.loader.TinkerLoader", false);
    }

}
