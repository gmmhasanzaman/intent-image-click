package com.example.petapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private ImageView imageViewDog;
    private ImageView imageViewCat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageViewDog = findViewById(R.id.imageViewDogId);
        imageViewCat = findViewById(R.id.imageViewCatId);

        imageViewDog.setOnClickListener(this);
        imageViewCat.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){
            case R.id.imageViewDogId:
                Intent dogIntent = new Intent(getApplicationContext(),BioActivity.class);
                dogIntent.putExtra("name","DOG");
                dogIntent.putExtra("about",getResources().getString(R.string.about_dog));
                startActivity(dogIntent);
                break;
            case R.id.imageViewCatId:
                Intent catIntent = new Intent(getApplicationContext(),BioActivity.class);
                catIntent.putExtra("name","CAT");
                catIntent.putExtra("about",getResources().getString(R.string.about_cat));
                startActivity(catIntent);
                break;
            default:
                break;
        }

    }
}
