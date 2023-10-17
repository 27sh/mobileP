package com.example.week6;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity{


    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = findViewById(R.id.button);
        RadioButton radiobutton_1 = findViewById(R.id.radiobutton_1);
        RadioButton radiobutton_2 = findViewById(R.id.radiobutton_2);
        RadioButton radiobutton_3 = findViewById(R.id.radiobutton_3);
        RadioButton radiobutton_4 = findViewById(R.id.radiobutton_4);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String msg = "";

                if (radiobutton_1.isChecked()) msg = radiobutton_1.getText().toString();
                else if (radiobutton_2.isChecked()) msg = radiobutton_2.getText().toString();
                else if (radiobutton_3.isChecked()) msg = radiobutton_3.getText().toString();
                else if (radiobutton_4.isChecked()) msg = radiobutton_4.getText().toString();

                Toast.makeText(getApplicationContext(), "연료 유형 : " + msg, Toast.LENGTH_SHORT).show();
            }
        });

    }
}
