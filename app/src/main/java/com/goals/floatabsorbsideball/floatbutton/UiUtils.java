package com.goals.floatabsorbsideball.floatbutton;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;

import androidx.core.view.ViewCompat;
import androidx.interpolator.view.animation.FastOutSlowInInterpolator;

import static android.view.View.GONE;
import static android.view.View.VISIBLE;

public class UiUtils {

    private UiUtils() {
    }

    /**
     * dp转px
     * @param context
     * @param dp
     * @return
     */
    public static int dpToPx(Context context, float dp) {
        DisplayMetrics metrics = context.getResources().getDisplayMetrics();
        return Math.round(TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, dp, metrics));
    }

    /**
     * px转dp
     * @param px
     * @return
     */
    public static int pxToDp(float px) {
        return Math.round(px / Resources.getSystem().getDisplayMetrics().density);
    }

    /**
     * Fade out animation.
     *
     * @param view view to animate.
     */
    public static void fadeOutAnim(final View view) {
        ViewCompat.animate(view).cancel();
        view.setAlpha(1F);
        view.setVisibility(VISIBLE);
        ViewCompat.animate(view)
                .alpha(0F)
                .withLayer()
                .setDuration(200)
                .setInterpolator(new FastOutSlowInInterpolator())
                .withEndAction(new Runnable() {
                    @Override
                    public void run() {
                        view.setVisibility(GONE);
                    }
                })
                .start();
    }

    /**
     * Fade out animation.
     *
     * @param view view to animate.
     */
    public static void fadeInAnim(final View view) {
        ViewCompat.animate(view).cancel();
        view.setAlpha(0);
        view.setVisibility(VISIBLE);
        ViewCompat.animate(view)
                .alpha(1F)
                .withLayer()
                .setDuration(200)
                .setInterpolator(new FastOutSlowInInterpolator())
                .start();
    }


    /**
     * 获取状态栏高度
     * @param context
     * @return
     */
    public static int getStatusBarHeight(Context context) {
        Resources resources = context.getResources();
        int resourceId = resources.getIdentifier("status_bar_height", "dimen", "android");
        int height = resources.getDimensionPixelSize(resourceId);
        return height;
    }

    public static int getScreenHeight(Context sContext) {
        return sContext.getResources().getDisplayMetrics().heightPixels;
    }

    public static int getScreenWidth(Context sContext) {
        return sContext.getResources().getDisplayMetrics().widthPixels;
    }

    /*
     * 获取控件高
     */
    public static int getHeight(View view) {
        int w = View.MeasureSpec.makeMeasureSpec(0, View.MeasureSpec.UNSPECIFIED);
        int h = View.MeasureSpec.makeMeasureSpec(0, View.MeasureSpec.UNSPECIFIED);
        view.measure(w, h);
        return (view.getMeasuredHeight());
    }

    /*
     * 获取控件宽
     */
    public static int getWidth(View view) {
        int w = View.MeasureSpec.makeMeasureSpec(0, View.MeasureSpec.UNSPECIFIED);
        int h = View.MeasureSpec.makeMeasureSpec(0, View.MeasureSpec.UNSPECIFIED);
        view.measure(w, h);
        return view.getMeasuredWidth();
    }

}
