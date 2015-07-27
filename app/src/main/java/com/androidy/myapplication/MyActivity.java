package com.androidy.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;


public class MyActivity extends Activity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);

        // make sure when declaring variables that you do not just put in name. R.is.name

        final TextView factLabel = (TextView) findViewById(R.id.factTextView);

        Button showFactButton = (Button) findViewById(R.id.showFactButton);

        final RelativeLayout Layout = (RelativeLayout) findViewById(R.id.theLayout);



        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                theFacts myFact = new theFacts();
               String theFactIWillUse = myFact.getFact();

                factLabel.setText(theFactIWillUse);

                theColors myColor = new theColors();
                int theRealColor = myColor.getColor();
                Layout.setBackgroundColor(theRealColor);

            }
        };

        showFactButton.setOnClickListener(listener);


    }

}
