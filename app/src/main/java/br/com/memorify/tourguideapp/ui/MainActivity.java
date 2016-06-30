package br.com.memorify.tourguideapp.ui;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import java.util.ArrayList;
import java.util.List;

import br.com.memorify.tourguideapp.R;
import br.com.memorify.tourguideapp.model.Place;

public class MainActivity extends AppCompatActivity {

    private final static String ATTRACTION_FRAGMENT_KEY = "ATTRACTION_FRAGMENT_KEY";
    private final static String BEACH_FRAGMENT_KEY = "BEACH_FRAGMENT_KEY";
    private final static String COMPANY_FRAGMENT_KEY = "COMPANY_FRAGMENT_KEY";
    private final static String RESTAURANTS_FRAGMENT_KEY = "RESTAURANTS_FRAGMENT_KEY";

    ViewPager viewPager;
    TabLayout tabLayout;
    Toolbar toolbar;

    Adapter pageAdapter;
    private PlaceListFragment attractionFragment;
    private PlaceListFragment beachFragment;
    private PlaceListFragment companyFragment;
    private PlaceListFragment restaurantsFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (savedInstanceState == null) {
            attractionFragment = PlaceListFragment.newInstance(Place.Type.ATTRACTION);
            beachFragment = PlaceListFragment.newInstance(Place.Type.BEACH);
            companyFragment = PlaceListFragment.newInstance(Place.Type.COMPANY);
            restaurantsFragment = PlaceListFragment.newInstance(Place.Type.RESTAURANTS);

        } else {
            attractionFragment = (PlaceListFragment) getSupportFragmentManager().getFragment(savedInstanceState, "ATTRACTION_FRAGMENT_KEY");
            beachFragment = (PlaceListFragment) getSupportFragmentManager().getFragment(savedInstanceState, "BEACH_FRAGMENT_KEY");
            companyFragment = (PlaceListFragment) getSupportFragmentManager().getFragment(savedInstanceState, "COMPANY_FRAGMENT_KEY");
            restaurantsFragment = (PlaceListFragment) getSupportFragmentManager().getFragment(savedInstanceState, "RESTAURANTS_FRAGMENT_KEY");
        }

        bindViews();
        setupToolbar();
        setupViewPager();
    }

    private void bindViews() {
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        viewPager = (ViewPager) findViewById(R.id.view_pager);
        tabLayout = (TabLayout) findViewById(R.id.tab_layout);
    }

    private void setupToolbar() {
        setSupportActionBar(toolbar);
        final ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayShowTitleEnabled(true);
        }
    }

    private void setupViewPager() {
        pageAdapter = new Adapter(getSupportFragmentManager());
        pageAdapter.addFragment(attractionFragment, getString(R.string.attractions));
        pageAdapter.addFragment(beachFragment, getString(R.string.beaches));
        pageAdapter.addFragment(companyFragment, getString(R.string.companies));
        pageAdapter.addFragment(restaurantsFragment, getString(R.string.restaurants));

        viewPager.setAdapter(pageAdapter);
        viewPager.setOffscreenPageLimit(4);
        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
                // do nothing
            }

            @Override
            public void onPageSelected(int position) {
                // do nothing
            }

            @Override
            public void onPageScrollStateChanged(int state) {
                // do nothing
            }
        });

        tabLayout.setupWithViewPager(viewPager);
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);

        FragmentManager fragmentManager = getSupportFragmentManager();
        if (fragmentManager != null) {
            if (attractionFragment != null && attractionFragment.isAdded()) {
                fragmentManager.putFragment(outState, ATTRACTION_FRAGMENT_KEY, attractionFragment);
            }
            if (beachFragment != null && beachFragment.isAdded()) {
                fragmentManager.putFragment(outState, BEACH_FRAGMENT_KEY, beachFragment);
            }
            if (companyFragment != null && companyFragment.isAdded()) {
                fragmentManager.putFragment(outState, COMPANY_FRAGMENT_KEY, companyFragment);
            }
            if (restaurantsFragment != null && restaurantsFragment.isAdded()) {
                fragmentManager.putFragment(outState, RESTAURANTS_FRAGMENT_KEY, restaurantsFragment);
            }
        }
    }

    static class Adapter extends FragmentPagerAdapter {

        private final List<Fragment> mFragments = new ArrayList<>();
        private final List<String> mFragmentTitles = new ArrayList<>();

        public Adapter(FragmentManager fm) {
            super(fm);
        }

        public void addFragment(Fragment fragment, String title) {
            mFragments.add(fragment);
            mFragmentTitles.add(title);
        }

        @Override
        public Fragment getItem(int position) {
            return mFragments.get(position);
        }

        @Override
        public int getCount() {
            return mFragments.size();
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return mFragmentTitles.get(position);
        }
    }

}
