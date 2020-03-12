package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.Log;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.secondactivity);

       // Bundle
        Bundle bundle = this.getIntent().getExtras();
        String str1 =bundle.getString("login");
        String str2= bundle.getString("password");
        TextView textView = (TextView)findViewById(R.id.textView);
        TextView textView1 = (TextView)findViewById(R.id.textView1);
        textView.setText(str1);
        textView1.setText(str2);
        Log.d("stringData",str1);
        Log.d("stringData",str2);
    }


    }
