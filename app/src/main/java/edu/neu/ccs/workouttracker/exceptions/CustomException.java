package edu.neu.ccs.workouttracker.exceptions;

/**
 * A simple custom exception
 */
public class CustomException extends RuntimeException {
    protected String message = "";

    public CustomException() {
        super();
    }

    protected CustomException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
