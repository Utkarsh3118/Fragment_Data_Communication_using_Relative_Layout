package com.example.fragment_using_rl;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    public static FragmentManager fragmentManager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fragmentManager = getSupportFragmentManager();
        if(findViewById(R.id.main_fragment_container)!=null){

            if(savedInstanceState!=null){
                return;
            }
            FragmentTransaction fragmentTransaction =fragmentManager.beginTransaction();
            FirstFragment firstFragment =new FirstFragment();
            fragmentTransaction.add(R.id.main_fragment_container,firstFragment,null);
            fragmentTransaction.commit();
        }
    }
}
