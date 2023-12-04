package com.example.week10;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText edittext1 = findViewById(R.id.edittext1);
        EditText edittext2 = findViewById(R.id.edittext2);
        Button button1 = findViewById(R.id.button1);
        Button button2 = findViewById(R.id.button2);

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = (new Intent(getApplicationContext(), InputActivity.class));
                startActivity(intent);
            }
        });
    }
}
