package edu.neu.ccs.workouttracker.model;

import java.util.Date;

/**
 * Represents a basic weightlifting session
 */
class BasicSession implements Session {
    Date date;
    private WorkoutType type;
    private int[] setReps;
    private int[] setWeights;
    private int rating;

    public BasicSession(Date date, WorkoutType type, int[] setReps, int[] setWeights,  int rating) {
        this.date = date;
        this.type = type;
        this.setReps = setReps;
        this.setWeights = setWeights;
        this.rating = rating;
    }

    @Override
    public Date getDate() {
        return date;
    }

    @Override
    public WorkoutType getType() {
        return type;
    }

    @Override
    public int getSetNum() {
        return setReps.length;
    }

    @Override
    public int[] getSetWeights() {
        return setWeights;
    }

    @Override
    public int[] getSetReps() {
        return setReps;
    }

    @Override
    public int getRating() {
        return rating;
    }
}
