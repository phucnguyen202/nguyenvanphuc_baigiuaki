package com.example.profile_ltdtdd;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;
import java.util.List;

public class ListView extends AppCompatActivity {
    android.widget.ListView lvCauThu;
    ArrayList<CauThu> arrayCauThu;
    CauThuAdapter adapter;
    boolean kt=true;
    int vitri=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);
        BottomNavigationView btnnav2 = findViewById(R.id.btnav2);
        btnnav2.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.ac_home:{
                        Intent intent = new Intent(ListView.this,MainActivity.class);
                        startActivity(intent);
                    }
                    break;
                    case R.id.ac_profile:{
                        Intent  intent = new Intent(ListView.this,MainActivity3.class);
                        startActivity(intent);
                    }
                    break;
                    case R.id.ac_list:{
                        Intent intent = new Intent(ListView.this,ListView.class);
                        startActivity(intent);
                    }
                    break;
                }
                return true;
            }
        });
        lvCauThu = (android.widget.ListView) findViewById(R.id.list_view_cauthu);
        arrayCauThu = new ArrayList<>();

        arrayCauThu.add(new CauThu("Cristiano Ronaldo","Bồ Đào Nha",R.drawable.b1,"Cristiano Ronaldo dos Santos Aveiro GOIH ComM là một cầu thủ bóng đá chuyên nghiệp người Bồ Đào Nha hiện đang thi đấu ở vị trí tiền đạo cho câu lạc bộ Premier League Manchester United và là đội trưởng của đội tuyển bóng đá quốc gia Bồ Đào Nha."));
        arrayCauThu.add(new CauThu("Ronaldo","Brazil",R.drawable.b2,"Ronaldo Luís Nazário de Lima, là một doanh nhân người Brazil, chủ tịch câu lạc bộ Real Valladolid, và là một cựu cầu thủ bóng đá từng chơi ở vị trí tiền đạo. Được mệnh danh là O Fenômeno, và anh được coi là một trong những cầu thủ xuất sắc nhất mọi thời đại."));
        arrayCauThu.add(new CauThu("Ronaldinho","Brazil",R.drawable.b3,"Ronaldo de Assis Moreira, thường được biết đến với cái tên Ronaldinho Gaúcho hay đơn giản là Ronaldinho, là một cựu cầu thủ bóng đá chuyên nghiệp người Brasil chơi ở vị trí tiền vệ công và tiền đạo cánh."));
        arrayCauThu.add(new CauThu("Lionel Messi","Argentina",R.drawable.b4,"Lionel Andrés Messi, còn được gọi là Leo Messi, là một cầu thủ bóng đá chuyên nghiệp người Argentina hiện đang thi đấu ở vị trí tiền đạo cho câu lạc bộ Ligue 1 Paris Saint-Germain và là đội trưởng của đội tuyển bóng đá quốc gia Argentina. "));
        arrayCauThu.add(new CauThu("Neymar Jr","Brazil",R.drawable.b5,"Neymar da Silva Santos Júnior, thường được biết đến với tên gọi Neymar hoặc Neymar Jr., là một cầu thủ bóng đá người Brasil hiện đang thi đấu ở vị trí tiền đạo cho câu lạc bộ Paris Saint-Germain và đội tuyển bóng đá quốc gia Brasil."));
        adapter = new CauThuAdapter(ListView.this,arrayCauThu);
        lvCauThu.setAdapter(adapter);

        lvCauThu.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(ListView.this, Detail.class);
                CauThu cauthu = arrayCauThu.get(i);
                intent.putExtra("ten", cauthu.getTen());
                intent.putExtra("moTa",cauthu.getMoTa());
                intent.putExtra("hinh",cauthu.getHinh());
                intent.putExtra("thongtin",cauthu.getThongtin());
                if (kt==true)
                    startActivity(intent);
                else kt=true;
            }
        });
        lvCauThu.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long l) {
                kt=false;
                AlertDialog.Builder b = new AlertDialog.Builder(ListView.this);
                b.setTitle("Nguyễn Văn Phúc");
                b.setMessage("Bạn có đồng ý xóa Cầu thủ này không ?");
                b.setPositiveButton("Đồng ý", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        arrayCauThu.remove(i);
                        adapter.notifyDataSetChanged();
                    }
                });
                b.setNegativeButton("Không đồng ý", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        dialog.cancel();
                    }
                });
                AlertDialog al = b.create();
                al.show();
                return false;
            }
        });


    }
}