package com.example.unite4_kararvedongu;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Uyg9Activity extends AppCompatActivity {
    EditText edittxtsayilar,edittxtsayi;
    Button btntek, btncift, btntumliste;
    int sayi;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.uyg9_layout);
        edittxtsayilar = findViewById(R.id.edittxtsayi);
        edittxtsayi = findViewById(R.id.edittxtgiris);
        btncift = findViewById(R.id.btncift);
        btntek = findViewById(R.id.btntek);
        btntumliste = findViewById(R.id.btntumliste);
    }

    public void ciftSayilar(View view) {
        edittxtsayilar.setText("");
        sayi = Integer.parseInt(edittxtsayi.getText().toString());
        for (int i = 0; i <= sayi; i++) {
            if (i%2==0) {
                edittxtsayilar.setText(edittxtsayilar.getText()+ "" +i);
            }
        }
    }

    public void tekSayilar(View view) {
        edittxtsayilar.setText("");
        sayi = Integer.parseInt(edittxtsayi.getText().toString());
        for (int i = 0; i <= sayi; i++) {
            if (i%2!= 0) {
                edittxtsayilar.setText(edittxtsayilar.getText()+ "" +i);
            }
        }
    }

    public void tumSayilar(View view) {
        edittxtsayilar.setText("");
        sayi = Integer.parseInt(edittxtsayi.getText().toString());
        for (int i = 0; i <= sayi; i++) {
            edittxtsayilar.setText(edittxtsayilar.getText()+ "" +i);
        }
    }
}

