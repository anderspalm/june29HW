package com.example.generalassembly.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button mButton;
    public static final String NUM_ONE = "num_one";
    public static final String NUM_TWO = "num_two";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        mButton = (Button) findViewById(R.id.one);

        View.OnClickListener emailListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), Main2Activity.class);
                startActivity(intent);
                intent.putExtra(NUM_ONE, 1);
                intent.putExtra(NUM_TWO, 2);
            }
        };
        mButton.setOnClickListener(emailListener);

    }
}
