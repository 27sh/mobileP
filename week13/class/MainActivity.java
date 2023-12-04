package com.example.week10;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

public class MainActivity extends AppCompatActivity {
    TextView textview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textview=findViewById(R.id.textview);
        Button button=findViewById(R.id.button);
        button.setOnClickListener( v -> new Thread( () -> display() ).start() ) ;
    }
    private void display() {
        runOnUiThread( () -> textview.setText("") );
        String s=getFromUrl("https://www.busan.go.kr/");
        runOnUiThread( () -> textview.setText(s) );
    }
    private String getFromUrl(String urlString) {
        StringBuilder sb=new StringBuilder();
        try {
            URL url=new URL(urlString);
            BufferedReader si=new BufferedReader(new InputStreamReader(url.openStream()));
            for(String line=si.readLine(); line!=null; line=si.readLine()) sb.append(line);
            si.close();
        } catch (Exception e) { e.printStackTrace(); }
        return sb.toString();
    }
}
