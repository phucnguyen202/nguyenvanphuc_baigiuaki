package com.example.profile_ltdtdd;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

import androidx.annotation.NonNull;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity3 extends Home {
    ImageView btnBack, btnDangXuat;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        BottomNavigationView btnav1 = findViewById(R.id.btnav1);
        btnav1.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.ac_home:{
                        Intent intent = new Intent(MainActivity3.this,MainActivity.class);
                        startActivity(intent);
                    }
                    break;
                    case  R.id.ac_profile:{
                        Intent intent = new Intent(MainActivity3.this,MainActivity3.class);
                        startActivity(intent);
                    }
                    break;
                    case R.id.ac_list:{
                        Intent intent = new Intent(MainActivity3.this,ListView.class);
                        startActivity(intent);
                    }
                    break;
                }
                return true;
            }
        });
        btnBack = (ImageView) findViewById(R.id.buttonQuayLai);
        btnDangXuat = (ImageView) findViewById(R.id.buttonHome);
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity3.this,Home.class);
                startActivity(intent);
            }
        });
        btnDangXuat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity3.this,MainActivity.class);
                startActivity(intent);
            }
        });




    }
}