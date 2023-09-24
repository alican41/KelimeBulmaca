package com.alicandogru.kelimebirletirme;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;


import java.util.ArrayList;

public class ScoreActivity extends AppCompatActivity {

    ListView listView2;
    Intent intent;
    Button oyna;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score);
        listView2 = findViewById(R.id.skorlar);
        oyna = findViewById(R.id.oyna);

        intent = getIntent();
        ArrayList<Integer> myArrayList = intent.getIntegerArrayListExtra("myArrayList");
        ArrayAdapter<Integer> adapter = new ArrayAdapter<>(ScoreActivity.this, android.R.layout.simple_list_item_1,myArrayList.subList(0, 10));
        listView2.setAdapter(adapter);

        oyna.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(ScoreActivity.this, MainActivity.class);
                intent2.putIntegerArrayListExtra("top10",myArrayList);
                startActivity(intent2);
                finish();

            }
        });
    }




}