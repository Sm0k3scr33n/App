package com.example.bengabbard.imageapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final Button location_button = (Button)findViewById(R.id.location_button);
        final Button flashlight_button = (Button)findViewById(R.id.Flashlight_button);

        TextView one = (TextView) findViewById(R.id.one);
        one.setText("Welcome to the Application");


        assert location_button != null;
        location_button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub

                Intent Location = new Intent(getBaseContext(), Location.class);
                startActivity(Location);


            }
        });


        flashlight_button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg1) {
                // TODO Auto-generated method stub

                Intent Flashlight = new Intent(getBaseContext(), Flashlight.class);
                startActivity(Flashlight);


            }
        });


    }
}
