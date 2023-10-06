package com.example.week2;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText edittext_input=findViewById(R.id.edittext_input);
        Button button_convert=findViewById(R.id.button_convert);
        TextView textview_display=findViewById(R.id.textview_display);
        button_convert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float f = Integer.parseInt(edittext_input.getText().toString());
                float c = (f - 32) * 5 / 9;
                String d = String.format("%.2f", c);
                textview_display.setText("섭씨" +d+ "(도)");
            }
        });
    }
}
