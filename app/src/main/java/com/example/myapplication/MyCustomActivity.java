package com.example.myapplication;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.ListAdapter;
import com.example.myapplication.R;

public class MyCustomActivity extends AppCompatActivity {
    String[] players = {"Cristiano Ronaldo", "Paulo Dybala", "Mario Mandžukić", "Miralem Pjanić",
            "Sami Khedira", "Emre Can", "Claudio Marchisio", "Medhi Benatia", "Giorgio Chiellini",
            "Leonardo Bonucci", "Wojciech Szczęsny"};
    String[] position = {"Forward", "Forwad", "Forward", "Fordward", "Midfielder", "Midfielder",
            "Midfielder", "Midfielder", "Defensive", "Defensive", "Goalkeeper"};
    String[] number = {"7", "10", "17", "8", "23", "8",
            "6", "5", "3", "19", "1"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_custom);

        ListAdapter adapter = new ListAdapter(this, players, number, position);
        ListView lvCustom = findViewById(R.id.lv_custom);
        lvCustom.setAdapter(adapter);
    }
}