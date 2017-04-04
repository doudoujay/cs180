package com.doudoujay.lab11;
import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.GridView;
import android.widget.TextView;

/**
 * MainActivity class that serves the same purpose to an Android app as the heart does to humans
 * Basically, the most important class of the app
 *
 * @author Sahil Pujari (pujari@purdue.edu)
 * @author Tori Shurman (vshurman@purdue.edu)
 */
public class MainActivity extends AppCompatActivity {

    //The context of the app. Context is used to refer to certain resources of the app outside of
    //the MainActivity class
    private static Context mContext;

    /**
     * Get the context of the app
     *
     * @return the context of the app
     */
    public static Context getAppContext() {
        return mContext;
    }

    //An object of our TwentyFortyEight class
    private TwentyFortyEight twentyFortyEight;

    //An object of CustomGrid class
    private CustomGrid customGrid;

    //The score box text in the app
    private TextView scoreBox;

    /**
     * Called when the activity is starting.  This is where most initialization
     * should go.
     *
     * @param savedInstanceState If the activity is being re-initialized after
     *                           previously being shut down then this Bundle contains the data it most
     *                           recently supplied in {@link #onSaveInstanceState}.
     * @see #onSaveInstanceState
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mContext = getApplicationContext();
        twentyFortyEight = new TwentyFortyEight(4);
        customGrid = new CustomGrid();

        GridView grid = (GridView) findViewById(R.id.mainGrid);
        scoreBox = (TextView) findViewById(R.id.scoreBox);

        grid.setAdapter(customGrid);

        //TODO: Call the reset() method of your TwentyFortyClass to reset the board when the app
        //first starts

        twentyFortyEight.reset();
    }

    /**
     * Method invoked when the Up button is pressed
     *
     * @param view - the UI of the app
     */
    public void upAction(View view) {
        while(twentyFortyEight.moveUp()){

        }
        twentyFortyEight.placeRandom();
        customGrid.updateGrid(twentyFortyEight.getBoard());
        scoreBox.setText(String.valueOf(twentyFortyEight.getScore()));


    }

    /**
     * Method invoked when the Down button is pressed
     *
     * @param view - the UI of the app
     */
    public void downAction(View view) {
        while(twentyFortyEight.moveDown()){

        }
        twentyFortyEight.placeRandom();
        customGrid.updateGrid(twentyFortyEight.getBoard());
        scoreBox.setText(String.valueOf(twentyFortyEight.getScore()));

    }

    /**
     * Method invoked when the Left button is pressed
     *
     * @param view - the UI of the app
     */
    public void leftAction(View view) {
        while (twentyFortyEight.moveLeft()){

        }
        twentyFortyEight.placeRandom();
        customGrid.updateGrid(twentyFortyEight.getBoard());
        scoreBox.setText(String.valueOf(twentyFortyEight.getScore()));
    }

    /**
     * Method invoked when the Right button is pressed
     *
     * @param view - the UI of the app
     */
    public void rightAction(View view) {
        while (twentyFortyEight.moveRight()){

        }
        twentyFortyEight.placeRandom();
        customGrid.updateGrid(twentyFortyEight.getBoard());
        scoreBox.setText(String.valueOf(twentyFortyEight.getScore()));
    }
}