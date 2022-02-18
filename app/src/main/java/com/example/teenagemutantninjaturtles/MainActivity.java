package com.example.teenagemutantninjaturtles;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        ListView heroesList = findViewById(R.id.heroesList);

        String[] heroesV = getResources().getStringArray(R.array.heroes);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1, heroesV);

        heroesList.setAdapter(adapter);

        //слушатели
        heroesList.setOnItemClickListener((parent, itemClicked, position, id) -> {

            String selectedItem = heroesV[position];
            Intent intentInfo = new Intent(MainActivity.this, MainActivity2.class);
            intentInfo.putExtra("hero", selectedItem);
            startActivity(intentInfo);
            });
    }
}