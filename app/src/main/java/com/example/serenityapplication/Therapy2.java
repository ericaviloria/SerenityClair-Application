package com.example.serenityapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Therapy2 extends AppCompatActivity {
    ImageView exit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_therapy2);

        ImageView exit=(ImageView) findViewById(R.id.exit);

        exit.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent int1 = new Intent(Therapy2.this,MainActivity.class);
                startActivity(int1);
            }
        });
    }
}