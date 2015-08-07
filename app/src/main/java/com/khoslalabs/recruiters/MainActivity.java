package com.khoslalabs.recruiters;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import com.khoslalabs.recruiters.models.Naukri;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent intent= getIntent();
        if(intent!=null) {
            Naukri naukri = (Naukri) intent.getSerializableExtra("recruiterlist");
            int position = intent.getIntExtra("pos",0);

            String Name = naukri.getResults().getCollection1().get(position).getName().getText();
            String Location = naukri.getResults().getCollection1().get(position).getLocation();
            String active = naukri.getResults().getCollection1().get(position).getActiveJobs().getText();
            String Des = naukri.getResults().getCollection1().get(position).getPosition();
            TextView name = (TextView) findViewById(R.id.main_name);
            TextView location = (TextView) findViewById((R.id.main_location));
            TextView des = (TextView) findViewById(R.id.main_position);
            TextView activejobs = (TextView) findViewById(R.id.main_activejobs);
            name.setText(Name);
            location.setText(Location);
            des.setText(Des);
            activejobs.setText(active);

        }
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
}
