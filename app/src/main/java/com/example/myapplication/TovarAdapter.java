package com.example.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class TovarAdapter extends ArrayAdapter<Tovar> {

    private LayoutInflater inflater;
    private int layout;
    private List<Tovar> tovars;

    public TovarAdapter(Context context, int resource, List<Tovar> states) {
        super(context, resource, states);
        this.tovars = states;
        this.layout = resource;
        this.inflater = LayoutInflater.from(context);
    }

    public View getView(int position, View convertView, ViewGroup parent) {

        View view = inflater.inflate(this.layout, parent, false);

        ImageView flagView = (ImageView) view.findViewById(R.id.flag);
        TextView nameView = (TextView) view.findViewById(R.id.name);
        TextView capitalView = (TextView) view.findViewById(R.id.capital);

        Tovar tovar = tovars.get(position);

        flagView.setImageResource(tovar.getImage());
        nameView.setText(tovar.getName());
        capitalView.setText(tovar.getOpisanie().substring(0, 10) + "...");

        return view;
    }
}
