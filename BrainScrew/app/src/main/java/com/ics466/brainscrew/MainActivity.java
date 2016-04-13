package com.ics466.brainscrew;

import android.content.Intent;
import android.media.Image;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

/**
 * MainActivity is for the Home Screen where the user can navigate to the level select,
 * settings, or stats screens. Used with activity_main.xml.
 */
public class MainActivity extends AppCompatActivity {

    /**
     * Creates the new activity in fullscreen-mode (hidden notification bar)
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final MediaPlayer mp = MediaPlayer.create(getApplicationContext(), R.raw.click);
        ImageView startClick = (ImageView) this.findViewById(R.id.play);

        startClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.start();
            }
        });
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
    @Override
    protected void onResume() {
        super.onResume();  // Always call the superclass method first
    }

    /**
     * Before navigating away from this activity, this code will run.
     */
    @Override
    protected void onPause() {
        super.onPause();  // Always call the superclass method first
    }

    /**
     * Navigates to the "play screen" where the user will select their
     * difficulty level.
     *
     * @param view the current view.
     */
    public void levelSelect(View view) {
        Intent level = new Intent(MainActivity.this, LevelsActivity.class);
        startActivity(level);
    }

    /**
     * Navigates to the settings screen.
     *
     * @param view the current view.
     */
    public void settingsSelect(View view) {
        Intent settings = new Intent(MainActivity.this, SettingsActivity.class);
        startActivity(settings);
    }

    /**
     * Navigates to the stats screen.
     *
     * @param view the current view.
     */
    public void statsSelect(View view) {
        Intent stats = new Intent(MainActivity.this, StatsActivity.class);
        startActivity(stats);
    }

    /**
     * Currently not being used.
     */
//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        // Inflate the menu; this adds items to the action bar if it is present.
//        getMenuInflater().inflate(R.menu.menu_main, menu);
//        return true;
//    }

    /**
     * Currently not being used.
     */
//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//        // Handle action bar item clicks here. The action bar will
//        // automatically handle clicks on the Home/Up button, so long
//        // as you specify a parent activity in AndroidManifest.xml.
//        int id = item.getItemId();
//
//        //noinspection SimplifiableIfStatement
//        if (id == R.id.action_settings) {
//            return true;
//        }
//
//        return super.onOptionsItemSelected(item);
//    }
}
