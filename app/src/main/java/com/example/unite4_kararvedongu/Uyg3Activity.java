package com.example.unite4_kararvedongu;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Uyg3Activity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.uyg3_activity);
    }
    public void ifelse (View view){
        EditText txtedit1 = findViewById(R.id.txtedit1);
        EditText txtedit2 = findViewById(R.id.txtedit2);
        Button btn = findViewById(R.id.btnonay);

        final String kullaniciAdi = "admin";
        final String sifre = "12345";

        String kullaniciAdiGiris = txtedit1.getText().toString();
        String sifreGiris = txtedit2.getText().toString();

        if(kullaniciAdi.equals(kullaniciAdiGiris) && sifre.equals(sifreGiris)) {
            Toast.makeText(this,"Kullanıcı Girişi Başarılı", Toast.LENGTH_LONG).show();
        }
        else {
            Toast.makeText(this,"Kullanıcı Adı veya Şifresi Hatalı",Toast.LENGTH_LONG).show();

        }
    }
}
