package com.pscube.fragment_main;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.location.OnNmeaMessageListener;
import android.os.Bundle;
import android.widget.FrameLayout;

public class MainActivity extends AppCompatActivity implements fragmentOne.onMessageSendListner {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        if (findViewById(R.id.main_container) !=null){
            if (savedInstanceState!=null){
                return;
            }

            fragmentOne fragmentOne = new fragmentOne();
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.main_container,fragmentOne,null)
                    .commit();



        }



    }

    @Override
    public void onMessageSend(String message) {

        display_fragment display_fragment= new display_fragment();
        Bundle bundle = new Bundle();
        bundle.putString("message",message);
        display_fragment.setArguments(bundle);

        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction()
                .replace(R.id.main_container,display_fragment,null);
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();


    }
}
