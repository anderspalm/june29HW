package com.example.generalassembly.intents_lab;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ResponseActivity extends AppCompatActivity {

    TextView mResponseView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_response);

        mResponseView = (TextView) findViewById(R.id.response_page);

        Intent intent = getIntent();

        String adjone = intent.getStringExtra("adj one");
        String adjtwo = intent.getStringExtra("adj two");
        String nounone = intent.getStringExtra("noun one");
        String nountwo = intent.getStringExtra("noun two");
        String animal = intent.getStringExtra("animal");
        String gamename = intent.getStringExtra("game name");


        mResponseView.setText(adjone);
        mResponseView.setText(adjtwo);
        mResponseView.setText(nounone);
        mResponseView.setText(nountwo);
        mResponseView.setText(animal);
        mResponseView.setText(gamename);

    }
}
