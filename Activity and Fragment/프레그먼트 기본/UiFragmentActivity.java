package com.koo.hanmo.androidsampletest;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class UiFragmentActivity extends AppCompatActivity {

    private FragmentManager fm1,fm2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ui_fragment);

        fm1 = getSupportFragmentManager();
        Fragment fragment = fm1.findFragmentById(R.id.frame_uifragment_1);
        if(fragment == null){
            fragment = new UiFragment();
            fm1.beginTransaction().add(R.id.frame_uifragment_1,fragment).commit();
        }

        fm2 = getSupportFragmentManager();
        Fragment fragment2 = fm2.findFragmentById(R.id.frame_uifragment_2);
        if(fragment2 == null){
            fragment2 = new UiFragment2();
            fm2.beginTransaction().add(R.id.frame_uifragment_2,fragment2).commit();
        }

        // Change Fragment 1 to Fragment2, Fragment2 to Fragment1
        findViewById(R.id.btn_uifragment_change).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment f = fm1.findFragmentById(R.id.frame_uifragment_1);
                if(f instanceof  UiFragment2) {
                    fm1.beginTransaction().replace(R.id.frame_uifragment_1,new UiFragment()).commit();
                }else {
                    fm1.beginTransaction().replace(R.id.frame_uifragment_1, new UiFragment2()).commit();
                }

                f = fm2.findFragmentById(R.id.frame_uifragment_2);
                if(f instanceof  UiFragment) {
                    fm2.beginTransaction().replace(R.id.frame_uifragment_2, new UiFragment2()).commit();
                }else {
                    fm2.beginTransaction().replace(R.id.frame_uifragment_2, new UiFragment()).commit();
                }
            }
        });

    }
}
