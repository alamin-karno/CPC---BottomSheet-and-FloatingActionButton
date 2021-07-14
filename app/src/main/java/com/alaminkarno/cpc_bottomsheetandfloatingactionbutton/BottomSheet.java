package com.alaminkarno.cpc_bottomsheetandfloatingactionbutton;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.google.android.material.bottomsheet.BottomSheetDialogFragment;

public class BottomSheet extends BottomSheetDialogFragment {

    EditText numberET,passwordET;
    Button loginBTN;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.bottom_sheet_login,container,false);

        numberET = view.findViewById(R.id.numberET);
        passwordET = view.findViewById(R.id.passwordET);
        loginBTN = view.findViewById(R.id.loginBTN);

        loginBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String number = numberET.getText().toString();
                String password = passwordET.getText().toString();


                Toast.makeText(getActivity(), "Number: "+number+"\nPassword: "+password, Toast.LENGTH_SHORT).show();

            }
        });


        return view;
    }
}
