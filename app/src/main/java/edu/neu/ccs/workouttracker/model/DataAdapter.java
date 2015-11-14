package edu.neu.ccs.workouttracker.model;

/**
 * Loads and saves data from a source
 */
interface DataAdapter {
    boolean loadData();
    boolean saveData();
}
