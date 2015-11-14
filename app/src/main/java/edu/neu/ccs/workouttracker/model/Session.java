package edu.neu.ccs.workouttracker.model;

/**
 * Represents a workout session of weights
 */
public interface Session {
    WorkoutType getType();
    int getSetNum();
    int[] getSetWeights();
    int[] getSetReps();
    int getRating();
}
