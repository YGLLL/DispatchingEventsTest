package cn.ewhale.dispatchingeventstest;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;

/**
 * create by ygl
 * 2019/5/9 8:12
 */
public class ViewPageEx extends ViewPager {
    private static final String TAG = "ViewPageEx";
    public ViewPageEx(@NonNull Context context) {
        super(context);
    }

    public ViewPageEx(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        if(ev.getAction()==MotionEvent.ACTION_DOWN) {
            return false;
        }else {
            return true;
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent ev) {
        switch (ev.getAction()){
            case MotionEvent.ACTION_DOWN:
                Log.e(TAG,"MotionEvent.ACTION_DOWN");
                break;
            case MotionEvent.ACTION_MOVE:
                Log.e(TAG,"MotionEvent.ACTION_MOVE");
                break;
            case MotionEvent.ACTION_UP:
                Log.e(TAG,"MotionEvent.ACTION_UP");
                break;
            case MotionEvent.ACTION_CANCEL:
                Log.e(TAG,"MotionEvent.ACTION_CANCEL");
                break;
        }
        return super.onTouchEvent(ev);
    }
}
