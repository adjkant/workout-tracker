package edu.neu.ccs.workouttracker.model;

import java.util.ArrayList;

import edu.neu.ccs.workouttracker.exceptions.WorkoutNotFoundException;

import android.content.Context;

/**
 * The model for Workout Tracker
 */
public class WTModel implements Model {
    private Context context;
    private ArrayList<Workout> workouts = new ArrayList<>();
    private DataAdapter data;

    public WTModel(Context c) {
        this.context = c;
        this.data = new CSVAdapter(workouts, context);
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
                if (w.getAreas().contains(area)) {
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

    @Override
    public boolean addPowerWorkout(String name, ArrayList<WorkoutArea> area, int[] setReps, int[] startSetWeights) {
        return workouts.add(new BasicWorkout(name, WorkoutType.POWER, area, setReps, startSetWeights));
    }

    @Override
    public boolean addEnduranceWorkout(String name, ArrayList<WorkoutArea> area, int sets, int startReps, int startWeight) {
        int[] setReps = new int[sets];
        int[] setWeights = new int[sets];
        for (int i = 0; i < sets; i += 1) {
            setReps[i] = startReps;
            setWeights[i] = startWeight;
        }
        return workouts.add(new BasicWorkout(name, WorkoutType.ENDURANCE, area, setReps, setWeights));
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
