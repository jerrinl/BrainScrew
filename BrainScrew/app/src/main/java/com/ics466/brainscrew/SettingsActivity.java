package com.ics466.brainscrew;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SettingsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        View decorView = getWindow().getDecorView();
        // Hide the status bar.
        int uiOptions = View.SYSTEM_UI_FLAG_FULLSCREEN;
        decorView.setSystemUiVisibility(uiOptions);
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

//    //when MUSIC switch 'clicked'
//    public void switchMusic() {
//
//    }
//
//    //when SFX swtich 'clicked'
//    public void switchSFX() {
//
//    }
//
//    //FB button clicked
//    public void shareFB() {
//
//    }
//
//    //Twitter button clicked
//    public void shareTwitter(){
//
//    }

    //MainMenu button clicked
    public void gotoMain(View view) {
        Intent main= new Intent(this, MainActivity.class);
        main.setFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
        startActivity(main);
    }
}
