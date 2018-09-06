package io.github.littleylv.basepopupdemo;

import android.app.Activity;
import android.view.View;
import android.view.animation.Animation;

import razerdp.basepopup.BasePopupWindow;

public class DemoPopupView extends BasePopupWindow {

    public DemoPopupView(Activity context) {
        super(context);

        setPopupWindowFullScreen(true);
        setBlurBackgroundEnable(true);
    }

    @Override
    protected Animation onCreateShowAnimation() {
        return getDefaultScaleAnimation();
    }

    @Override
    protected Animation onCreateDismissAnimation() {
        return getDefaultScaleAnimation(false);
    }

    @Override
    public View onCreateContentView() {
        return createPopupById(R.layout.view_demo_popup);
    }

    @Override
    protected View onInitDismissClickView() {
        return findViewById(R.id.button2);
    }
}
