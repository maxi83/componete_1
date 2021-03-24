package com.example.componete_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

public class SegundaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);
        Intent i=getIntent();
        String apellido=i.getStringExtra("apellido");
        int dni=i.getIntExtra("dni",-1);
        Log.d("mensaje",apellido+" "+dni);
    }
}