package com.example.avjindersinghsekhon.minimaltodo.Analytics;

import android.app.Application;


import java.util.Map;

public class AnalyticsApplication extends Application {

    private static final boolean IS_ENABLED = true;


    public void send(Object screenName) {

    }

    private void send(Object screenName, Map<String, String> params) {
        if (IS_ENABLED) {
        }
    }

    private String getClassName(Object o) {
        Class c = o.getClass();
        while (c.isAnonymousClass()) {
            c = c.getEnclosingClass();
        }
        return c.getSimpleName();

    }

    public void send(Object screenName, String category, String action) {
    }

    public void send(Object screenName, String category, String action, String label) {
    }
}
