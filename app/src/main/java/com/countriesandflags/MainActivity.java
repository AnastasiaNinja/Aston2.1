package com.countriesandflags;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private final ArrayList<Country> countries = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initializeData();

        RecyclerView rcView = findViewById(R.id.rcView);
        CountryAdapter countryAdapter = new CountryAdapter(this, countries);

        rcView.setLayoutManager(new LinearLayoutManager(this));
        rcView.setAdapter(countryAdapter);
    }

    private void initializeData() {
        countries.add(new Country(R.drawable.colombiaflag, "Колумбия"));
        countries.add(new Country(R.drawable.austriaflag, "Австрия"));
        countries.add(new Country(R.drawable.polandflag, "Польша"));
        countries.add(new Country(R.drawable.denmarkflag, "Дания"));
        countries.add(new Country(R.drawable.madagaskarflag, "Мадагаскар"));
        countries.add(new Country(R.drawable.italyflag, "Италия"));
        countries.add(new Country(R.drawable.switzerlandflag, "Швейцария"));
        countries.add(new Country(R.drawable.thailandflag, "Таиланд"));
    }


}