package com.example.a123.managerhelper;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.app.Activity;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class AdapterClass extends ArrayAdapter<customClass> {
    private Context t;
    public AdapterClass(Activity context, ArrayList<customClass> arrayList){
        super(context, 0, arrayList);
        t=context;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View l = convertView;

        if (l == null) {
            l = LayoutInflater.from(getContext()).inflate(
                    R.layout.model_design, parent, false);
        }
        final customClass modelclass = getItem(position);
        String Name = modelclass.getName();
        TextView nameview = (TextView) l.findViewById(R.id.empName);
        nameview.setText(Name);

        Button displayButton = (Button) l.findViewById(R.id.displayButton);
        displayButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        Button rateButton = (Button) l.findViewById(R.id.editButton);
        displayButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        return l;
    }
}
