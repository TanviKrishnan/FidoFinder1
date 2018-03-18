package com.example.superpositiondemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TableRow;

public class Edit extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit);

        TableRow Name;
        TableRow Phone;
        TableRow Email;
        TableRow Pets;



        Button Backbutton;
        Backbutton = (Button) findViewById(R.id.Backbutton);
        Backbutton.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                openProfile();
            }
        });

        Button Savebutton;
        Savebutton = (Button) findViewById(R.id.Savebutton);
        Savebutton.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
               // TextView NameEdit;
               // String name;
              //  return name = NameEdit;


                openProfile();
            }
        });
    }

    public void openProfile() {
        Intent intent = new Intent(this, Profile.class);
        startActivity(intent);
    }
}
