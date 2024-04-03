package com.kemoi.tablayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//      Toolbar
        Toolbar toolbar = findViewById(R.id.toolbar);
        toolbar.setTitle(getResources().getString(R.string.app_name));
//      TabLayout
        TabLayout tabLayout = findViewById(R.id.tablayout);
//        TabItems
        TabItem tabChats = findViewById(R.id.tabChats);
        TabItem tabStatus = findViewById(R.id.tabStatus);
        TabItem tabCalls = findViewById(R.id.tabCalls);
//      ViewPager
        ViewPager viewPager = findViewById(R.id.viewPager);
    }
}