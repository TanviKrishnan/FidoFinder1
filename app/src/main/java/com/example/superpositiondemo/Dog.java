package com.example.superpositiondemo;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.media.Image;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import static com.example.superpositiondemo.R.raw.sound;

/**
 * Created by Tanvi on 3/17/18.
 */

public class Dog {
    private String name;
    private Drawable image;
    private String phone;
    private String food;

    private ImageView imageView;
    private TextView tvName;
    private TextView tvPhone;
    private TextView tvFood;
    private Button button;

    public Dog (String name, Drawable image, String phone, String food, View view, Context context) {
        this.name = name;
        this.image = image;
        this.phone = phone;
        this.food = food;

        imageView = ((ImageView)view.findViewById(R.id.image));
        tvName = ((TextView)view.findViewById(R.id.name));
        tvPhone = ((TextView)view.findViewById(R.id.phone));
        tvFood = ((TextView)view.findViewById(R.id.food));
        button = (Button) view.findViewById(R.id.sound);

        initializeUI(context);
    }

    private void initializeUI(Context context) {
        final Context fContext = context;
        imageView.setImageDrawable(image);
        tvName.setText(name);
        tvPhone.setText(phone);
        tvFood.setText(food);

        button.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer player = MediaPlayer.create(fContext, R.raw.sound);

                player.start();

            }
        });



    }
    public String getName() {
        return name;
    }

    public Drawable getImage() { return image; }

    public String getPhone() {
        return phone;
    }

    public String getFood() { return food; }

}
