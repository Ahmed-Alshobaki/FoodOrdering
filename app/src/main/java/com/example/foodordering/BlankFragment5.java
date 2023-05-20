package com.example.foodordering;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.foodordering.databinding.FragmentBlank2Binding;


public class BlankFragment5 extends Fragment {

    FragmentBlank2Binding  binding;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding =FragmentBlank2Binding.inflate(inflater, container, false);
        return binding.getRoot();
    }
}