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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        //  Workout Session Button
        final Button newWorkoutSesh = (Button)findViewById(R.id.Button);
        newWorkoutSesh.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent newSesh = new Intent(MainActivity.this, NewEmptySession.class);
                startActivity(newSesh);
            }
        });

        //  Create New Workout Button
        final Button newWorkout = (Button)findViewById(R.id.Button2);
        newWorkout.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent newWork = new Intent(MainActivity.this, AddNewWorkoutActivity.class);
                startActivity(newWork);
            }
        });
        //  Track Progress Button
        final Button trackProgress = (Button)findViewById(R.id.Button3);
        trackProgress.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent trackProg = new Intent(MainActivity.this, NewEmptySession.class);
                startActivity(trackProg);
            }
        });

        //  Workout List Button
        final Button workoutList = (Button)findViewById(R.id.Button4);
        workoutList.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent workList = new Intent(MainActivity.this, NewEmptySession.class);
                startActivity(workList);
            }
        });}}

        /**
        @Override
        public boolean onCreateOptionsMenu(Menu menu) {
            // Inflate the menu; this adds items to the action bar if it is present.
            getMenuInflater().inflate(R.menu.menu_main, menu);
            return true;
        }
        @Override
        public boolean onOptionsItemSelected(MenuItem item) {
            // Handle action bar item clicks here. The action bar will
            // automatically handle clicks on the Home/Up button, so long
            // as you specify a parent activity in AndroidManifest.xml.
            int id = item.getItemId();

            //noinspection SimplifiableIfStatement
            if (id == R.id.action_settings) {
                return true;
            }

            return super.onOptionsItemSelected(item);
        }

        public void enduranceQuestions(View view)
        {
            // view the endurance questions
            LinearLayout endQuestions = (LinearLayout) findViewById(R.id.endurance);
        }

        public void powerQuestions(View view) {
            // view the endurance questions
            LinearLayout powerQuestions = (LinearLayout) findViewById(R.id.power);
        }

}}}
**/
