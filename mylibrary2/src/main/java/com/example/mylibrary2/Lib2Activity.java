package com.example.mylibrary2;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Lib2Activity extends AppCompatActivity {

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lib2);
        TextView textView = findViewById(R.id.textView);
        textView.setText(getString(R.string.lib2_name));
    }
}