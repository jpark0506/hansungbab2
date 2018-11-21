package com.djpark.parkjunhyuk.hansung;

import android.support.design.widget.NavigationView;
import android.support.design.widget.TabLayout;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;


public class MainActivity extends AppCompatActivity {


    private Toolbar toolbar;
    public static final String ANONYMOUS = "anonymous";
    private TabLayout tabLayout;
    private ViewPager viewPager;

    private String mUsername;
    private String mPhotoUrl;
    private static final String TAG = "MainActivity";

    private DrawerLayout mDrawerLayout;
    private NavigationView mNavigationView;
    private FragmentManager mFragmentManager;
    private FragmentTransaction mFragmentTransaction;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(com.djpark.parkjunhyuk.hansung.R.layout.main_activity);




        /**
         *Setup the DrawerLayout and NavigationView
         */
        mDrawerLayout = (DrawerLayout) findViewById(com.djpark.parkjunhyuk.hansung.R.id.drawerLayout);
        mNavigationView = (NavigationView) findViewById(com.djpark.parkjunhyuk.hansung.R.id.shitstuff) ;
        /**
         * Lets inflate the very first fragment
         * Here , we are inflating the TabFragment as the first Fragment
         */
        mFragmentManager = getSupportFragmentManager();
        mFragmentTransaction = mFragmentManager.beginTransaction();
        mFragmentTransaction.replace(com.djpark.parkjunhyuk.hansung.R.id.containerView,new TabFragment()).commit();
        mNavigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(MenuItem menuItem) {
                mDrawerLayout.closeDrawers();



                if (menuItem.getItemId() == com.djpark.parkjunhyuk.hansung.R.id.nav_item_every) {
                    FragmentTransaction fragmentTransaction = mFragmentManager.beginTransaction();
                    fragmentTransaction.replace(com.djpark.parkjunhyuk.hansung.R.id.containerView,new CalenderFragment()).commit();
                }

                if (menuItem.getItemId() == com.djpark.parkjunhyuk.hansung.R.id.nav_item_today) {
                    FragmentTransaction xfragmentTransaction = mFragmentManager.beginTransaction();
                    xfragmentTransaction.replace(com.djpark.parkjunhyuk.hansung.R.id.containerView,new TabFragment()).commit();
                }

                if(menuItem.getItemId()== com.djpark.parkjunhyuk.hansung.R.id.nav_item_information){
                    FragmentTransaction xfragmentTransaction = mFragmentManager.beginTransaction();
                    xfragmentTransaction.replace(com.djpark.parkjunhyuk.hansung.R.id.containerView,new MadeFragment()).commit();
                }

                return false;
            }

        });
        /**
         * Setup Drawer Toggle of the Toolbar
         */
        android.support.v7.widget.Toolbar toolbar = (android.support.v7.widget.Toolbar) findViewById(com.djpark.parkjunhyuk.hansung.R.id.toolbar);
        ActionBarDrawerToggle mDrawerToggle = new ActionBarDrawerToggle(this,mDrawerLayout, toolbar, com.djpark.parkjunhyuk.hansung.R.string.app_name,
                com.djpark.parkjunhyuk.hansung.R.string.app_name);


        mDrawerLayout.setDrawerListener(mDrawerToggle);

        mDrawerToggle.syncState();


        /**
         * Setup click events on the Navigation View Items.
         */

            tabLayout = (TabLayout) findViewById(R.id.tabDots);


    }

}
