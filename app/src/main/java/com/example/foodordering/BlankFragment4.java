package com.example.foodordering;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.foodordering.databinding.FragmentBlank2Binding;

public class BlankFragment4 extends Fragment {
FragmentBlank2Binding binding;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        binding=FragmentBlank2Binding.inflate(getLayoutInflater());
        super.onCreate(binding.getRoot());

    }


}