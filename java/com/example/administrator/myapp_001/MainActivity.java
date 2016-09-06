package com.example.administrator.myapp_001;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textView= (TextView) findViewById(R.id.textView);
        textView.setText("今天星期五");
        textView.setTextColor(Color.BLUE);
        textView.setTextSize(30);

        //TextView与富文本标签
        TextView textView1= (TextView) findViewById(R.id.textView3);
        String html="<font color='#d61616'>感觉没有睡好</font><br>";
        html +="<font color='#1f16d7'>眼睛有点痛</font><p>";
        html +="<u>美女，这周日你有空吗？</u>";
        CharSequence sequence= Html.fromHtml(html);
        textView.setText(sequence);



    }
}
