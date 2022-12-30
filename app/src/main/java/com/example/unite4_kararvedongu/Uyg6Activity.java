package com.example.unite4_kararvedongu;

import android.os.Bundle;
import android.view.View;
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
    public void onayla(View view){
        int sayiay = Integer.parseInt(txteditnmbr.getText().toString());
        String ay="";
        txteditnmbr.setText("");
        switch (sayiay){
            case 1:
                ay="OCAK";
                break;
            case 2:
                ay="OCAK";
                break;
            case 3:
                ay="OCAK";
                break;
            case 4:
                ay="OCAK";
                break;
            case 5:
                ay="OCAK";
                break;
            case 6:
                ay="OCAK";
                break;
            case 7:
                ay="OCAK";
                break;
            case 8:
                ay="OCAK";
                break;
            case 9:
                ay="OCAK";
                break;
            case 10:
                ay="OCAK";
                break;
            case 11:
                ay="OCAK";
                break;
            case 12:
                ay="OCAK";
                break;
            default:
                ay="YANLIŞ BİLGİ";
                break;
        }
        txtview.setText(ay);
    }
}
