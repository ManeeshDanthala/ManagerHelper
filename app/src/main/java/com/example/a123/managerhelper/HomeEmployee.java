package com.example.a123.managerhelper;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;

public class HomeEmployee extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_employee);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        ArrayList<customClass> al  = new ArrayList<>();
        al.add(new customClass("sunny",80760));
        al.add(new customClass("vishal",80761));
        al.add(new customClass("rajasai",80762));
        al.add(new customClass("maneesh",80765));

        AdapterClass adapterClass = new AdapterClass(this,al);
        ListView listView = (ListView) findViewById(R.id.homeemployeeid);
        listView.setAdapter(adapterClass);
    }

}
