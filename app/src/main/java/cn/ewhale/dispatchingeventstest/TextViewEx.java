package cn.ewhale.dispatchingeventstest;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * create by ygl
 * 2019/5/9 8:31
 */
public class TextViewEx extends android.support.v7.widget.AppCompatTextView {

    private ViewGroup parenet;

    public TextViewEx(Context context) {
        this(context,null);
    }

    public TextViewEx(Context context, AttributeSet attrs) {
        this(context, attrs,0);
    }

    public TextViewEx(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public void setParenet(ViewGroup parenet) {
        this.parenet = parenet;
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        switch (event.getAction()){
            case MotionEvent.ACTION_DOWN:
                parenet.requestDisallowInterceptTouchEvent(false);
                break;
            case MotionEvent.ACTION_MOVE:
                break;
            case MotionEvent.ACTION_UP:
                break;
            case MotionEvent.ACTION_CANCEL:
                break;
        }
        return true;
    }
}
