package com.pscube.fragment_main;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class display_fragment extends Fragment {
    TextView textView;
String start;


    public display_fragment() {
        // Required empty public constructor
    }




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
      View view =  inflater.inflate(R.layout.fragment_display_fragment, container, false);

      textView=view.findViewById(R.id.display_text);
      textView.setText(start);

      return  view;
    }
    public void display(model model){
        start=model.getName();
        //Log.d("TAG1", "display: "+start);
    }


}
