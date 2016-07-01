package com.example.generalassembly.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


        TextView mTextView;
        EditText mEditText;
        Button mButton;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);


            mTextView = (TextView) findViewById(R.id.text_view_one);

            mTextView.setText("New Text");
            mEditText.setHint("You are amazing");

            View.OnClickListener name = new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Toast.makeText(view.getContext(), "You clicked the button", Toast.LENGTH_LONG).show();
                }
            };

            mButton.setOnClickListener(name);
            mTextView.setOnClickListener(name);

        }


}
