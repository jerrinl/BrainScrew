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
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
