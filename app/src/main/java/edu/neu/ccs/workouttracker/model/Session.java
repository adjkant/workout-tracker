package edu.neu.ccs.workouttracker.model;

import java.util.ArrayList;

/**
 * TODO
 */
public interface Session {
    WorkoutType getType();
    int getSetNum();
    ArrayList<Integer> getSetWeights();
    ArrayList<Integer> getSetReps();
    int getRating();
}
