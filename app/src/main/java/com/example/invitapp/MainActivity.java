package com.example.invitapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    //metodo para pegar fragment
    private void pegarFragment(Fragment fragmentAPegar) {

        //creo fragment manager
        FragmentManager fragmentManager = getSupportFragmentManager();

        //creo transaction con el manager
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        //agrego el fragment a pegar al container del xml main
        fragmentTransaction.add(R.id.activityMainFrameLayoutContainer, fragmentAPegar);

        //no se que hace esto, ver
        fragmentTransaction.addToBackStack(null);

        //commitear
        fragmentTransaction.commit();

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pegarFragment(new InvitadosFragment());



    }
}
