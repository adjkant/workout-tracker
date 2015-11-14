package edu.neu.ccs.workouttracker.model;

import java.util.ArrayList;

/**
 * Represents the model of Workout Tracker and its capabilities
 */
public interface Model {

    Workout getWorkout(String name);
    ArrayList<Workout> getWorkouts(WorkoutArea type);
    ArrayList<Workout> getPowerWorkouts(WorkoutArea type);
    ArrayList<Workout> getEnduranceWorkouts(WorkoutArea type);

    boolean addPowerWorkout(String name, ArrayList<WorkoutArea> area, int[] setReps, int[] startSetWeights);
    boolean addEnduranceWorkout(String name, ArrayList<WorkoutArea> area, int sets, int startReps, int startWeight);

    boolean deleteWorkout(String name);
}
