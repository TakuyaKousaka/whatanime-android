package com.takuya.whatanimu.core.network;

import android.content.Context;
import android.support.v4.util.Pair;

import com.maddog05.maddogutilities.callback.Callback;
import com.takuya.whatanimu.core.entity.SearchDetail;

public interface LogicNetwork {
    void searchWithPhoto(Context context, String encodedImage, Callback<Pair<String, SearchDetail>> callback);
}
