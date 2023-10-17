package com.example.week6;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity{


    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = findViewById(R.id.button);
        EditText edittext_id = findViewById(R.id.edittext_id);
        EditText edittext_pass =findViewById(R.id.edittext_pass);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String id = edittext_id.getText().toString();
                String pass = edittext_pass.getText().toString();

                Toast.makeText(getApplicationContext(),"아이디 : "+id+"패스워드 : "+pass, Toast.LENGTH_SHORT).show();
            }
        });

    }
}
