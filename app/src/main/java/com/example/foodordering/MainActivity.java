package com.example.foodordering;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

import com.example.foodordering.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {


    ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        replacefragment(new BlankFragment());


        binding.bootm.setOnNavigationItemSelectedListener(item -> {

            if (item.getItemId()==R.id.bottom_home){
                replacefragment(new BlankFragment());
            } else if (item.getItemId()==R.id.bottom_search){
                replacefragment(new BlankFragment2());

            }else if (item.getItemId()==R.id.bottom_settings){
                replacefragment(new BlankFragment3());

            }else if (item.getItemId()==R.id.bottom_person){
                replacefragment(new BlankFragment4());

            }

            return true;
        });





    }


    private void replacefragment(Fragment f){
        FragmentManager fragmentManager=getSupportFragmentManager();
        FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.fragment,f);
        fragmentTransaction.commit();
    }


}