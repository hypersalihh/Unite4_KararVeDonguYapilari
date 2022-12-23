package com.example.unite4_kararvedongu;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Uyg10Activity extends AppCompatActivity {
    EditText nmbr;
    Button btn;
    TextView txtview;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.uyg10_layout);

        nmbr = findViewById(R.id.edittxtnumber_sayi);
        btn = findViewById(R.id.btnonayla1);
        txtview = findViewById(R.id.txtview);
    }
    public void onayla(View view) {
        int sayi = Integer.parseInt(nmbr.getText().toString());
        int sayac=1;
        long sonuc=1;
        while(sayac<=sayi){
            sonuc=sonuc*sayac;
            sayac++;
        }
        txtview.setText("Sonuç: "+sonuc);
    }

}
