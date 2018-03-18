package com.example.superpositiondemo;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private Button button;
    private Button button2;

    public Dog dog0;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        View view0 = findViewById(R.id.dog0);
        String name0 = "Name: Sam";
        Drawable img0 = getDrawable(R.drawable.dog0);
        String phone0 = "Phone: 650-834-2938";
        String food0 = "Food: carrots";

        dog0 = new Dog(name0, img0, phone0, food0, view0, this.getApplicationContext());

        View view1 = findViewById(R.id.dog1);
        String name1 = "Name: Goldie";
        Drawable img1 = getDrawable(R.drawable.dog1);
        String phone1 = "Phone: 408-739-0283";
        String food1 = "Food: pupperoni";

        Dog dog1 = new Dog(name1, img1, phone1, food1, view1, this.getApplicationContext());

        View view2 = findViewById(R.id.dog2);
        String name2 = "Name: Bob";
        Drawable img2 = getDrawable(R.drawable.dog2);
        String phone2 = "Phone: 650-273-9493";
        String food2 = "Food: sweet potato";

        Dog dog2 = new Dog(name2, img2, phone2, food2, view2, this.getApplicationContext());

        View view3 = findViewById(R.id.dog3);
        String name3 = "Name: Cookie";
        Drawable img3 = getDrawable(R.drawable.dog3);
        String phone3 = "Phone: 408-123-6384";
        String food3 = "Food: greenies";

        Dog dog3 = new Dog(name3, img3, phone3, food3, view3, this.getApplicationContext());

        View view4 = findViewById(R.id.dog4);
        String name4 = "Name: Darth Pupper";
        Drawable img4 = getDrawable(R.drawable.dog4);
        String phone4 = "Phone: 650-234-4348";
        String food4 = "Food: rawhide";

        Dog dog4 = new Dog(name4, img4, phone4, food4, view4, this.getApplicationContext());

        View view5 = findViewById(R.id.dog5);
        String name5 = "Name: Fido";
        Drawable img5 = getDrawable(R.drawable.dog5);
        String phone5 = "Phone: 650-812-0338";
        String food5 = "Food: anything";

        Dog dog5 = new Dog(name5, img5, phone5, food5, view5, this.getApplicationContext());

        View view6 = findViewById(R.id.dog6);
        String name6 = "Name: Candy";
        Drawable img6 = getDrawable(R.drawable.dog6);
        String phone6 = "Phone: 650-231-4328";
        String food6 = "Food: chicken";

        Dog dog6 = new Dog(name6, img6, phone6, food6, view6, this.getApplicationContext());

        View view7 = findViewById(R.id.dog7);
        String name7 = "Name: Cotton";
        Drawable img7 = getDrawable(R.drawable.cat7);
        String phone7 = "Phone: 408-134-2938";
        String food7 = "Food: turkey";

        Dog dog7 = new Dog(name7, img7, phone7, food7, view7, this.getApplicationContext());

        View view8 = findViewById(R.id.dog8);
        String name8 = "Name: Benji";
        Drawable img8 = getDrawable(R.drawable.dog8);
        String phone8 = "Phone: 650-123-0938";
        String food8 = "Food: egg";

        Dog dog8 = new Dog(name8, img8, phone8, food8, view8, this.getApplicationContext());

        View view9 = findViewById(R.id.dog9);
        String name9 = "Name: Whiskers";
        Drawable img9 = getDrawable(R.drawable.cat9);
        String phone9 = "Phone: 408-183-3938";
        String food9 = "Food: tuna";

        Dog dog9 = new Dog(name9, img9, phone9, food9, view9, this.getApplicationContext());


        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new Button.OnClickListener() {
             @Override
             public void onClick(View v) {
             openProfile();
         }
         });

        button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new Button.OnClickListener() {
            @Override
           public void onClick(View v) {
               openMyLostPet();
            }
        });
    }

    public void openMyLostPet() {
        Intent intent = new Intent(this, MyLostPet.class);

            startActivity(intent);
    }

    public void openProfile() {
            Intent intent = new Intent(this, Profile.class);
            startActivity(intent);
        }


}
