package edu.neu.ccs.workouttracker.model;

import android.content.Context;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;

/**
 * TODO
 */
class CSVAdapter implements DataAdapter {
    private ArrayList<Workout> source;
    Context context;
    FileOutputStream fileOutput;
    FileInputStream fileInput;

    public CSVAdapter(ArrayList<Workout> source, Context context) {
        this.source = source;
        this.context = context;
        loadData();
    }

    // TODO
    @Override
    public boolean loadData() {
        try {
            fileInput = context.openFileInput("workouts.csv");
            fileOutput = context.openFileOutput("workouts.csv", Context.MODE_PRIVATE);
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }

        return false;
    }

    @Override
    public boolean saveData() {
        return false;
    }
}
