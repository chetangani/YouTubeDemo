package com.chetang.youtubedemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class Master extends AppCompatActivity {
    RecyclerView masterview;
    Adapters.MasterAdapter masterAdapter;
    RecyclerView.LayoutManager layoutManager;
    Adapters adapters;

    ArrayList<Demodetails> arrayList;
    int slno = 0;
    String[] courses;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_master);

        adapters = new Adapters();
        courses = getResources().getStringArray(R.array.courses);
        arrayList = new ArrayList<Demodetails>();

        for (int i = 0; i < courses.length; i++) {
            slno = i + 1;
            Demodetails details = new Demodetails(""+slno, courses[i]);
            arrayList.add(details);
        }

        masterview = (RecyclerView) findViewById(R.id.masterview);
        layoutManager = new LinearLayoutManager(this);
        masterAdapter = adapters.new MasterAdapter(arrayList, this);

        masterview.setHasFixedSize(true);
        masterview.setLayoutManager(layoutManager);
        masterview.setAdapter(masterAdapter);
    }
}
