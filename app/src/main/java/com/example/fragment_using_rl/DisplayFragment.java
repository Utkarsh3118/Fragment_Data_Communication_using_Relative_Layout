package com.example.fragment_using_rl;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class DisplayFragment extends Fragment {
    TextView t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_display, container, false);
        t1= view.findViewById(R.id.tv1);
        t2= view.findViewById(R.id.tv2);
        t3= view.findViewById(R.id.tv3);
        t4= view.findViewById(R.id.tv4);
        t5= view.findViewById(R.id.tv5);
        t6= view.findViewById(R.id.tv6);
        t7= view.findViewById(R.id.tv7);
        t8= view.findViewById(R.id.tv8);
        t9= view.findViewById(R.id.tv9);
        t10= view.findViewById(R.id.tv10);
        t11= view.findViewById(R.id.tv11);
        t12= view.findViewById(R.id.tv12);

        if(getArguments().containsKey("Allfragments")){

            Allfragments allfragments = getArguments().getParcelable("Allfragments");
            t1.setText(allfragments.getName());
            t2.setText(allfragments.getEmail());
            t3.setText(allfragments.getAddress());
            t4.setText(allfragments.getPhoneno());
            t5.setText(allfragments.getHealthName());
            t6.setText(allfragments.getBloodGroup());
            t7.setText(allfragments.getWeight());
            t8.setText(allfragments.getContactno());
            t9.setText(allfragments.getEmployeename());
            t10.setText(allfragments.getCompanyname());
            t11.setText(allfragments.getSalary());
            t12.setText(allfragments.getDesignation());

        }

        return view;

    }

}
