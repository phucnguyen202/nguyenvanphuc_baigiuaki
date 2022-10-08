package com.example.profile_ltdtdd;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    Button btnCreate;
    EditText edttaikhoan, edtmatkhau;
    String ten,mk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        //        btnSignIn = (Button) findViewById(R.id.buttonSignIn);
        btnCreate = (Button) findViewById(R.id.buttonCreat);
        edttaikhoan = (EditText) findViewById(R.id.edittexttaikhoan);
        edtmatkhau = (EditText) findViewById(R.id.edittextmatkhau);

        btnCreate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity2.this, "Đăng kí tài khoản thành công!", Toast.LENGTH_SHORT).show();
                User us= new User(edttaikhoan.getText().toString(),edtmatkhau.getText().toString());
                BTP.users.add(us);
                Intent intent = new Intent(MainActivity2.this, MainActivity.class);
                startActivity(intent);
            }
        });

    }
}
