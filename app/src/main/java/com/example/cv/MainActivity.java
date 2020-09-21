package com.example.cv;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void education_Click(View view)
    {
        TextView textView;
        textView = findViewById(R.id.cvView);
        textView.setText(R.string.education);
    }

    public void experience_Click(View view)
    {
        TextView textView;
        textView = findViewById(R.id.cvView);
        textView.setText(R.string.experience);
    }

    public void languages_Click(View view)
    {
        TextView textView;
        textView = findViewById(R.id.cvView);
        textView.setText(R.string.languages);
    }

    public void about_Click(View view)
    {
        TextView textView;
        textView = findViewById(R.id.cvView);
        textView.setText(R.string.about_me);
    }
}