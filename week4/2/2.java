package com.example.week6;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity{


    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = findViewById(R.id.button);
        CheckBox checkbox_1 = findViewById(R.id.checkbox_1);
        CheckBox checkbox_2 = findViewById(R.id.checkbox_2);
        CheckBox checkbox_3 = findViewById(R.id.checkbox_3);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String msg = "<방문 지역>";

                if (checkbox_1.isChecked()) msg += "\n 서울";
                if (checkbox_2.isChecked()) msg += "\n 제주도";
                if (checkbox_3.isChecked()) msg += "\n 그 외 지역";

                Toast.makeText(getApplicationContext(), msg, Toast.LENGTH_SHORT).show();
            }
        });

    }
}
