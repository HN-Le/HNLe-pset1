package com.example.hnle_pset1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import static android.view.View.VISIBLE;
import static com.example.hnle_pset1.R.drawable.arms;

public class MainActivity extends AppCompatActivity {
    // views, keys
private View arms, eyes, ears, eyebrows, glasses, hat, mouth, mustachcio, nose, shoes;
private String arms_save, eyes_save, ears_save, eyebrows_save, glasses_save, hat_save;
private String mouth_save, mustachcio_save, nose_save, shoes_save;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // views
        arms = findViewById(R.id.arms);
        eyes = findViewById(R.id.eyes);
        shoes = findViewById(R.id.shoes);
        eyebrows = findViewById(R.id.eyebrows);
        ears = findViewById(R.id.ears);
        glasses = findViewById(R.id.glasses);
        hat = findViewById(R.id.hat);
        mouth = findViewById(R.id.mouth);
        nose = findViewById(R.id.nose);
        mustachcio = findViewById(R.id.mustachcio);

        if (savedInstanceState != null)
        {
            if (savedInstanceState.getInt("arms") == 0)
                arms.setVisibility(View.VISIBLE);
            if(savedInstanceState.getInt("eyes") == 0)
                eyes.setVisibility(View.VISIBLE);
            if(savedInstanceState.getInt("shoes") == 0)
                shoes.setVisibility(View.VISIBLE);
            if(savedInstanceState.getInt("eyebrows") == 0)
                eyebrows.setVisibility(View.VISIBLE);
            if(savedInstanceState.getInt("ears") == 0)
                ears.setVisibility(View.VISIBLE);
            if(savedInstanceState.getInt("glasses") == 0)
                glasses.setVisibility(View.VISIBLE);
            if(savedInstanceState.getInt("hat") == 0)
                hat.setVisibility(View.VISIBLE);
            if(savedInstanceState.getInt("mouth") == 0)
                mouth.setVisibility(View.VISIBLE);
            if(savedInstanceState.getInt("nose") == 0)
                nose.setVisibility(View.VISIBLE);
            if(savedInstanceState.getInt("mustachio") == 0)
                mustachcio.setVisibility(View.VISIBLE);
        }

    }
    @Override
    protected void onSaveInstanceState (Bundle outState){
        super.onSaveInstanceState(outState);
        outState.putInt("arms", arms.getVisibility());
        outState.putInt("eyes", eyes.getVisibility());
        outState.putInt("shoes", shoes.getVisibility());
        outState.putInt("eyebrows", eyebrows.getVisibility());
        outState.putInt("ears", ears.getVisibility());
        outState.putInt("glasses", glasses.getVisibility());
        outState.putInt("hat", hat.getVisibility());
        outState.putInt("mouth", mouth.getVisibility());
        outState.putInt("nose", nose.getVisibility());
        outState.putInt("mustachio", mustachcio.getVisibility());

    }

    public void armsclicked(View view) {

        View arms = findViewById(R.id.arms);
        if (arms.getVisibility() != VISIBLE) {
            arms.setVisibility(view.VISIBLE);
        }
        else if (arms.getVisibility() == view.VISIBLE) {
            arms.setVisibility(view.INVISIBLE);
        }
    }

    public void eyesclicked(View view) {
        View eyes = findViewById(R.id.eyes);
        if (eyes.getVisibility() != view.VISIBLE)
        {
            eyes.setVisibility(view.VISIBLE);
        }
        else if (eyes.getVisibility() == view.VISIBLE)
        {
            eyes.setVisibility(view.INVISIBLE);
        }

    }

    public void shoesclicked(View view) {
        View shoes = findViewById(R.id.shoes);
        if (shoes.getVisibility() != view.VISIBLE)
        {
            shoes.setVisibility(view.VISIBLE);
        }
        else if (shoes.getVisibility() == view.VISIBLE)
        {
            shoes.setVisibility(view.INVISIBLE);
        }
    }

    public void earsclicked(View view) {
        View ears = findViewById(R.id.ears);
        if (ears.getVisibility() != view.VISIBLE)
        {
            ears.setVisibility(view.VISIBLE);
        }
        else if (ears.getVisibility() == view.VISIBLE)
        {
            ears.setVisibility(view.INVISIBLE);
        }
    }

    public void eyebrowsclicked(View view) {
        View eyebrows = findViewById(R.id.eyebrows);
        if (eyebrows.getVisibility() != view.VISIBLE)
        {
            eyebrows.setVisibility(view.VISIBLE);
        }
        else if (eyebrows.getVisibility() == view.VISIBLE)
        {
            eyebrows.setVisibility(view.INVISIBLE);
        }
    }

    public void glassesclicked(View view) {
        View glasses = findViewById(R.id.glasses);
        if (glasses.getVisibility() != view.VISIBLE)
        {
            glasses.setVisibility(view.VISIBLE);
        }
        else if (glasses.getVisibility() == view.VISIBLE)
        {
            glasses.setVisibility(view.INVISIBLE);
        }
    }

    public void hatclicked(View view) {
        View hat = findViewById(R.id.hat);
        if (hat.getVisibility() != view.VISIBLE)
        {
            hat.setVisibility(view.VISIBLE);
        }
        else if (hat.getVisibility() == view.VISIBLE)
        {
            hat.setVisibility(view.INVISIBLE);
        }
    }

    public void mouthclicked(View view) {
        View mouth = findViewById(R.id.mouth);
        if (mouth.getVisibility() != view.VISIBLE)
        {
            mouth.setVisibility(view.VISIBLE);
        }
        else if (mouth.getVisibility() == view.VISIBLE)
        {
            mouth.setVisibility(view.INVISIBLE);
        }
    }

    public void mustachcioclicked(View view) {
        View mustachio = findViewById(R.id.mustachcio);
        if (mustachio.getVisibility() != view.VISIBLE)
        {
            mustachio.setVisibility(view.VISIBLE);
        }
        else if (mustachio.getVisibility() == view.VISIBLE)
        {
            mustachio.setVisibility(view.INVISIBLE);
        }
    }

    public void noseclicked(View view) {
        View nose = findViewById(R.id.nose);
        if (nose.getVisibility() != view.VISIBLE)
        {
            nose.setVisibility(view.VISIBLE);
        }
        else if (nose.getVisibility() == view.VISIBLE)
        {
            nose.setVisibility(view.INVISIBLE);
        }
    }
}
