package edu.neu.ccs.workouttracker;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.Arrays;
import java.util.List;

import butterknife.ButterKnife;

/**
 * Created by NJ on 11/14/15.
 */

public class MainActivity extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

/**
        ArrayAdapter<int> myAdapter = new ArrayAdapter<int>(
                this,
                android.R.layout.simple_list_item_1,myIntArray);

        ListView myList = (ListView)
                findViewById((R.id.listView);
        myList.setAdapter(myAdapter);
 **/
    }

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

    private void setupMessageButton()
    { // Set reference
        Button messageButton =  new Button( )
        // Set click action

    }

    }

}
