package com.example.unite4_kararvedongu;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class uyg2_goldsoru extends AppCompatActivity {

    EditText goldedittxt1;
    TextView goldtxtview1, goldtxtview2, goldtxtview3, goldtxtview4;
    Button goldbtn1;
    int tek = 0;
    int cift = 0;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.uyg2_goldsoru);
        goldedittxt1 = findViewById(R.id.goldedittxt1);
        goldtxtview1 = findViewById(R.id.goldtxtview1);
        goldtxtview2 = findViewById(R.id.goldtxtview2);
        goldtxtview3 = findViewById(R.id.goldtxtview3);
        goldtxtview4 = findViewById(R.id.goldtxtview4);
        goldbtn1 = findViewById(R.id.goldbtn);
        goldbtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                for (int i = 0; i <= 50; i++) {
                    if (i % 2 == 0) {
                        goldtxtview4.setText(goldtxtview4.getText().toString() + (cift + i));
                        cift = cift + i;
                    }
                    else {
                        goldtxtview3.setText(goldtxtview3.getText().toString() + (tek + i));
                        tek = tek + i;

                    }
                }
            }
        });
    }

}





