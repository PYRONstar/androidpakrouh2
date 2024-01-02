package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class chatlistActivity extends AppCompatActivity {
ListView mList;
    ArrayList<item> arrayItem;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chatlist);
        mList  = findViewById(R.id.list_view);
        arrayItem = new ArrayList<>();
        CustomAdapter mAdapter = new CustomAdapter(this, arrayItem);

        arrayItem.add(new item("avatar_1", "Mohammad", "09:49", "welcome to my project"));
        arrayItem.add(new item("avatar_2", "Parham", "09:45", "my name is parham :)"));
        arrayItem.add(new item("avatar_3", "Mehrdad", "10:21", "ohhh that's cool!!! "));
        arrayItem.add(new item("avatar_4", "Omid", "15:12", "hey my name is omid how are you?"));
        mList.setAdapter(mAdapter);
    }
}