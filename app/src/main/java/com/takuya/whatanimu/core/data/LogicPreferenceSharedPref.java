package com.takuya.whatanimu.core.data;

import android.content.Context;
import android.content.SharedPreferences;

public class LogicPreferenceSharedPref implements LogicPreferences {

    private static final String PREFERENCE_MAIN = "com.takuya.whatanimu_preferenceMain";

    private static final String TUTORIAL_FIRST_TIME = "isFirstTutorial";

    private Context context;

    private LogicPreferenceSharedPref(Context context) {
        this.context = context;
    }

    public static LogicPreferenceSharedPref newInstance(Context context) {
        return new LogicPreferenceSharedPref(context);
    }

    private SharedPreferences get() {
        return context.getSharedPreferences(PREFERENCE_MAIN, Context.MODE_PRIVATE);
    }

    @Override
    public boolean isFirstTutorial() {
        SharedPreferences preferences = get();
        return preferences.getBoolean(TUTORIAL_FIRST_TIME, true);
    }

    @Override
    public void finishFirstTutorial() {
        SharedPreferences preferences = get();
        preferences.edit().putBoolean(TUTORIAL_FIRST_TIME, false).commit();
    }
}
