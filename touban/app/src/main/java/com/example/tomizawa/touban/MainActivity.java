package com.example.tomizawa.touban;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView gomi = (TextView) findViewById(R.id.gomin);
        String str1 = "aaa";
        gomi.setText(str1);

        TextView yuka = (TextView) findViewById(R.id.yukan);
        String str2 = "bbb";
        yuka.setText(str2);

        TextView toire = (TextView) findViewById(R.id.toiren);
        String str3 = "ccc";
        toire.setText(str3);

        TextView syorui = (TextView) findViewById(R.id.syoruin);
        String str4 = "ddd";
        syorui.setText(str4);
    }
}
