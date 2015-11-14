package edu.neu.ccs.workouttracker.model;

import java.util.ArrayList;

/**
 * Represents a weight workout
 */
public interface Workout {
    String getName();
    WorkoutType getType();
    WorkoutArea getArea();

    ArrayList<Session> getSessions();
    Session getRecentSession();

    boolean changeName(String name);
    boolean changeSetNum(int[] setReps, int[] setWeights);
    boolean changeSetReps(int[] setReps);
    boolean changeSetWeights(int[] setWeights);

    boolean addSession(int[] setReps, int[] setWeights);
    boolean changeLastSession(int[] setReps, int[] setWeights);
}
