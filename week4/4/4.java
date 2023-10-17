package com.example.week6;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity{
    private String region[]={"{거주지}서울", "{거주지}부산", "{거주지}기타"};

    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = findViewById(R.id.button);
        Spinner spinner = findViewById(R.id.spinner);
        RadioButton button_kor = findViewById(R.id.button_kor);
        RadioButton button_for = findViewById(R.id.button_for);
        CheckBox checkBox_1 = findViewById(R.id.checkbox_1);
        CheckBox checkBox_2 = findViewById(R.id.checkbox_2);
        TextView textview_display = findViewById(R.id.textview_display);
        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_spinner_item, region);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        EditText editText_name = findViewById(R.id.edittext_name);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String msg = "이름 : "+editText_name.getText().toString() + ", ";
                msg += spinner.getSelectedItem().toString();
                if(button_kor.isChecked()) msg += ", 한국인";
                if(button_for.isChecked()) msg += ", 외국인";
                if(checkBox_1.isChecked()) msg += ", 하루 30이상 겯습니다";
                if(checkBox_2.isChecked()) msg += ", 하루 6시간 이상 수면을 취합니다";
                textview_display.setText(msg);
            }
        });

    }
}
