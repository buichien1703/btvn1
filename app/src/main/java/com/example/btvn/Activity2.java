package com.example.btvn;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {
    private TextView tvName2;
    private Button btnClick2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        btnClick2 = findViewById(R.id.btnClick2);
        tvName2 = findViewById(R.id.tvName2);

        btnClick2.setOnClickListener(view -> {
            Intent intent = new Intent(this,Activity3.class);
            startActivity(intent);
        });
    }
}