package com.ics466.brainscrew;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

public class LevelsActivity extends AppCompatActivity {

    ImageView easyView, medView, hardView;
    //ImageView object in activity_levels.xml
    ImageView iview;
    //button in GUI defined in main.xml
    ImageButton image_button;
    //Array of images that will cycle through and display in ImageView
    // represented by their IDS
    Integer[] imageDrawables = {R.drawable.levels_easy, R.drawable.levels_med, R.drawable.levels_hard};
    Integer[] imageIds = {R.id.easyDiff, R.id.medDiff, R.id.hardDiff};
    //image index to cycle through images defined in imageIds
    int image_index = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_levels);

        View decorView = getWindow().getDecorView();
        // Hide the status bar.
        int uiOptions = View.SYSTEM_UI_FLAG_FULLSCREEN;
        decorView.setSystemUiVisibility(uiOptions);

//        easyView = (ImageView) findViewById(R.id.easyDiff);
//        medView = (ImageView) findViewById(R.id.medDiff);
//        hardView = (ImageView) findViewById(R.id.hardDiff);
    }

    public void onPause() {
        super.onPause();  // Always call the superclass method first


    }

    public void onResume() {
        super.onResume();  // Always call the superclass method first

        View decorView = getWindow().getDecorView();
        // Hide the status bar.
        int uiOptions = View.SYSTEM_UI_FLAG_FULLSCREEN;
        decorView.setSystemUiVisibility(uiOptions);
    }

    //Start button clicked
    public void startClick(View view) {
        Intent intent = new Intent(this, SettingsActivity.class);
        startActivity(intent);
    }

    //Right arrow clicked
    public void onRight(View view) {
        //create a handle to our button so we can do event handling on it
        image_button = (ImageButton) findViewById(R.id.imageButtonArrowRight);
        //create handle to our Image View
        image_button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                iview = (ImageView) findViewById(imageIds[image_index]);
                image_index++;
                //if at end of image array return to the first image
                if (image_index >= imageIds.length){
                    image_index = 0;
                }

                // change the image to next image in imageIds array
                iview.setImageResource(imageDrawables[image_index]);
            }
        });
    }

    //Left arrow clicked
    public void onLeft(View view) {
        //create a handle to our button so we can do event handling on it
        image_button = (ImageButton) findViewById(R.id.imageButtonArrowLeft);
        //create handle to our Image View
        image_button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                iview = (ImageView) findViewById(imageIds[image_index]);
                image_index--;
                //if at end of image array return to the first image
                if (image_index <= 0){
                    image_index = imageIds.length-1;
                }
                // change the image to next image in imageIds array
                iview.setImageResource(imageDrawables[image_index]);
            }
        });
    }

}

