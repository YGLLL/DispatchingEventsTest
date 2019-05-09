package cn.ewhale.dispatchingeventstest;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * create by ygl
 * 2019/5/4 11:25
 */
public class TestFragment extends Fragment {

    public static final TestFragment getInstance(int num){
        Bundle bundle=new Bundle();
        bundle.putInt("num",num);
        TestFragment testFragment=new TestFragment();
        testFragment.setArguments(bundle);
        return testFragment;
    }

    private TextViewEx mTv;
    private RecyclerViewEx mRv;
    private int num=0;
    private View mView;
    private RvAdapter mAdapter;
    private List<String> mData=new ArrayList<>();

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        mView=LayoutInflater.from(getActivity()).inflate(R.layout.fragment_test,container,false);
        return mView;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        num=getArguments().getInt("num",-1);
        mTv=(TextViewEx) findViewById(R.id.tv);
        mTv.setParenet((ViewGroup) getActivity().findViewById(R.id.vp));
        mTv.setText(num+"");

        mRv=(RecyclerViewEx)findViewById(R.id.rv);
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(getActivity());
        linearLayoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
        mRv.setLayoutManager(linearLayoutManager);

        initData();
        mAdapter=new RvAdapter(mData);

        mRv.setAdapter(mAdapter);
    }

    private void initData() {
        for (int i = 0; i < 20; i++) {
            mData.add(i+"");
        }
    }

    protected View findViewById(int id){
        return mView.findViewById(id);
    }
}
