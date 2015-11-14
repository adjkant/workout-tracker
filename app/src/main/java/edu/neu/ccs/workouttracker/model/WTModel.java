package edu.neu.ccs.workouttracker.model;

import java.util.ArrayList;

import edu.neu.ccs.workouttracker.exceptions.WorkoutNotFoundException;

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

    @Override
    public Workout getWorkout(String name) {
        for (Workout w : this.workouts) {
            if (w.getName().equals(name)) {
                return w;
            }
        }
        throw new WorkoutNotFoundException("The workout you want does not exist");
    }


    @Override
    public ArrayList<Workout> getWorkouts(WorkoutArea type) {
        return searchWorkoutsByArea(this.workouts, type);
    }

    @Override
    public ArrayList<Workout> getPowerWorkouts(WorkoutArea type) {
        return this.searchWorkoutsByArea(this.searchWorkoutsByType(workouts, WorkoutType.POWER), type);
    }

    @Override
    public ArrayList<Workout> getEnduranceWorkouts(WorkoutArea type) {
        return this.searchWorkoutsByArea(this.searchWorkoutsByType(workouts, WorkoutType.ENDURANCE), type);
    }

    private ArrayList<Workout> searchWorkoutsByArea(ArrayList<Workout> workouts, WorkoutArea area) {
        if (area == null) {
            return workouts;
        } else {
            ArrayList<Workout> validWorkouts = new ArrayList<>();
            for (Workout w : workouts) {
                if (w.getArea() == area) {
                    validWorkouts.add(w);
                }
            }
            return validWorkouts;
        }
    }

    private ArrayList<Workout> searchWorkoutsByType(ArrayList<Workout> workouts, WorkoutType type) {
        if (type == null) {
            return workouts;
        } else {
            ArrayList<Workout> validWorkouts = new ArrayList<>();
            for (Workout w : workouts) {
                if (w.getType() == type) {
                    validWorkouts.add(w);
                }
            }
            return validWorkouts;
        }
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

    @Override
    public boolean deleteWorkout(String name) {
        for (int i = 0; i < this.workouts.size(); i += 1) {
            if (workouts.get(i).getName().equals(name)) {
                workouts.remove(i);
                return true;
            }
        }
        return false;
    }
}
