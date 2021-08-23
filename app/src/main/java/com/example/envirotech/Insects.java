package com.example.envirotech;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;

public class Insects extends AppCompatActivity {
    ImageView back_button;
    RelativeLayout relativelay2;
    RelativeLayout relativelay3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_insects);
        back_button=findViewById(R.id.back_button);
        relativelay2=findViewById(R.id.relative_lay_2);
        relativelay3=findViewById(R.id.relative_lay_3);
        back_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Insects.super.onBackPressed();
            }
        });
        relativelay2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(Insects.this,Beneficial_Insects.class);
                startActivity(intent);
            }
        });
        relativelay3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(Insects.this,NonBeneficial_Insects.class);
                startActivity(intent);
            }
        });
    }
}