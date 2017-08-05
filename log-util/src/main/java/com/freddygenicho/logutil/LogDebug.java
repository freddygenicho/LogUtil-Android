package com.freddygenicho.logutil;

import android.util.Log;


public class LogDebug {
    private static final String TAG = LogDebug.class.getSimpleName();

    public static void log(String message) {
        Log.e(TAG, message);
    }
}
