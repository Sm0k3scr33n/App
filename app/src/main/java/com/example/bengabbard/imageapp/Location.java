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
public class Location  extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.location);

        final Button flashlight_button = (Button)findViewById(R.id.flashlight_btn);
        final Button mainMenu = (Button)findViewById(R.id.Mainbtn);
        TextView locationTitle = (TextView) findViewById(R.id.location_title);
        locationTitle.setText("welcome to the location view");




        mainMenu.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub

                Intent Main = new Intent(getBaseContext(), MainActivity.class);
                startActivity(Main);


            }
        });


        flashlight_button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub

                Intent Location = new Intent(getBaseContext(), Flashlight.class);
                startActivity(Location);


            }
        });


    }
}