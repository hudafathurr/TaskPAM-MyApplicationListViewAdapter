package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MyListActivity extends AppCompatActivity {
    private ListView lvItem;
    private String[] players = new String[]{
            "Cristiano Ronaldo", "Paulo Dybala", "Mario Mandžukić", "Miralem Pjanić", "Sami Khedira", "Emre Can", "Claudio Marchisio", "Medhi Benatia", "Giorgio Chiellini", "Leonardo Bonucci", "Wojciech Szczęsny"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_list);

        getSupportActionBar().setTitle("List Player");

        lvItem = findViewById(R.id.list_view);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_dropdown_item_1line,android.R.id.text1, players);

        lvItem.setAdapter(adapter);
    }
}
