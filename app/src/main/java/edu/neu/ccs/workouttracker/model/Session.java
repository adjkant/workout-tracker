package edu.neu.ccs.workouttracker.model;

import java.util.Date;

/**
 * Represents a workout session of weights
 */
interface Session {
    Date getDate();
    WorkoutType getType();
    int getSetNum();
    int[] getSetWeights();
    int[] getSetReps();
    int getRating();

}
