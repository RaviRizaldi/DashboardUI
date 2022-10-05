package com.example.dashboardui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    CardView cvAdd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cvAdd = (CardView) findViewById(R.id.cvAdd);

        cvAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Add your acction here
            }
        });

    }
}