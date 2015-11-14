package edu.neu.ccs.workouttracker.model;

import java.util.ArrayList;

/**
 * The model for Workout Tracker
 */
public class WTModel implements Model {
    ArrayList<Workout> workouts;

    public WTModel() {
        loadData();
    }

    // TODO
    @Override
    public boolean loadData() {
        return false;
    }


    // TODO
    @Override
    public boolean saveData() {
        return false;
    }

    // TODO
    @Override
    public Workout getWorkout(String name) {
        return null;
    }

    // TODO
    @Override
    public ArrayList<Workout> getWorkouts(WorkoutArea type) {
        return null;
    }

    // TODO
    @Override
    public ArrayList<Workout> getPowerWorkouts(WorkoutArea type) {
        return null;
    }

    // TODO
    @Override
    public ArrayList<Workout> getEnduranceWorkouts(WorkoutArea type) {
        return null;
    }

    // TODO
    @Override
    public boolean addPowerWorkout(String name, WorkoutArea area, int[] setReps, int[] startSetWeights) {
        return false;
    }

    // TODO
    @Override
    public boolean addEnduranceWorkout(String name, WorkoutArea area, int sets, int startReps, int startWeight) {
        return false;
    }

    // TODO
    @Override
    public boolean deleteWorkout(String name) {
        return false;
    }
}
