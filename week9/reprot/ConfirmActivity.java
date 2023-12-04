package com.example.week10;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ConfirmActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirm);
        Button button_prev=findViewById(R.id.button_prev);
        Button button_register=findViewById(R.id.button_next);
        TextView textview_orderinfo=findViewById(R.id.textview_info);
        Intent intent=getIntent();
        textview_orderinfo.setText(intent.getStringExtra("ORDER_INFO"));
        button_prev.setOnClickListener((v)->finish());
        button_register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), AgreeActivity.class));
                finish();
            }
        });
    }
}
