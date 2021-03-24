package com.example.componete_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("mensaje","Estoy en onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("mensaje","Estoy en onStart");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("mensaje","Estoy en onStop");
    }

    @Override
    protected void onPostResume() {
        super.onPostResume();
        Log.d("mensaje","Estoy en onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("mensaje","Estoy en onPause");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("mensaje","Estoy en onDistroy");
    }
    public void siguiente(View v){
        Intent i=new Intent(this,SegundaActivity.class);
        i.putExtra("apellido","Lopez");
        i.putExtra("dni", 12345);
        startActivity(i);


    }
}