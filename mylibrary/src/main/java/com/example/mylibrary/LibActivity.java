package com.example.mylibrary;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.mylibrary2.Lib2Activity;

public class LibActivity extends AppCompatActivity {

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lib);
        TextView textView = findViewById(R.id.textView);

        //textView.setText(getString(R.string.lib_name) + "-" + getString(R.string.lib2_name));
        textView.setText(getString(R.string.lib_name) + "-" + getString(com.example.mylibrary2.R.string.lib2_name));

        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LibActivity.this, Lib2Activity.class));
            }
        });
    }
}