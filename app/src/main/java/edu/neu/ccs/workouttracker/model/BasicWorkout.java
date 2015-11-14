package edu.neu.ccs.workouttracker.model;

import java.util.ArrayList;

import edu.neu.ccs.workouttracker.exceptions.InvalidWorkoutDataException;

/**
 * TODO
 */
class BasicWorkout implements Workout {
    private String name;
    private WorkoutType type;
    private WorkoutArea area;

    private ArrayList<Session> sessions;

    private int[] setReps;
    private int[] setWeights;

    public BasicWorkout(String name, WorkoutType type, WorkoutArea area, int[] setReps, int[] setWeights) {
        this.name = name;
        this.type = type;
        this.area = area;
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
    public WorkoutArea getArea() {
        return area;
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
    public boolean changeSetNum(int[] setReps, int[] setWeights) {
        if (setReps.length != setWeights.length) {
            throw new InvalidWorkoutDataException("Set reps do not match the number of set weights");
        } else {
            this.setReps = setReps;
            this.setWeights = setWeights;
            return true;
        }
    }

    @Override
    public boolean changeSetReps(int[] setReps) {
        return false;
    }

    @Override
    public boolean changeSetWeights(int[] setWeights) {
        return false;
    }

    @Override
    public boolean addSession(int[] setReps, int[] setWeights) {
        return false;
    }

    @Override
    public boolean changeLastSession(int[] setReps, int[] setWeights) {
        return false;
    }
}
