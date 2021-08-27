package com.example.envirotech;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class Insects extends AppCompatActivity {
    ImageView back_button;
    TextView titletext,maintext;
    ImageView backButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_insects);

        titletext=findViewById(R.id.title_text);
        maintext=findViewById(R.id.maintext);
        backButton=findViewById(R.id.back_button);

        back_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Insects.super.onBackPressed();
            }
        });
        maintext.setText("");

    }
}