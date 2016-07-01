package com.example.generalassembly.helloworld;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView mTextView;
    Button mButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//
//        mTextView = (TextView) findViewById(R.id.text);
//        mTextView.setText("Say, Hello");
//        mButton = (Button) findViewById(R.id.button);

        View.OnClickListener name = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               mTextView.setText("Hello!");
            }
        };

        View.OnClickListener name_two = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(view.getContext(), "You clicked the button", Toast.LENGTH_LONG).show();
            }
        };

        mButton.setOnClickListener(name_two);
        mTextView.setOnClickListener(name);
    }
}
