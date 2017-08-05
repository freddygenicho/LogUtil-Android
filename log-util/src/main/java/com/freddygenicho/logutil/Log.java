package com.freddygenicho.logutil;


public class Log {
    private static final String TAG = Log.class.getSimpleName();

    public static void debug(String message) {
        android.util.Log.d(TAG, message);
    }

    public static void error(String error){
        android.util.Log.e(TAG, error);
    }
}
