package com.ics466.brainscrew;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class GameplayActivity extends AppCompatActivity {

    /**
     * Sets the screen layout and sets this screen to fullscreen-mode.
     *
     * @param savedInstanceState saved previous state.
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gameplay);

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
}
