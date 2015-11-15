package edu.neu.ccs.workouttracker;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

/**
 * Created by NJ on 11/14/15.
 */

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        addButtonClickListener();
    }

    public void addButtonClickListener()
    {
        Button newWorkoutSesh = (Button)findViewById(R.id.Button);
        newWorkoutSesh.setOnClickListener(new View.OnClickListener()); {

            @Override
            public void onClick(View View) {

                Intent intent = new intent());
                startActivities(Intent);
            }});

        Button newWorkout = (Button)findViewById(R.id.Button2) {
        newWorkout.setOnClickListener(new View.OnClickListener(); {

            @Override
            public void onClick(View view) {

                Intent intent = new intent( );
                startActivities(Intent);
            }}});

        Button newProgress = (Button)findViewById(R.id.Button3);
        newProgress.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                Intent intent = new intent(Intent.ACTION_VIEW());
                startActivities(Intent);
            }});

        Button checkProgress = (Button)findViewById(R.id.Button4);
        checkProgress.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                Intent intent = new intent());
                startActivities(Intent);
            }})

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