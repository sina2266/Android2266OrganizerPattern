package com.s2266.organizer_pattern;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

/**
 * Created by Sina2266 on 6/29/2017 AD.
 */


abstract class FragmentOrganizer extends Fragment {

    //rootView is same as root
    public View rootView;
    public boolean is_2266_called = false;


    @Override
    public void onResume() {
        super.onResume();
        refreshData();
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

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        rootView = initRootView(inflater,container);
        _2266_();
        return rootView;
    }
    public abstract View initRootView(LayoutInflater inflater, ViewGroup container);
    public abstract void setupElements();
    public abstract void loadStaticData();
    abstract Boolean loadDynamicData(Boolean is_2266_called);
    abstract void setupElementsWithData(Boolean is_2266_called);
    public abstract void setupOnClick();
    abstract void setupListener();
    public View findViewById(int resId){
        return rootView.findViewById(resId);
    }

}
