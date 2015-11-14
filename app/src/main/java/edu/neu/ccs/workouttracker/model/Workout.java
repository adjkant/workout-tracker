package edu.neu.ccs.workouttracker.model;

import java.util.ArrayList;

/**
 * Represents a weight workout
 */
public interface Workout {
    String getName();
    WorkoutType getType();
    ArrayList<WorkoutArea> getAreas();

    int getSetNum();
    ArrayList<Session> getSessions();
    Session getRecentSession();

    boolean changeName(String name);
    boolean changeAreas(ArrayList<WorkoutArea> a);
    boolean changeSetNum(int[] setReps, int[] setWeights);
    boolean changeSetReps(int[] setReps);
    boolean changeSetWeights(int[] setWeights);

    boolean addSession(int[] setReps, int[] setWeights, int rating);
    boolean changeLastSession(int[] setReps, int[] setWeights, int rating);
}
