package com.example.envirotech;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Fertilizers extends AppCompatActivity {
    TextView maintext,titletext;
    ImageView back_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fertilizers);
        maintext=findViewById(R.id.maintext);
        titletext=findViewById(R.id.title_text);
        back_button=findViewById(R.id.back_button);
        back_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fertilizers.super.onBackPressed();
            }
        });

    }
}