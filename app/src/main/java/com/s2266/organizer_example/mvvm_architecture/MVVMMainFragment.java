package com.s2266.organizer_example.mvvm_architecture;

import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.s2266.organizer_example.R;

public class MVVMMainFragment extends Fragment {

    private MVVMMainViewModel mViewModel;

    public static MVVMMainFragment newInstance() {
        return new MVVMMainFragment();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.mvvm_main_fragment, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = ViewModelProviders.of(this).get(MVVMMainViewModel.class);
        // TODO: Use the ViewModel
    }

}
