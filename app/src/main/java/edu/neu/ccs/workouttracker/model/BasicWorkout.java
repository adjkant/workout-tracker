package edu.neu.ccs.workouttracker.model;

import java.util.ArrayList;
import java.util.Date;

import edu.neu.ccs.workouttracker.exceptions.InvalidWorkoutDataException;

/**
 * TODO
 */
class BasicWorkout implements Workout {
    private String name;
    private WorkoutType type;
    private ArrayList<WorkoutArea> areas;

    private ArrayList<Session> sessions;

    private int[] setReps;
    private int[] setWeights;

    public BasicWorkout(String name, WorkoutType type, ArrayList<WorkoutArea> areas, int[] setReps, int[] setWeights) {
        this.name = name;
        this.type = type;
        this.areas = areas;
        this.setReps = setReps;
        this.setWeights = setWeights;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public WorkoutType getType() {
        return type;
    }

    @Override
    public ArrayList<WorkoutArea> getAreas() {
        return areas;
    }

    @Override
    public int getSetNum() {
        return setReps.length;
    }

    @Override
    public ArrayList<Session> getSessions() {
        return sessions;
    }

    @Override
    public Session getRecentSession() {
        return sessions.get(sessions.size() - 1);
    }

    @Override
    public boolean changeName(String name) {
        if (name.equals(this.name)) {
            return false;
        } else {
            this.name = name;
            return true;
        }
    }

    @Override
    public boolean changeAreas(ArrayList<WorkoutArea> a) {
        this.areas = a;
        return true;
    }

    @Override
    public boolean changeSetNum(int[] setReps, int[] setWeights) {
        if (setReps.length != setWeights.length) {
            throw new InvalidWorkoutDataException("Set reps do not match the number of set weights");
        }

        this.setReps = setReps;
        this.setWeights = setWeights;
        return true;
    }

    @Override
    public boolean changeSetReps(int[] setReps) {
        if (this.setReps.length != setReps.length) {
            throw new InvalidWorkoutDataException("Incorrect amount of reps");
        }

        this.setReps = setReps;
        return true;
    }

    @Override
    public boolean changeSetWeights(int[] setWeights) {
        if (this.setWeights.length != setWeights.length) {
            throw new InvalidWorkoutDataException("Incorrect amount of reps");
        }

        this.setWeights = setWeights;
        return true;
    }

    @Override
    public boolean addSession(int[] setReps, int[] setWeights, int rating) {
        return sessions.add(new BasicSession(new Date(), this.type, setReps, setWeights, rating));
    }

    @Override
    public boolean changeLastSession(int[] setReps, int[] setWeights, int rating) {
        sessions.remove(sessions.size() - 1);
        return addSession(setReps, setWeights, rating);
    }
}
