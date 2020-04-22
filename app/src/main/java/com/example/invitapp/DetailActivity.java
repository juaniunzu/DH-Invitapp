package com.example.invitapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    private TextView activityDetailNombreRecibido;
    public static final String NOMBRE = "nombre";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        activityDetailNombreRecibido = findViewById(R.id.activityDetailNombreRecibido);

        Intent desdeFragment = getIntent();
        Bundle bundleDesdeFragment = desdeFragment.getExtras();

        String nombre = bundleDesdeFragment.getString(NOMBRE);

        activityDetailNombreRecibido.setText(nombre);



    }
}
