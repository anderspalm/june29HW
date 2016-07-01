package com.example.generalassembly.android_views_lab;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    Button mButtonOne;
    Button mButtonTwo;
    Button mButtonThree;
    Button mButtonFour;
    Button mButtonFive;
    Button mButtonSix;
    Button mButtonSeven;
    Button mButtonEight;
    Button mButtonNine;
    Button mButtonTen;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mButtonOne = (Button) findViewById(R.id.one);
        mButtonTwo = (Button) findViewById(R.id.two);
        mButtonThree = (Button) findViewById(R.id.three);
        mButtonFour = (Button) findViewById(R.id.four);
        mButtonFive = (Button) findViewById(R.id.five);
        mButtonSix = (Button) findViewById(R.id.six);
        mButtonSeven = (Button) findViewById(R.id.seven);
        final ArrayList<String> array = new ArrayList<>();
        array.add("one");array.add("two");array.add("three");array.add("four");array.add("five");array.add("six");
        array.add("seven");array.add("eight");array.add("nine");array.add("ten");


        // for(int i = 0; i<array.size(); i ++ ){
        //     if(findViewById(array.indexOf(i)).equals(array.indexOf(i))) {
        //          int jam = array.indexOf(i);
                View.OnClickListener name = new View.OnClickListener() {
                    @Override
                    public void onClick(View fg) {
//                for(int i = 0; i<array.size(); i ++ ){
//                    if(findViewById(array.indexOf(i)).equals(array.indexOf(i))) {
                 //       Toast.makeText(fg.getContext(), "You clicked on the button below views number " + jam * 2, Toast.LENGTH_LONG).show();

//                    }
//                }
//                mButtonOne.setText("Hello");
                        if (findViewById(R.id.one) == view) {
                            Toast.makeText(view.getContext(), "You clicked on the button below views number 2", Toast.LENGTH_LONG).show();
                        }
                        if (findViewById(R.id.two) == view) {
                            Toast.makeText(view.getContext(), "You clicked on the button below views number 4", Toast.LENGTH_LONG).show();
                        }
                        if (findViewById(R.id.three) == view) {
                            Toast.makeText(view.getContext(), "You clicked on the button below views number 6", Toast.LENGTH_LONG).show();
                        }
                        if (findViewById(R.id.four) == view) {
                            Toast.makeText(view.getContext(), "You clicked on the button below views number 8", Toast.LENGTH_LONG).show();
                        }
                        if (findViewById(R.id.five) == view) {
                            Toast.makeText(view.getContext(), "You clicked on the button below views number 10", Toast.LENGTH_LONG).show();
                        }
                        if (findViewById(R.id.six) == view) {
                            Toast.makeText(view.getContext(), "You clicked on the button below views number 12", Toast.LENGTH_LONG).show();
                        }
                        if (findViewById(R.id.seven) == view) {
                            Toast.makeText(view.getContext(), "You clicked on the button below views number 14", Toast.LENGTH_LONG).show();
                        }
                        if (findViewById(R.id.eight) == view) {
                            Toast.makeText(view.getContext(), "You clicked on the button below views number 16", Toast.LENGTH_LONG).show();
                        }
                        if (findViewById(R.id.nine) == view) {
                            Toast.makeText(view.getContext(), "You clicked on the button below views number 18", Toast.LENGTH_LONG).show();
                        }
                        if (findViewById(R.id.ten) == view) {
                            Toast.makeText(view.getContext(), "You clicked on the button below views number 20", Toast.LENGTH_LONG).show();
                        }
                    }
                };
            // }
            // }
        mButtonOne.setOnClickListener(name);
        mButtonTwo.setOnClickListener(name);
    }
}
