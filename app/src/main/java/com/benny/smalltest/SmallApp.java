package com.benny.smalltest;

import android.app.Application;
import net.wequick.small.Small;

/**
 * Created by yuanbb on 2017/10/17.
 */

public class SmallApp extends Application {

    public SmallApp() {
        Small.preSetUp(this);
    }

    @Override
    public void onCreate() {
        super.onCreate();
    }
}
