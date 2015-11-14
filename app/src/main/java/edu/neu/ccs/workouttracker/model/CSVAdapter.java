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

    // TODO
    @Override
    public boolean saveData() {
        for (Workout w : this.source) {
            String workout = "";
            workout += w.getName();
            workout += "/";
            workout += w.getType().toString();
            workout += "/";
            String areas = "[";
            for (WorkoutArea a : w.getAreas()) {
                areas += a.toString();
                areas += "/";
            }
            areas += "]";
            workout += areas;
            workout += "/";
            workout += createSessionsString(w);
            workout += "\n";
            //fileOutput.write(workout);
        }
        return false;
    }

    private String createSessionsString(Workout w) {
        String sessions = "[";
        for (Session s : w.getSessions()) {
            String session = "[";
            session += s.getDate().getTime();
            session += "/";
            session += s.getType();
            session += "/";
            session += s.getSetReps().length;
            session += "/";

            String reps = "[";
            for (int i : s.getSetReps()) {
                reps += i;
                reps += "/";
            }
            reps += "]";

            session += reps;
            session += "/";

            String weights = "[";
            for (int i : s.getSetWeights()) {
                reps += i;
                reps += "/";
            }
            weights += "]";

            session += weights;
            session += "/";

            session += s.getRating();
            session += "]";

            sessions += session;
            sessions += "/";
        }
        return sessions;
    }
}
