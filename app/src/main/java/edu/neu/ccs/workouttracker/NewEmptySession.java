package edu.neu.ccs.workouttracker;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by NJ on 11/14/15.
 */
public class NewEmptySession extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        final Button button = (Button) findViewById(R.id.newWorkoutButton);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                Intent addNewWorkout = new Intent(NewEmptySession.this, AddNewWorkoutActivity.class);
                startActivity(addNewWorkout);
            }
        });
    }
}
