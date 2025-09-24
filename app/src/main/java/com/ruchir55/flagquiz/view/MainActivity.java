package com.ruchir55.flagquiz.view;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.ruchir55.flagquiz.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        try {
            Thread.sleep(3000L);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        setContentView(R.layout.activity_main);
    }
}