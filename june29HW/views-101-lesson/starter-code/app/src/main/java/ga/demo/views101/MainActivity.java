package ga.demo.views101;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    Textview mTextView;
    EditText mEditText;
    Button mButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    mTextView = (TextView) findviewByID(R.id.text_view_one);

    mTextView.setText("New Text");

}

