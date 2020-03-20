package com.example.fragment_using_rl;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


public class ThirdFragment extends Fragment {

    private Button button;
    EditText e9,e10,e11,e12;


    public ThirdFragment() {

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_third, container, false);
        e9 = view.findViewById(R.id.et_employeename);
        e10 = view.findViewById(R.id.et_companyname);
        e11 = view.findViewById(R.id.et_salary);
        e12 = view.findViewById(R.id.et_designation);

        button=view.findViewById(R.id.b3);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String employeename = e9.getText().toString();
                String companyname = e10.getText().toString();
                String salary = e11.getText().toString();
                String designation = e12.getText().toString();

                Allfragments allfragments = getArguments().getParcelable("Allfragments");

                allfragments.setEmployeename(employeename);
                allfragments.setCompanyname(companyname);
                allfragments.setSalary(salary);
                allfragments.setDesignation(designation);

                Bundle bundle =new Bundle();
                bundle.putParcelable("Allfragments",allfragments);
                DisplayFragment displayFragment =new DisplayFragment();
                displayFragment.setArguments(bundle);
                MainActivity.fragmentManager.beginTransaction().replace(R.id.main_fragment_container,displayFragment,null).addToBackStack(null).commit();
            }
        });

        return view;
    }

}
