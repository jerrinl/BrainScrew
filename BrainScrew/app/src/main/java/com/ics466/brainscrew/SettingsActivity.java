package com.ics466.brainscrew;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

/**
 * SettingsActivity is for the Settings screen  where users can toggle music and
 * sfx and connect their social media accounts. Used with activity_settings.xml.
 */
public class SettingsActivity extends AppCompatActivity {

    /**
     * Sets the screen layout and sets this screen to fullscreen-mode.
     *
     * @param savedInstanceState saved previous state.
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
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

    public void onStop() {
        super.onStop();  // Always call the superclass method first
    }

    /**
     * When the MAIN MENU button is clicked, it will return the user to the
     * home screen.
     *
     * @param view the current view.
     */
    public void menuSelect(View view) {
        finish();
    }
}
