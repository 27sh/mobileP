package com.example.week6;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity{
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText edittext_w = findViewById(R.id.edittext_w);
        EditText edittext_h = findViewById(R.id.edittext_h);
        RadioButton radiobutton_w = findViewById(R.id.radiobutton_w);
        RadioButton radiobutton_br = findViewById(R.id.radiobutton_br);
        RadioButton radiobutton_bk = findViewById(R.id.radiobutton_bk);
        CheckBox checkBox = findViewById(R.id.checkbox);
        Button button = findViewById(R.id.button);
        TextView textView = findViewById(R.id.textview);
        button.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                String msg = "<주문내역>\n";
                msg += "가로길이 : "+edittext_w.getText().toString();
                msg += ", 세로길이 : "+edittext_h.getText().toString();
                if(radiobutton_w.isChecked()) msg += ", 색상 : 화이트";
                if(radiobutton_br.isChecked()) msg += ", 색상 : 브라운";
                if(radiobutton_bk.isChecked()) msg += ", 색상 : 블랙";
                if(checkBox.isChecked()) msg += ", 추가공구 : 필요";
                textView.setText(msg);
            }
        });

    }
}
