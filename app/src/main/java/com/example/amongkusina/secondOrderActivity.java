package com.example.amongkusina;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class secondOrderActivity extends AppCompatActivity {
    public TextView feetxt, pastaview;

    private Button btnOrder, btnAdd,btnMinus;
    int result = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_order);
        feetxt = (TextView) findViewById(R.id.feetxt);
        btnOrder = findViewById(R.id.btnOrder);
        btnAdd = findViewById(R.id.btnAdd);
        btnMinus = findViewById(R.id.btnMinus);



        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result++;
                feetxt.setText(Integer.toString(result));
            }
        });

        btnMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result--;
                feetxt.setText(Integer.toString(result));
            }
        });
        btnOrder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(secondOrderActivity.this, "Order added", Toast.LENGTH_SHORT).show();
            }
        });

    }
}