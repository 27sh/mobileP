import android.os.Bundle;
import android.view.Gravity;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LinearLayout linearLayout=new LinearLayout(this);
        linearLayout.setOrientation(LinearLayout.VERTICAL);
        linearLayout.setGravity(Gravity.TOP);
        TextView textView1=new TextView(this);
        textView1.setText("이름:김영희\n프로그래밍 능력: Java(중), Python(상)\n국적:대한민국\n연락처:gdhong@example.com");
        textView1.setTextSize(29);
        linearLayout.addView(textView1);
        setContentView(linearLayout);
    }
}
