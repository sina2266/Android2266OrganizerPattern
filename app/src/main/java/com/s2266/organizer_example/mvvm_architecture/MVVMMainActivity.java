package com.s2266.organizer_example.mvvm_architecture;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.s2266.organizer_example.R;

public class MVVMMainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mvvn_main_activity);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container, MVVMMainFragment.newInstance())
                    .commitNow();
        }
    }
}
