package com.sun_asterisk.weather_03;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import com.sun_asterisk.weather_03.screen.home.HomeFragment;

public class MainActivity extends AppCompatActivity implements
        BottomNavigationView.OnNavigationItemSelectedListener {
    private HomeFragment mHomeFragment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mHomeFragment = new HomeFragment();
        initView();
    }

    private void initView() {
        BottomNavigationView navigation =
                (BottomNavigationView) findViewById(R.id.bottomnavigation);
        navigation.setOnNavigationItemSelectedListener(this);
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.fragmentReplace, new HomeFragment())
                .commit();
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        Fragment curentFragment = null;
        switch (menuItem.getItemId()) {
            case R.id.menuHome:
                curentFragment = mHomeFragment;
                break;
            case R.id.menuSearch:
                break;
            case R.id.menuSetting:
                break;
        }
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.fragmentReplace, curentFragment)
                .commit();
        return true;
    }
}
