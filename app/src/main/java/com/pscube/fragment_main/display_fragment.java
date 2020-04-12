package com.pscube.fragment_main;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class display_fragment extends Fragment {
    TextView textView;


    public display_fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
      View view =  inflater.inflate(R.layout.fragment_display_fragment, container, false);

      textView=view.findViewById(R.id.display_text);

      Bundle bundle= getArguments();
      String string = bundle.getString("message");


     textView.setText(string);


      return  view;


    }

}
