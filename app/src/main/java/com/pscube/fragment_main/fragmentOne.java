package com.pscube.fragment_main;


import android.app.Activity;
import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


/**
 * A simple {@link Fragment} subclass.
 */
public class fragmentOne extends Fragment {
    Button button;
    EditText editText;
    onMessageSendListner messageSendListner;


    public interface onMessageSendListner{

        public void onMessageSend(model model);


    }


    public fragmentOne() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_one, container, false);

        button= view.findViewById(R.id.btn);
        editText= view.findViewById(R.id.EditText);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              model model = new model();
              model.setName(editText.getText().toString());
                messageSendListner.onMessageSend(model);
            }
        });


            return view;

    }


    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
       if (context instanceof onMessageSendListner) {
           messageSendListner = (onMessageSendListner) context;
       }




    }

    @Override
    public void onResume() {
        super.onResume();
        editText.setText("");
        }

}
