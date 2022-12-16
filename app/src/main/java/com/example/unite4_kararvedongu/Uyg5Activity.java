package com.example.unite4_kararvedongu;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Uyg5Activity extends AppCompatActivity {
    EditText edittxtnot1,edittxtnot2,edittxtnot3;
    Button btn;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.uyg5_activity);
        edittxtnot1 = findViewById(R.id.edittxtnot1);
        edittxtnot2 = findViewById(R.id.edittxtnot2);
        edittxtnot3 = findViewById(R.id.edittxtnot3);
    }
    public void onayla(View view){
        int not1 = Integer.parseInt(edittxtnot1.getText().toString());
        int not2 = Integer.parseInt(edittxtnot2.getText().toString());
        int not3 = Integer.parseInt(edittxtnot3.getText().toString());
        float ort = (not1+not2+not3);

        if (not1>100 || not2>100 || not3>100){
            Toast.makeText(this,"100'den kucuk bir sayı giriniz",Toast.LENGTH_LONG).show();
        }

        if (ort>=0 && ort<25){
            Toast.makeText(this,"0 ile Kaldınız.", Toast.LENGTH_LONG).show();
        }
        if (ort>=25 && ort<50){
            Toast.makeText(this,"1 ile Kaldınız.", Toast.LENGTH_LONG).show();
        }
        if (ort>=50 && ort<60){
            Toast.makeText(this,"2 ile Geçtiniz.", Toast.LENGTH_LONG).show();
        }
        if (ort>=60 && ort<70){
            Toast.makeText(this,"3 ile Geçtiniz.", Toast.LENGTH_LONG).show();
        }
        if (ort>70 && ort<85){
            Toast.makeText(this,"4 ile Geçtiniz.", Toast.LENGTH_LONG).show();
        }
        if (ort>85 && ort<100){
            Toast.makeText(this,"5 ile Geçtiniz. Tebrikler", Toast.LENGTH_LONG).show();
        }
        else{
            Toast.makeText(this,"Girilen Not Bilgileri Hatalıdır",Toast.LENGTH_LONG).show();
        }

    }
}
