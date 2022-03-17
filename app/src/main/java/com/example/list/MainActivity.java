package com.example.list;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
//i am from website 
//i am from andorid studio
public class MainActivity extends AppCompatActivity {
    ListView lv;
    ArrayList arrayList;
    ArrayAdapter arrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv= findViewById(R.id.lv);
        arrayList=new ArrayList();
        arrayList.add("india");        arrayList.add("Georgia");        arrayList.add("USA");        arrayList.add("UK");

        arrayAdapter=new ArrayAdapter(MainActivity.this,
                android.R.layout.simple_list_item_1,arrayList);
        lv.setAdapter(arrayAdapter);
    }
} 
