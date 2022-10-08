package com.example.profile_ltdtdd;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Detail extends AppCompatActivity {
    TextView txtDetail, txtmoTa,Thongtin;
    ImageView imgHinh;
    ImageView btnQuayLai;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        txtDetail = (TextView) findViewById(R.id.dtCauThu);
        txtmoTa = (TextView) findViewById(R.id.dtMoTa);
        imgHinh= (ImageView) findViewById(R.id.imageHinh);
        Thongtin=(TextView) findViewById(R.id.dtThongtin);
        btnQuayLai = (ImageView) findViewById(R.id.buttonQuayLai1);
        btnQuayLai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Detail.this,ListView.class);
                startActivity(intent);
            }
        });


        Intent intent = getIntent();
        String ten = intent.getStringExtra("ten");
        txtDetail.setText(ten);
        String mota = intent.getStringExtra("moTa");
        txtmoTa.setText(mota);
        int hinh = intent.getIntExtra("hinh",1);
        imgHinh.setImageResource(hinh);
        String tt = intent.getStringExtra("thongtin");
        Thongtin.setText(tt);


    }





}