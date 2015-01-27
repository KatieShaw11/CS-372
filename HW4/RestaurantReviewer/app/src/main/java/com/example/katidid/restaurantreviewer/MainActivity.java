package com.example.katidid.restaurantreviewer;

import android.annotation.TargetApi;
import android.os.Build;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.RatingBar;
import android.widget.TextView;
import java.io.*;

import java.util.ArrayList;


public class MainActivity extends ActionBarActivity {

    private ArrayList<Restaurant> restaurantList= new ArrayList <Restaurant>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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

    public void addNewRestaurant(View view)
    {
        EditText nametext = (EditText) findViewById(R.id.nameText);
        EditText addresstext = (EditText) findViewById(R.id.addressText);
        RatingBar ratingtext = (RatingBar) findViewById(R.id.ratingBar);
        EditText MessageLabel = (EditText) findViewById(R.id.MessageLabel);
        int numStars = ratingtext.getNumStars();

        Restaurant newRest = new Restaurant(nametext.getText().toString(), addresstext.getText().toString(), numStars, addresstext.getText().toString());

        File outFile = new File("/Users/katidid/desktop/RESTAURANTS.txt");

        try
        {
            FileWriter writer = new FileWriter(outFile, true);
            try
            {
                writer.write(newRest.toString() + "\n");
            }
            catch(IOException ex)
            {
                MessageLabel.setText("Didn't output.");
            }
            writer.close();
        }
        catch(IOException ex)
        {
            MessageLabel.setText("Didn't make file");
        }


    }
    @TargetApi(Build.VERSION_CODES.KITKAT)
    public void printToFile(File file)
    {
        EditText MessageLabel = (EditText) findViewById(R.id.MessageLabel);

        if (restaurantList.size() == 0)
        {
            try (BufferedReader reader = new BufferedReader(new FileReader(file)))
            {
                String line = null;
                while ((line = reader.readLine()) != null)
                {
                    try
                    {
                        Restaurant newRest = parseNewRest(line);
                        restaurantList.add(newRest);
                    }
                    catch(IllegalAccessException ex)
                    {
                        MessageLabel.setText("There was an error with parsing the rests.");
                    }

                }
            }
            catch (IOException x)
            {
                System.err.format("IOException: %s%n", x);
            }
        }
    }

    public Restaurant parseNewRest(String line) throws IllegalAccessException
    {
        Restaurant newRest = new Restaurant();
        EditText MessageLabel = (EditText) findViewById(R.id.MessageLabel);

        String phrase = line;
        String delims = ">";
        String[] phrases = phrase.split(delims);

        newRest.setName(phrases[0]);
        newRest.setAddress(phrases[1]);
        newRest.setNotes(phrases[2]);
        try
        {
            int rating = Integer.parseInt(phrases[3]);
            newRest.setRating(rating);
        }
        catch(IllegalArgumentException e)
        {
            MessageLabel.setText(e.getMessage());
            return null;
        }
        return newRest;
    }

}
