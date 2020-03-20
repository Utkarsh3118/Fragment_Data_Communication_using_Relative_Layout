package com.example.fragment_using_rl;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


public class FirstFragment extends Fragment {

    private Button button;
    private EditText e1,e2,e3,e4;

    public FirstFragment() {

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_first, container, false);

        e1 = view.findViewById(R.id.et_username);
        e2 = view.findViewById(R.id.et_email);
        e3 = view.findViewById(R.id.et_address);
        e4 = view.findViewById(R.id.et_phno);


        button = view.findViewById(R.id.b1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = e1.getText().toString();
                String email = e2.getText().toString();
                String address = e3.getText().toString();
                String phoneno = e4.getText().toString();

                Allfragments allfragments = new Allfragments();

                allfragments.setName(name);
                allfragments.setEmail(email);
                allfragments.setAddress(address);
                allfragments.setPhoneno(phoneno);

                Bundle bundle = new Bundle();
                bundle.putParcelable("Allfragments",allfragments);
                SecondFragment secondFragment = new SecondFragment();
                secondFragment.setArguments(bundle);

                MainActivity.fragmentManager.beginTransaction().replace(R.id.main_fragment_container,secondFragment,null).addToBackStack(null).commit();
            }
        });


        return view;
    }

}
