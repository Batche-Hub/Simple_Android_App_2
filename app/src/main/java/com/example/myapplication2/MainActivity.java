package com.example.myapplication2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("msg", "Méthode onCreate activée");
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("msg", "Méthode onDestroy activée");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("msg", "Méthode onPause activée.");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("msg", "Méthode onStop activée");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("msg", "Méthode onResume activée");
    }




}
