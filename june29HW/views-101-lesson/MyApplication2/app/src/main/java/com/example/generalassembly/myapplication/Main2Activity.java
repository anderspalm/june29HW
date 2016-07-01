package com.example.generalassembly.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import org.w3c.dom.Text;

public class Main2Activity extends AppCompatActivity {

    public static Integer mMain2Activity = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent intent = getIntent();
        int id = intent.getIntExtra(MainActivity.NUM_ONE, -1);
        int id2 = intent.getIntExtra(MainActivity.NUM_TWO, -1);

        mMain2Activity = (TextView)


    }


}
