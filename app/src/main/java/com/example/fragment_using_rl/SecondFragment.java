package com.example.fragment_using_rl;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


public class SecondFragment extends Fragment {

    private Button button;
    EditText e5,e6,e7,e8;

    public SecondFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_second, container, false);
        e5= view.findViewById(R.id.et_username_health);
        e6= view.findViewById(R.id.et_blood_group);
        e7= view.findViewById(R.id.et_weight);
        e8= view.findViewById(R.id.et_contactno);

        button = view.findViewById(R.id.b2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String healthName = e5.getText().toString();
                String bloodGroup = e6.getText().toString();
                String weight = e7.getText().toString();
                String contactno = e8.getText().toString();

                Allfragments allfragments = getArguments().getParcelable("Allfragments");

                allfragments.setHealthName(healthName);
                allfragments.setBloodGroup(bloodGroup);
                allfragments.setWeight(weight);
                allfragments.setContactno(contactno);

                Bundle bundle = new Bundle();
                bundle.putParcelable("Allfragments",allfragments);
                ThirdFragment thirdFragment = new ThirdFragment();
                thirdFragment.setArguments(bundle);
                MainActivity.fragmentManager.beginTransaction().replace(R.id.main_fragment_container, thirdFragment, null).addToBackStack(null).commit();
            }
        });
        return view;
    }
}