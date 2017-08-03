package com.example.mmbabdul.packtmyapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("info", "my message here");
        Toast.makeText(this, "My first toast!", Toast.LENGTH_SHORT).show();
        Log.i("info", "done creating the app");
    }

    public void topClick(View v){
        Toast.makeText(this, "Top button clicked", Toast.LENGTH_SHORT).show();
        Log.i("info", "user clicked the top button");
    }

    public void bottomClick(View v){
        // Some random comment
        Toast.makeText(this, "Bottom button clicked", Toast.LENGTH_SHORT).show();
        Log.i("info", "user clicked the bottom button");
    }
}
