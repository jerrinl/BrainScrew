package com.ics466.brainscrew;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

/**
 * LevelsActivity is for the level select screen where the user selects
 * the difficulty of the levels they will play.  Used with activity_levels.xml.
 */
public class LevelsActivity extends AppCompatActivity {

    // ImageView object in activity_levels.xml
    ImageView iview;
    Integer[] imageDrawables = {R.drawable.levels_easy, R.drawable.levels_med, R.drawable.levels_hard};
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
    }

    /**
     * If the activity is not destroyed and is hidden behind other activities,
     * when it resumes it will run the following code.
     */
    @Override
    protected void onStart() {
        super.onStart();  // Always call the superclass method first
    }

    /**
     * Will be called when the user resumes interaction with this activity. It
     * will resume the activity in fullscreen-mode.
     */
    public void onResume() {
        super.onResume();  // Always call the superclass method first
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
        finish();
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
        System.out.println("onRIght has been activated!");

        iview = (ImageView) findViewById(R.id.easyDiff);
        System.out.println("The iview is: " + iview);
        System.out.println("The image_index is: " + image_index);

        image_index++;
        //if at end of image array return to the first image
        if (image_index >= imageDrawables.length) {
            image_index = 0;
        }

        // change the image to next image in imageIds array
        System.out.println("The replacement image_index is: " + image_index);
        System.out.println("The replacement drawable is: " + imageDrawables[image_index]);
        iview.setImageResource(imageDrawables[image_index]);
    }

    /**
     * When the left arrow is clicked, changes the difficulty to the previous
     * level.
     *
     * @param view the currently view.
     */
    public void onLeft(View view) {
        System.out.println("onLeft has been activated!");

        iview = (ImageView) findViewById(R.id.easyDiff);
        System.out.println("The iview is: " + iview);
        System.out.println("The image_index is: " + image_index);

        image_index--;
        //if at end of image array return to the first image
        if (image_index < 0) {
            image_index = imageDrawables.length - 1;
        }

        // change the image to next image in imageIds array
        System.out.println("The replacement image_index is: " + image_index);
        System.out.println("The replacement drawable is: " + imageDrawables[image_index]);
        iview.setImageResource(imageDrawables[image_index]);
    }

}

