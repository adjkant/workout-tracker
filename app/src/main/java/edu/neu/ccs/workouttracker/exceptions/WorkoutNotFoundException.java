package edu.neu.ccs.workouttracker.exceptions;

/**
 * An error that a workout that has not been found
 */
public class WorkoutNotFoundException extends CustomException {
    public WorkoutNotFoundException(String message) {
        super(message);
    }
}

