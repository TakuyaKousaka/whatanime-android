package com.takuya.whatanimu.core;

import com.maddog05.maddogutilities.callback.Callback;
import com.takuya.whatanimu.core.entity.SearchAnimeResponse;

public interface LogicApp {
    boolean isFirstTutorial();

    void finishFirstTutorial();

    void searchAnime(String encoded, Callback<SearchAnimeResponse> callback);
}
