package com.ics466.brainscrew;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

/**
 * StatsActivity is for the Stats screen where users can view their daily,
 * weekly, monthly, and lifetime stats. Used with activity_stats.xml.
 */
public class StatsActivity extends AppCompatActivity {

    /**
     * Sets the screen layout and sets this screen to fullscreen-mode.
     *
     * @param savedInstanceState saved previous state.
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stats);
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
}
