package cn.ewhale.dispatchingeventstest;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;

/**
 * create by ygl
 * 2019/5/9 8:14
 */
public class RecyclerViewEx extends RecyclerView {
    public RecyclerViewEx(@NonNull Context context) {
        super(context);
    }

    public RecyclerViewEx(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public RecyclerViewEx(@NonNull Context context, @Nullable AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }
}
