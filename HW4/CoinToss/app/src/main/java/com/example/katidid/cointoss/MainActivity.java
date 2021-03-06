package com.example.katidid.cointoss;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;


public class MainActivity extends ActionBarActivity {
    /**
     *
     * @param savedInstanceState
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     *
     * @param menu
     * @return
     */
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    /**
     *
     * @param item
     * @return
     */
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

    /**
     *
     * @param view
     */
    public void flipCoin(View view)
    {
        int coinResult;
        Random rand = new Random();
        coinResult = rand.nextInt(2)+1;

        TextView text = (TextView) findViewById(R.id.textView);

        ImageView headImage = (ImageView) findViewById(R.id.headsButton);
        ImageView tailImage = (ImageView) findViewById(R.id.tailsButton);

        if (coinResult == 1)
        {
            text.setText("heads");
            headImage.setVisibility(View.VISIBLE);
            tailImage.setVisibility(View.INVISIBLE);
        }
        else
        {
            text.setText("tails");
            headImage.setVisibility(View.INVISIBLE);
            tailImage.setVisibility(View.VISIBLE);
        }
    }
}
