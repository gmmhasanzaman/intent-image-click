package com.example.petapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class BioActivity extends AppCompatActivity {

    private ImageView imageViewPet;
    private TextView textViewPetName;
    private TextView textViewPetAbout;
    private Bundle extras;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bio);

        imageViewPet = findViewById(R.id.petImageViewId);
        textViewPetName = findViewById(R.id.petNameId);
        textViewPetAbout = findViewById(R.id.petAboutId);

        extras = getIntent().getExtras();

        if (extras != null){
            String petName = extras.getString("name");
            String petAbout = extras.getString("about");

            setUpBio(petName, petAbout);
        }


    }

    public void setUpBio(String petName,String petAbout){

        if (petName.equals("DOG")){
            imageViewPet.setImageResource(R.drawable.dog);
            textViewPetName.setText(petName);
            textViewPetAbout.setText(petAbout);
        }
        else if (petName.equals("CAT")){
            imageViewPet.setImageResource(R.drawable.cat);
            textViewPetName.setText(petName);
            textViewPetAbout.setText(petAbout);
        }

    }
}
