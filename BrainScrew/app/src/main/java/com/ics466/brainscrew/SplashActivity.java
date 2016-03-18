package com.ics466.brainscrew;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

/**
 * SlashActivity is the splash screen (aka loading screen) that shows
 * prior to the Home page when the program is loading up.
 */
public class SplashActivity extends AppCompatActivity {

    /** Duration of wait **/
    private final int SPLASH_DISPLAY_LENGTH = 2000; // 2 seconds

    /**
     * Creates a new handler that sets how long the splash screen is
     * visible for.
     *
     * @param savedInstanceState saved previous state.
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        /** New Handler to start  MainActivity
         * and close this Splash Screen a period of time.*/
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                /** Create an Intent that will start MainActivity. */
                Intent mainIntent = new Intent(SplashActivity.this, MainActivity.class);
                SplashActivity.this.startActivity(mainIntent);
                SplashActivity.this.finish();
            }
        }, SPLASH_DISPLAY_LENGTH);
    }
}
