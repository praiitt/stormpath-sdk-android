package com.stormpath.sdk.StormpathLoginWithStyle;

import com.stormpath.sdk.Stormpath;
import com.stormpath.sdk.StormpathConfiguration;
import com.stormpath.sdk.StormpathLogger;

import android.app.Application;

public class StormpathExampleApp extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        if (BuildConfig.DEBUG) {
            // we only want to show the logs in debug builds, for easier debugging
            Stormpath.setLogLevel(StormpathLogger.VERBOSE);
        }

        // initialize stormpath
        StormpathConfiguration stormpathConfiguration = new StormpathConfiguration.Builder()
                .baseUrl("http://172.16.0.179:3000")
                .build();
        Stormpath.init(this, stormpathConfiguration);
    }
}
