package edu.neu.ccs.workouttracker.model;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;

/**
 * TODO
 */
public class SQLAdapter implements DataAdapter {
    private ArrayList<Workout> source;
    Context context;

    public SQLAdapter(ArrayList<Workout> source, Context context) {
        this.source = source;
        this.context = context;
        loadData();
    }

    @Override
    public boolean loadData() {
        SQLiteDatabase mydatabase = context.openOrCreateDatabase("Workouts", context.MODE_PRIVATE, null);
        mydatabase.execSQL("CREATE TABLE IF NOT EXISTS Workouts(Name VARCHAR, Type VARCHAR, AreasID INT, SessionID INT);");
        mydatabase.execSQL("INSERT INTO Workout VALUES('this','is', 1, 2);");

        return mydatabase.isOpen();
    }

    @Override
    public boolean saveData() {
        return false;
    }
}
