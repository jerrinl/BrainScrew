package com.ics466.brainscrew;

import android.graphics.Color;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Set;


public class GameplayActivity extends AppCompatActivity {



    public static final int BLU = 0;
    public static final int GRN = 1;
    public static final int ORG = 2;
    public static final int PNK = 3;
    public static final int PUR = 4;
    public static final int RED = 5;
    public static final int WHT = 6;
    public static final int YLW = 7;

    public static final HashMap colorHash = new HashMap();

    public static final String[] colorNames = {"BLUE", "GREEN", "ORANGE", "PINK",
                                                "PURPLE", "RED", "WHITE", "YELLOW"};

    public static final String[] colorHex = {"#0054a6", "#00a651", "#f26522", "#ee145b",
                                                "#32004b", "#ff0000", "#ffffff", "#ffff00"};

    Integer[] topEdges = {R.drawable.gameplay_top_blue, R.drawable.gameplay_top_green,
                            R.drawable.gameplay_top_orange, R.drawable.gameplay_top_pink,
                            R.drawable.gameplay_top_purple, R.drawable.gameplay_top_red,
                            R.drawable.gameplay_top_white, R.drawable.gameplay_top_yellow};

    Integer[] botEdges = {R.drawable.gameplay_bottom_blue, R.drawable.gameplay_bottom_green,
                            R.drawable.gameplay_bottom_orange, R.drawable.gameplay_bottom_pink,
                            R.drawable.gameplay_bottom_purple, R.drawable.gameplay_bottom_red,
                            R.drawable.gameplay_bottom_white, R.drawable.gameplay_bottom_yellow};

    Integer[] leftEdges = {R.drawable.gameplay_left_blue, R.drawable.gameplay_left_green,
                            R.drawable.gameplay_left_orange, R.drawable.gameplay_left_pink,
                            R.drawable.gameplay_left_purple, R.drawable.gameplay_left_red,
                            R.drawable.gameplay_left_white, R.drawable.gameplay_left_yellow};

    Integer[] rightEdges = {R.drawable.gameplay_right_blue, R.drawable.gameplay_right_green,
                            R.drawable.gameplay_right_orange, R.drawable.gameplay_right_pink,
                            R.drawable.gameplay_right_purple, R.drawable.gameplay_right_red,
                            R.drawable.gameplay_right_white, R.drawable.gameplay_right_yellow};

    Integer[] colors = new Integer[4];

    ImageView top, bot, left, right;
    TextView gameText;


    String message;
    private android.widget.RelativeLayout.LayoutParams layoutParams;

    /**
     * Sets the screen layout and sets this screen to fullscreen-mode.
     *
     * @param savedInstanceState saved previous state.
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gameplay);
        System.out.println("gameplay activity begin");
        top = (ImageView) findViewById(R.id.gameTop);
        bot = (ImageView) findViewById(R.id.gameBottom);
        left = (ImageView) findViewById(R.id.gameLeft);
        right = (ImageView) findViewById(R.id.gameRight);
        gameText = (TextView) findViewById(R.id.currText);



        makeBorders(rand4());

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
     * Generates a new set of borders.
     */
    public void onClick(View view){

        makeBorders(rand4());
    }


    /*
     * Generates an Integer[] array of 4 numbers from 1-8.
     *
     */

    public Integer[] rand4(){
        Random rnd = new Random();


        // makes an integer set that gets 4 random numbers 1-8.
        // a set is used so no duplicates naturally occur.
        Set<Integer> list2 = new LinkedHashSet<Integer>();
        while(list2.size() < 4){
            list2.add(rnd.nextInt(8));
        }

        //colors are 4 random integers
        colors = list2.toArray(new Integer[list2.size()]);

        System.out.println("Colors are " + colors[0] + " and " + colors[1] + " and " + colors[2] +
                            " and " + colors[3]);

        int randText = colors[rnd.nextInt(4)];
        System.out.println("The color name is " + colorNames[randText]);

        gameText.setText(colorNames[randText]);

        int randHex = colors[rnd.nextInt(4)];
        System.out.println("randHex is" + randHex);
        System.out.println("The color hex is " + colorHex[randHex]);
        gameText.setTextColor(Color.parseColor(colorHex[randHex]));



        // returns a set of 4 colors.
        return colors;
    }

    /*
     * Takes in an integer array of 4 numbers.
     * the numbers are called in their respective arrays.
     */
    public void makeBorders(Integer[] choices){
        System.out.println("Generating borders");

        System.out.println(choices[0]);
        System.out.println(choices[1]);
        System.out.println(choices[2]);
        System.out.println(choices[3]);


        top.setImageResource(topEdges[choices[0]]);
        bot.setImageResource(botEdges[choices[1]]);
        left.setImageResource(leftEdges[choices[2]]);
        right.setImageResource(rightEdges[choices[3]]);


    }
}
