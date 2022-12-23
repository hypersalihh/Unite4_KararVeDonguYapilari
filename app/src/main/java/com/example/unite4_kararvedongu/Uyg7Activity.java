package com.example.unite4_kararvedongu;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Uyg7Activity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.uyg7_layout);
    }

    @Override
    protected void onResume() {
        super.onResume();
        for (int i = 1; i <= 100; i++)
                System.out.println(i);
            }
    }

