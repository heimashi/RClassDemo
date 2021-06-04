package com.example.dynamicfeature;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class DfActivity extends AppCompatActivity {

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_df);
        TextView textView = findViewById(R.id.textView);

        textView.setText(getString(com.example.rclassdemo.R.string.app_name)
                + "-" + getString(com.example.rclassdemo.R.string.app_name)
                + "-" + getString(R.string.df_name));

    }
}