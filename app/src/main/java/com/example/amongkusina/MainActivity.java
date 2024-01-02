package com.example.amongkusina;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;


import com.example.amongkusina.Items.items;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements RecyclerViewInterface{
    ImageButton imageBtn, imageBtn1,imageBtn2;
    Button paymentBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        RecyclerView recyclerView =findViewById(R.id.recycleView);

        List<items> items = new ArrayList<items>();
        items.add(new items("BREAKFAST",R.drawable.resource_break));
        items.add(new items("LUNCH",R.drawable.lun));
        items.add(new items("DINNER",R.drawable.dinw));
        items.add(new items("DRINKS",R.drawable.dri));
        items.add(new items("DESSERT",R.drawable.des));


        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        recyclerView.setAdapter(new MyAdapter(getApplicationContext(),items, this));

           paymentBtn = findViewById(R.id.paymentBtn);
        imageBtn = findViewById(R.id.imageBtn);

        imageBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {openOderSetAct();
            }
        });
        imageBtn1 = findViewById(R.id.imageBtn1);

        imageBtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {openOderSetAct1();
            }
        });
        imageBtn2 = findViewById(R.id.imageBtn2);

        imageBtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {openOderSetAct2();
            }
        });
        paymentBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {openpamentSetAct1();
            }
        });

    }private void openpamentSetAct1() {
        Intent intent = new Intent(this, totalActivity.class);
        startActivity(intent);
    }
    private void openOderSetAct() {
        Intent intent = new Intent(this, OrderActivity.class);
        startActivity(intent);
    }
    private void openOderSetAct1() {
        Intent intent = new Intent(this, secondOrderActivity.class);
        startActivity(intent);
    }
    private void openOderSetAct2() {
        Intent intent = new Intent(this, thridOrderActivity2.class);
        startActivity(intent);
    }

    @Override
    public void onItemClick(int position) {
        Intent intent = new Intent(this, categoryActivity.class);
         intent.putExtra("IMAGE",R.drawable.burger1);
        startActivity(intent);
    }
}