package edu.neu.ccs.workouttracker.exceptions;

/**
 * An error caused by bad data in a workout
 */
public class InvalidWorkoutDataException extends CustomException {
    public InvalidWorkoutDataException(String message) {
        super(message);
    }
}
