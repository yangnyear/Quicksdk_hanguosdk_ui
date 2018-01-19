package com.example.administrator.ks;

import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.Toast;

import com.example.administrator.ks.fragment.LoginFragment;


public class MainActivity extends AppCompatActivity {

    private Button login;
    private LayoutInflater inflater;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE); // 不显示标题栏
        setContentView(R.layout.activity_main);
        login=findViewById(R.id.btn_login);
        inflater= LayoutInflater.from(this);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "dianjishijian", Toast.LENGTH_SHORT).show();
                ShowLoginLayout(inflater);
            }
        });
    }
    public void ShowLoginLayout(LayoutInflater inflater){
        final AlertDialog.Builder loginlDialog = new AlertDialog.Builder(this);
        View dialogView = inflater.inflate(R.layout.ks_dia_layout_login,null);
        loginlDialog.setView(dialogView).show();
    }
}
