package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        Button btnList = findViewById(R.id.btn_list);
        Button btnCustom = findViewById(R.id.btn_custom);
        Button btnRecycler = findViewById(R.id.btn_recycler);
        
        btnList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intentList();
            }
        });
        btnCustom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intentCustomList();
            }
        });
        btnRecycler.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intentRecycler();
            }
        });
    }
    
    private void intentList(){
        Intent i = new Intent(MainActivity.this, MyListActivity.class);
        startActivity(i);
    }
    private void intentCustomList(){
        Intent in = new Intent(MainActivity.this, MyCustomActivity.class);
        startActivity(in);
    }
    private void intentRecycler(){
        Intent in = new Intent(MainActivity.this,MyRecyclerActivity.class);
        startActivity(in);
    }
}
