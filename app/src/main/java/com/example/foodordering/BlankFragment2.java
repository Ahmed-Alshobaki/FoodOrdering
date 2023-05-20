package com.example.foodordering;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.foodordering.databinding.FragmentBlank2Binding;

import java.util.ArrayList;


public class BlankFragment2 extends Fragment {

    FragmentBlank2Binding binding;


  @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

      binding=FragmentBlank2Binding.inflate(inflater, container, false);

      return binding.getRoot();



    }
}