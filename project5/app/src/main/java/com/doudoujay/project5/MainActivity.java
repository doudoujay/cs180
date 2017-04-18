package com.doudoujay.project5;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.SoundEffectConstants;
import android.view.View;
import android.widget.GridView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

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
    private Stack<int[][]> history = new Stack<>();
    private Stack<int[][]> redoHistory = new Stack<>();

    @Override
    protected void onStart() {
        super.onStart();

    }

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
//        Clear redohistory
        redoHistory = new Stack<>();
        recordHistory();
        while (twentyFortyEight.moveUp()) {

        }
        twentyFortyEight.placeRandom();
        //        view update
        customGrid.updateGrid(twentyFortyEight.getBoard());
        scoreBox.setText(String.valueOf(twentyFortyEight.getScore()));
        view.playSoundEffect(SoundEffectConstants.NAVIGATION_DOWN);

    }

    /**
     * Method invoked when the Down button is pressed
     *
     * @param view - the UI of the app
     */
    public void downAction(View view) {
        //        Clear redohistory
        redoHistory = new Stack<>();
        recordHistory();
        while (twentyFortyEight.moveDown()) {

        }
        twentyFortyEight.placeRandom();
        //        view update
        customGrid.updateGrid(twentyFortyEight.getBoard());
        scoreBox.setText(String.valueOf(twentyFortyEight.getScore()));
        view.playSoundEffect(SoundEffectConstants.NAVIGATION_DOWN);

    }

    /**
     * Method invoked when the Left button is pressed
     *
     * @param view - the UI of the app
     */
    public void leftAction(View view) {
        //        Clear redohistory
        redoHistory = new Stack<>();
        recordHistory();
        while (twentyFortyEight.moveLeft()) {

        }
        twentyFortyEight.placeRandom();
        //        view update
        customGrid.updateGrid(twentyFortyEight.getBoard());
        scoreBox.setText(String.valueOf(twentyFortyEight.getScore()));
        view.playSoundEffect(SoundEffectConstants.NAVIGATION_LEFT);
    }

    /**
     * Method invoked when the Right button is pressed
     *
     * @param view - the UI of the app
     */
    public void rightAction(View view) {
        //        Clear redohistory
        redoHistory = new Stack<>();
        recordHistory();
        while (twentyFortyEight.moveRight()) {

        }
        twentyFortyEight.placeRandom();
        //        view update
        customGrid.updateGrid(twentyFortyEight.getBoard());
        scoreBox.setText(String.valueOf(twentyFortyEight.getScore()));
        view.playSoundEffect(SoundEffectConstants.NAVIGATION_RIGHT);
    }

    public void resetAction(View view) {
//        Reset data structure
        history = new Stack<>();
        redoHistory = new Stack<>();
//        Reset the view and 2048 data
        customGrid.reset();
        twentyFortyEight.reset();
        customGrid.updateGrid(twentyFortyEight.getBoard());
        scoreBox.setText(String.valueOf(twentyFortyEight.getScore()));
    }

    public void undoAction(View view) {
        Log.i("jay", "undo typed");
//        TODO
        if (history.size() == 0) {

            new AlertDialog.Builder(this)
                    .setTitle("Error")
                    .setMessage("No more history")
                    .setIcon(android.R.drawable.ic_dialog_alert)
                    .show();
        } else {
//            Record the current board in redoHistory
            recordRedo();

//        Change modal
            int[][] temp = history.pop();
            twentyFortyEight.setBoard(temp);
//       Change view
            customGrid.updateGrid(twentyFortyEight.getBoard());
        }

    }

    public void redoAction(View view) {
//        TODO
        if (redoHistory.size() == 0) {
            new AlertDialog.Builder(this)
                    .setTitle("Error")
                    .setMessage("No more redo history")
                    .setIcon(android.R.drawable.ic_dialog_alert)
                    .show();
        } else {

            int[][] temp = redoHistory.pop();
//            Store the poped data in history
            recordHistory();
            twentyFortyEight.setBoard(temp);
            customGrid.updateGrid(twentyFortyEight.getBoard());
        }


    }

    public void recordHistory() {
        int x = twentyFortyEight.getBoard().length;
        int y = twentyFortyEight.getBoard()[0].length;
        int[][] hist = new int[x][y];
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                hist[i][j] = twentyFortyEight.getBoard()[i][j];
            }

        }
        history.push(hist);
    }

    public void recordRedo() {
        int x = twentyFortyEight.getBoard().length;
        int y = twentyFortyEight.getBoard()[0].length;
        int[][] hist = new int[x][y];
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                hist[i][j] = twentyFortyEight.getBoard()[i][j];
            }

        }
        redoHistory.push(hist);
    }

}