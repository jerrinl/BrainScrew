package com.ics466.brainscrew;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

/**
 * LevelsActivity is for the level select screen where the user selects
 * the difficulty of the levels they will play.  Used with activity_levels.xml.
 */
public class LevelsActivity extends AppCompatActivity {

    ImageView easyView, medView, hardView;
    // ImageView object in activity_levels.xml
    ImageView iview;
    // button in GUI defined in main.xml
    ImageButton image_button;
    // Array of images that will cycle through and display in ImageView
    // represented by their IDS
    Integer[] imageDrawables = {R.drawable.levels_easy, R.drawable.levels_med, R.drawable.levels_hard};
    Integer[] imageIds = {R.id.easyDiff, R.id.medDiff, R.id.hardDiff};
    //image index to cycle through images defined in imageIds
    int image_index = 0;

    /**
     * Sets the screen layout and sets this screen to fullscreen-mode.
     *
     * @param savedInstanceState saved previous state.
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_levels);

        View decorView = getWindow().getDecorView();
        // Hide the status bar.
        int uiOptions = View.SYSTEM_UI_FLAG_FULLSCREEN;
        decorView.setSystemUiVisibility(uiOptions);
    }

    /**
     * If the activity is not destroyed and is hidden behind other activities,
     * when it resumes it will run the following code.
     */
    @Override
    protected void onStart() {
        super.onStart();  // Always call the superclass method first

        View decorView = getWindow().getDecorView();

        // Hide the status bar.
        int uiOptions = View.SYSTEM_UI_FLAG_FULLSCREEN;
        decorView.setSystemUiVisibility(uiOptions);
    }

    /**
     * Will be called when the user resumes interaction with this activity. It
     * will resume the activity in fullscreen-mode.
     */
    public void onResume() {
        super.onResume();  // Always call the superclass method first

        View decorView = getWindow().getDecorView();
        // Hide the status bar.
        int uiOptions = View.SYSTEM_UI_FLAG_FULLSCREEN;
        decorView.setSystemUiVisibility(uiOptions);
    }

    /**
     * Before navigating away from this activity, this code will run.
     */
    public void onPause() {
        super.onPause();  // Always call the superclass method first
    }

    /**
     * When the MAIN MENU button is clicked, it navigates the user to the home
     * screen.
     *
     * @param view the current view.
     */
    public void menuSelect(View view) {
        Intent main = new Intent(this, MainActivity.class);
        main.setFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
        startActivity(main);
    }

    /**
     * When the START button is clicked, it navigates the user to the gameplay
     * screen.
     *
     * @param view the current view.
     */
    public void startClick(View view) {
        Intent intent = new Intent(this, GameplayActivity.class);
        startActivity(intent);
    }


    /**
     * When the right arrow is clicked, changes the difficulty to the next
     * level.
     *
     * @param view the current view.
     */
    public void onRight(View view) {
        //create a handle to our button so we can do event handling on it
        image_button = (ImageButton) findViewById(R.id.imageButtonArrowRight);
        //create handle to our Image View
        image_button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                iview = (ImageView) findViewById(imageIds[image_index]);
                image_index++;
                //if at end of image array return to the first image
                if (image_index >= imageIds.length) {
                    image_index = 0;
                }

                // change the image to next image in imageIds array
                iview.setImageResource(imageDrawables[image_index]);
            }
        });
    }

    /**
     * When the left arrow is clicked, changes the difficulty to the previous
     * level.
     *
     * @param view the currently view.
     */
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

