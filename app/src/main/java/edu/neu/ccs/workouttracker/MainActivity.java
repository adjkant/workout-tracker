package edu.neu.ccs.workouttracker;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by NJ on 11/14/15.
 */

public class MainActivity extends Activity {

    Button newWorkoutSesh;
    Button newWorkout;
    Button trackProgress;
    Button workoutList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Workout Session Button
        final Button newWorkoutSesh = (Button) findViewById(R.id.startSessionButton);
        newWorkoutSesh.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent newSesh = new Intent(MainActivity.this, NewEmptySession.class);
                startActivity(newSesh);
            }
        });

        //  Create New Workout Button
        final Button newWorkout = (Button) findViewById(R.id.addNewWorkoutButton);
        newWorkout.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent newWork = new Intent(MainActivity.this, AddNewWorkoutActivity.class);
                startActivity(newWork);
            }
        });

        //  Track Progress Button
        final Button trackProgress = (Button) findViewById(R.id.currentProgressButton);
        trackProgress.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent trackProg = new Intent(MainActivity.this, NewEmptySession.class);
                startActivity(trackProg);
            }
        });

        //  Workout List Button
        final Button workoutList = (Button) findViewById(R.id.allWorkoutsButton);
        workoutList.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent workList = new Intent(MainActivity.this, NewEmptySession.class);
                startActivity(workList);
            }
        });
    }
}

