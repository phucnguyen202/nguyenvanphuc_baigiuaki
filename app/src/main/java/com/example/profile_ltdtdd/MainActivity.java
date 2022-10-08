package com.example.profile_ltdtdd;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {
    EditText eUser,ePassword;
    Button bDangnhap,bDangKy;
    boolean kt=false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Anhxa();
        BottomNavigationView btnav = findViewById(R.id.btnav);
        btnav.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.ac_home:{
                        Intent intent = new Intent(MainActivity.this,MainActivity.class);
                        startActivity(intent);
                    }
                    break;
                    case R.id.ac_profile:{
                        Intent  intent = new Intent(MainActivity.this,MainActivity3.class);
                        startActivity(intent);
                    }
                    break;
                    case R.id.ac_list:{
                        Intent intent = new Intent(MainActivity.this,ListView.class);
                        startActivity(intent);
                    }
                    break;
                }
                return true;
            }
        });
        bDangnhap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                User us= new User("Phuc","12345");
                BTP.users.add(us);
                if (eUser.getText().length() != 0 && ePassword.getText().length() !=0){
                    for (User user : BTP.users){
                        if (eUser.getText().toString().equals(user.getUsername()) && ePassword.getText().toString().equals(user.getPass())){
                            Toast.makeText(MainActivity.this,"Dang Nhap Thanh Cong",Toast.LENGTH_SHORT).show();
                            kt = true;
                            Intent intent = new Intent(MainActivity.this,ListView.class);
                            startActivity(intent);
                        }
                    }
                    if (!kt){
                        Toast.makeText(MainActivity.this,"Sai Mat Khau",Toast.LENGTH_SHORT).show();
                    }
                    kt=false;
                }else{
                    Toast.makeText(MainActivity.this,"Vui Long Nhap Day Du Thong Tin",Toast.LENGTH_SHORT).show();
                }
            }
        });
        bDangKy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2=new Intent(MainActivity.this,MainActivity2.class);
                startActivity(intent2);
            }
        });

    }
    private void Anhxa(){
        eUser = (EditText) findViewById(R.id.edittextUser);
        ePassword = (EditText) findViewById(R.id.edittextPassword);
        bDangnhap = (Button) findViewById(R.id.buttonDangNhap);
        bDangKy =(Button) findViewById(R.id.buttonDangKy);
    }
}