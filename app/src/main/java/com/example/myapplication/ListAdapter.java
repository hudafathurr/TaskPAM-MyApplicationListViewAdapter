package com.example.myapplication;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;

public class ListAdapter extends ArrayAdapter<String> {
    private final Activity context;
    private final String[] players;
    private final String[] number;
    private final String[] pos;

    public ListAdapter(Activity context, String[] players, String[] number, String[] position) {
        super(context,R.layout.custom_list,players);
        this.context = context;
        this.players = players;
        this.number = number;
        this.pos = position;
    }


    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View rowView = inflater.inflate(R.layout.custom_list, null, true);
        TextView txtPlayer = rowView.findViewById(R.id.txt_player);
        TextView txtPosition = rowView.findViewById(R.id.txt_position);
        TextView txtNumber = rowView.findViewById(R.id.txt_number);

        txtPlayer.setText(players[position]);
        txtPosition.setText(pos[position]);
        txtNumber.setText(number[position]);

        return rowView;

    }
}
