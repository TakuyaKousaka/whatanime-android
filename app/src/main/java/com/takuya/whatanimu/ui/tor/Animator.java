package com.takuya.whatanimu.ui.tor;

import android.content.Context;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

import com.takuya.whatanimu.R;

public class Animator {
    public static Animation hideAnimation() {
        AlphaAnimation alphaAnimation = new AlphaAnimation(1, 0);
        alphaAnimation.setDuration(300);
        alphaAnimation.setFillAfter(true);
        return alphaAnimation;
    }

    public static Animation showFab(Context context) {
        return AnimationUtils.loadAnimation(context, R.anim.fab_open);
    }

    public static Animation hideFab(Context context) {
        return AnimationUtils.loadAnimation(context, R.anim.fab_close);
    }
}
