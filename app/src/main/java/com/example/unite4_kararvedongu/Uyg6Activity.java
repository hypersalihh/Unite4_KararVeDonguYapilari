package com.example.unite4_kararvedongu;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Uyg6Activity extends AppCompatActivity {
    EditText txteditnmbr;
    Button btn;
    TextView txtview;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.uyg6_activity);
        txteditnmbr = findViewById(R.id.txteditnmbr);
        btn = findViewById(R.id.btnuyg6);
        txtview = findViewById(R.id.txtview);
    }
}
