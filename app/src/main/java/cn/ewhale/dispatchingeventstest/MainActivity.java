package cn.ewhale.dispatchingeventstest;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ViewPageEx mVp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mVp=findViewById(R.id.vp);
        mVp.setAdapter(pagerAdapter);
    }

    private FragmentPagerAdapter pagerAdapter=new FragmentPagerAdapter(getSupportFragmentManager()) {
        @Override
        public Fragment getItem(int i) {
            return TestFragment.getInstance(i);
        }

        @Override
        public int getCount() {
            return 3;
        }
    };
}
