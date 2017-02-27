package com.example.administrator.gitapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.e("hhhh","hhhh");
        Toast.makeText(getApplicationContext(),"hhhhh",Toast.LENGTH_LONG).show();
    }
}
