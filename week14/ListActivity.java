package com.example.week10;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class ListActivity extends AppCompatActivity {
    ListView listview;
    String list[]={"질병관리청", "부산시청", "전자정부"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        setTitle("Test");

        Button btn_home = findViewById(R.id.btn_home);
        listview=findViewById(R.id.listview);

        ArrayAdapter<String> adapter=new ArrayAdapter<>(this, R.layout.listitem, R.id.listitem_text, list);
        listview.setAdapter(adapter);

        String[] urlArray = {"https://kdca.go.kr/", "https://www.busan.go.kr/index", "https://www.gov.kr/portal/main/nologin"};

        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String selectedUrl = urlArray[position];

                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(selectedUrl));
                startActivity(intent);
            }
        });

        btn_home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
