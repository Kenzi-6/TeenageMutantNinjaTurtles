package com.example.teenagemutantninjaturtles;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView heroesList = (ListView) findViewById(R.id.heroesList);

        // получаем ресурс
        String[] heroes = getResources().getStringArray(R.array.heroes);

        // создаем адаптер
        ArrayAdapter<String> adapter = new ArrayAdapter(this,
                android.R.layout.simple_list_item_1, heroes);

        // устанавливаем для списка адаптер
        heroesList.setAdapter(adapter);
    }
}