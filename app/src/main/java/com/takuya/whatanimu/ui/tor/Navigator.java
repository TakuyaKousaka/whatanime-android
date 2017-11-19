package com.takuya.whatanimu.ui.tor;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.ActivityOptionsCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.maddog05.maddogutilities.android.AndroidVersions;
import com.takuya.whatanimu.R;
import com.takuya.whatanimu.core.entity.SearchDetail;
import com.takuya.whatanimu.ui.InformationActivity;
import com.takuya.whatanimu.ui.MainActivity;
import com.takuya.whatanimu.ui.VideoPreviewActivity;
import com.takuya.whatanimu.util.C;

/**
 * Created by andreetorres on 27/09/17.
 */

public class Navigator {
    public static void goToMain(AppCompatActivity activity, View view) {
        ActivityOptionsCompat aoc;
        if ((AndroidVersions.isLollipop())) {
            aoc = ActivityOptionsCompat.makeClipRevealAnimation(view,
                    0,
                    0,
                    view.getWidth(),
                    view.getHeight());
        } else {
            aoc = ActivityOptionsCompat.makeBasic();
        }
        Intent intent = new Intent(activity, MainActivity.class);
        ActivityCompat.startActivity(activity, intent, aoc.toBundle());
        ActivityCompat.finishAffinity(activity);
    }

    public static void goToPreviewVideo(AppCompatActivity activity, String url, SearchDetail.Doc doc) {
        ActivityOptionsCompat aoc;
        aoc = ActivityOptionsCompat.makeBasic();
        Intent intent = new Intent(activity, VideoPreviewActivity.class);
        Bundle bundle = new Bundle();
        bundle.putString(C.Extras.VIDEO_URL, url);
        bundle.putParcelable(C.Extras.DOC, doc);
        intent.putExtras(bundle);
        ActivityCompat.startActivity(activity, intent, aoc.toBundle());
    }

    public static void shareText(Context context, String text) {
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_TEXT, text);
        context.startActivity(Intent.createChooser(intent, context.getString(R.string.action_share)));
    }

    public static void goToInformation(Context context) {
        context.startActivity(new Intent(context, InformationActivity.class));
    }

    public static void goToWebBrowser(Context context, String url) {
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(url));
        context.startActivity(Intent.createChooser(intent, context.getString(R.string.indicator_choose_browser)));
    }
}
