package me.looorielovbb.babymonkey.home;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.MenuItem;

import me.looorielovbb.babymonkey.BaseActivity;
import me.looorielovbb.babymonkey.R;

public class MainActivity extends BaseActivity implements
        BottomNavigationView.OnNavigationItemSelectedListener,
        ViewPager.OnPageChangeListener
{

    ViewPager viewpager;
    BottomNavigationView naviview;
    Fragment[] fragments = new Fragment[2];

    FragmentPagerAdapter mFragmentPagerAdapter;
    FragmentManager mFragmentManager;

    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewpager = findViewById(R.id.viewpager);
        naviview = findViewById(R.id.naviview);

        naviview.setOnNavigationItemSelectedListener(this);

        mFragmentManager = getSupportFragmentManager();
        mFragmentPagerAdapter = new FragmentPagerAdapter(mFragmentManager)
        {
            @Override
            public Fragment getItem(int position)
            {
                return fragments[position];
            }

            @Override
            public int getCount()
            {
                return fragments.length;
            }
        };

        if (savedInstanceState == null)
        {
            fragments[0] = SampleFragment.newInstance("Fragment 0", "");
            fragments[1] = SampleFragment.newInstance("Fragment 1", "");
        }
        viewpager.setAdapter(mFragmentPagerAdapter);
        viewpager.setCurrentItem(0);
        viewpager.addOnPageChangeListener(this);
        viewpager.setOffscreenPageLimit(2);
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem)
    {
        switch (menuItem.getItemId())
        {
            case R.id.navi_home:
                viewpager.setCurrentItem(0, true);
                break;
            case R.id.navi_me:
                viewpager.setCurrentItem(1, true);
                break;
        }
        return true;
    }

    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels)
    {

    }

    @Override
    public void onPageSelected(int position)
    {
        switch (position)
        {
            case 0:
                naviview.setSelectedItemId(R.id.navi_home);
                break;
            case 1:
                naviview.setSelectedItemId(R.id.navi_me);
                break;
        }
    }

    @Override
    public void onPageScrollStateChanged(int state)
    {

    }
}
