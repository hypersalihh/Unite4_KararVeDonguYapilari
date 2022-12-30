package com.example.unite4_kararvedongu;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class uyg1_goldsoru extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.uyg1_goldsoru);
        Button btn = findViewById(R.id.btnonayla);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText edittxtcarp = findViewById(R.id.edittxtcarp);
                EditText edittxtnmb4 = findViewById(R.id.edittxtnmbr4);
                edittxtcarp.setText("");
                for (int i = 1; i <= 10 ;i++){
                    edittxtcarp.setText(edittxtcarp.getText().toString() + "\n" + edittxtnmb4.getText().toString() + " x " + i + " = " + Integer.parseInt(edittxtnmb4.getText().toString()) * i);
                }
            }
        });
    }
}
