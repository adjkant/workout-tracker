package edu.neu.ccs.workouttracker;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

/**
 * Created by NJ on 11/14/15.
 */
public class AddNewWorkoutActivity extends Activity{

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.add_new_workout);
        Button power = (Button) findViewById(R.id.PowerButton);
        Button endurance = (Button) findViewById(R.id.EnduranceButton);
        power.setOnClickListener(onClickListener);
        endurance.setOnClickListener(onClickListener);

    }

    private View.OnClickListener onClickListener = new View.OnClickListener() {
        @Override
        public void onClick(final View v) {
            switch(v.getId()){
                case R.id.EnduranceButton:
                    enduranceQuestions(v);
                    break;

                case R.id.PowerButton:
                    powerQuestions(v);
                    break;
            }
        }
    };

    public void enduranceQuestions(View v) {
        // view the endurance questions
        LinearLayout endurance = (LinearLayout) findViewById(R.id.enduranceLayout);
        endurance.setVisibility(View.VISIBLE);
    }

    public void powerQuestions(View view) {
        // view the endurance questions
        LinearLayout power = (LinearLayout) findViewById(R.id.powerLayout);
        power.setVisibility(View.VISIBLE);

    }

}
