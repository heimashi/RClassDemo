package com.example.rclassdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.mylibrary.LibActivity;

public class MainActivity extends AppCompatActivity {

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textView = findViewById(R.id.textView);
        TextView textView2 = findViewById(R.id.textView2);
        textView.setText(getString(R.string.app_name) + "-"
                + getString(R.string.lib_name) + "-" + getString(R.string.lib2_name));
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, LibActivity.class));
            }
        });
        textView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent().setClassName(MainActivity.this, "com.example.dynamicfeature.DfActivity"));
            }
        });
    }
}