package com.example.ditha.flexlarnmobile;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Sensor_list extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sensor_list);

        Button giroscopio,magnetismo;
        giroscopio= findViewById(R.id.Giroscopio);
        magnetismo= findViewById(R.id.Magnetismo);
        giroscopio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pasogiroscopio= new Intent(Sensor_list.this,Giroscopio.class);
                startActivity(pasogiroscopio);

            }
        });
        magnetismo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pasomagnetismo= new Intent(Sensor_list.this,Magnetismo.class);
                startActivity(pasomagnetismo);

            }
        });
    }
}
