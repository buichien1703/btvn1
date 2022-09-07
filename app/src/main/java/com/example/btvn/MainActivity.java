package com.example.btvn;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView tvName;
    private Button btnClick1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnClick1 = findViewById(R.id.btnClick1);
        tvName = findViewById(R.id.tvName1);

        btnClick1.setOnClickListener(view -> {
            Intent intent = new Intent(this, Activity2.class);
            startActivity(intent);
        });
    }
}