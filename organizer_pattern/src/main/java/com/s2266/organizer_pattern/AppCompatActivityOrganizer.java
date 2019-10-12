package com.s2266.organizer_pattern;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;


/**
 * Created by Sina2266 on 6/25/2017 AD.
 */

abstract class AppCompatActivityOrganizer extends AppCompatActivity {
    Boolean is_2266_called = false;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        _2266_();
    }

    @Override
    protected void onResume() {
        super.onResume();
        //refreshData()
    }

    private void _2266_() {
        setupElements();
        if (loadData())
            setupElementsWithData(is_2266_called);
        setupOnClick();
        setupListener();
        is_2266_called = true;
    }

    public void refreshData() {
        if (loadDynamicData(is_2266_called))
            setupElementsWithData(is_2266_called);
    }

    public void refreshViewOnly(){
        setupElementsWithData(is_2266_called);
    }

    private Boolean loadData() {
        loadStaticData();
        return loadDynamicData(is_2266_called);
    }

    abstract void setupElements();
    abstract void loadStaticData();
    abstract Boolean loadDynamicData(Boolean is_2266_called);
    abstract void setupElementsWithData(Boolean is_2266_called);
    abstract void setupOnClick();
    abstract void setupListener();

}
