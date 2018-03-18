package com.example.superpositiondemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MyLostPet extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_lost_pet);

        Button BackButton;
        BackButton = (Button) findViewById(R.id.BackButton);
        BackButton.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMainActivity();
            }
        });

        Button PostButton;
        PostButton = (Button) findViewById(R.id.PostButton);
        PostButton.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMainActivity();
            }
        });
     }

    private void openMainActivity() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
