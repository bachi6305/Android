package com.example.androidpractice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.util.logging.Logger;

public class MainActivity extends AppCompatActivity {

    public static final String CLASS_NAME = MainActivity.class.getSimpleName();
    public Logger logger = Logger.getLogger(CLASS_NAME);

    TextView textView = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        logger.info(CLASS_NAME);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.text);
        textView.setText("Welcome.....");

    }
}
