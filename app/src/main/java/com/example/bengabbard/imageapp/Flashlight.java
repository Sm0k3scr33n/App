package com.example.bengabbard.imageapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by BenG on 3/20/2016.
 */
public class Flashlight extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.flashlight);

        final Button mainMenu = (Button)findViewById(R.id.mainmenubutton);
        final Button location_button = (Button)findViewById(R.id.button);


        TextView flashlightText = (TextView) findViewById(R.id.flashlightText);
        flashlightText.setText("welcome to the flashlight view");

        mainMenu.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub

                Intent Main = new Intent(getBaseContext(), MainActivity.class);
                startActivity(Main);


            }
        });


        location_button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub

                Intent Location = new Intent(getBaseContext(), Location.class);
                startActivity(Location);


            }
        });







    }



}