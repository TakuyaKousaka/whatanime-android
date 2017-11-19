package com.takuya.whatanimu.core;

import android.content.Context;

import com.maddog05.maddogutilities.image.ImageLoader;
import com.takuya.whatanimu.core.data.LogicPreferenceSharedPref;
import com.takuya.whatanimu.core.data.LogicPreferences;
import com.takuya.whatanimu.core.image.GlideLoader;
import com.takuya.whatanimu.core.network.LogicNetwork;
import com.takuya.whatanimu.core.network.LogicNetworkRetrofit;

public class Logic {
    public static LogicApp get(Context context) {
        return LogicAppImpl.newInstace(context, getNetwork(), getPreferences(context));
    }

    public static ImageLoader imageLoader(Context context) {
        return GlideLoader.create();
    }

    private static LogicPreferences getPreferences(Context context) {
        return LogicPreferenceSharedPref.newInstance(context);
    }

    private static LogicNetwork getNetwork() {
        return LogicNetworkRetrofit.newInstance();
    }
}
