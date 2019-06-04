package com.example.ditha.flexlarnmobile;

import android.graphics.Color;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Giroscopio extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_giroscopio);
        final TextView textView;
        textView= findViewById(R.id.textView2);

        SensorManager sensorManager = (SensorManager) getSystemService(SENSOR_SERVICE);

        Sensor rotationVectorSensor = sensorManager.getDefaultSensor(Sensor.TYPE_ROTATION_VECTOR);

        // Create a listener
        SensorEventListener rvListener = new SensorEventListener() {
            @Override
            public void onSensorChanged(SensorEvent sensorEvent) {


                // More code goes here
                float[] rotationMatrix = new float[16];
                SensorManager.getRotationMatrixFromVector(
                        rotationMatrix, sensorEvent.values);
                // Remap coordinate system
                float[] remappedRotationMatrix = new float[16];
                SensorManager.remapCoordinateSystem(rotationMatrix,
                        SensorManager.AXIS_X,
                        SensorManager.AXIS_Z,
                        remappedRotationMatrix);

                // Convert to orientations
                float[] orientations = new float[3];
                SensorManager.getOrientation(remappedRotationMatrix, orientations);

                for(int i = 0; i < 3; i++) {
                    orientations[i] = (float)(Math.toDegrees(orientations[i]));
                    String text_result=String.format("%.0f",orientations[2]);
                    if(orientations[2] ==10) {

                        textView.setText(text_result);
                    }
                    else if(orientations[2] ==15) {
                        textView.setText(text_result);
                    }
                    else if(orientations[2] ==20) {
                        textView.setText(text_result);
                    }
                    else if(orientations[2] ==25) {
                        textView.setText(text_result);
                    }
                    else if(orientations[2] ==30) {
                        textView.setText(text_result);
                    }
                    else if(orientations[2] ==35) {
                        getWindow().getDecorView().setBackgroundColor(Color.YELLOW);
                    }
                    else if(orientations[2] ==40) {
                        getWindow().getDecorView().setBackgroundColor(Color.YELLOW);
                    }
                    else if(orientations[2] ==45) {
                        getWindow().getDecorView().setBackgroundColor(Color.YELLOW);
                    }
                    else if(orientations[2] ==50) {
                        getWindow().getDecorView().setBackgroundColor(Color.YELLOW);
                    }
                    else if(orientations[2] ==55) {
                        getWindow().getDecorView().setBackgroundColor(Color.YELLOW);
                    }else if(orientations[2] ==60) {
                        getWindow().getDecorView().setBackgroundColor(Color.YELLOW);
                    }
                    else if(orientations[2] ==65) {
                        getWindow().getDecorView().setBackgroundColor(Color.YELLOW);
                    }
                    else if(orientations[2] ==70) {
                        getWindow().getDecorView().setBackgroundColor(Color.YELLOW);
                    }
                    else if(orientations[2] ==75) {
                        getWindow().getDecorView().setBackgroundColor(Color.YELLOW);
                    }
                    else if(orientations[2] ==80) {
                        getWindow().getDecorView().setBackgroundColor(Color.YELLOW);
                    }
                    else if(orientations[2] ==85) {
                        getWindow().getDecorView().setBackgroundColor(Color.YELLOW);
                    }
                    else if(orientations[2] ==90) {
                        getWindow().getDecorView().setBackgroundColor(Color.YELLOW);
                    }
                    if(orientations[2] == -10) {
                        getWindow().getDecorView().setBackgroundColor(Color.YELLOW);
                    }
                    else if(orientations[2] == -15) {
                        getWindow().getDecorView().setBackgroundColor(Color.YELLOW);
                    }
                    else if(orientations[2] == -20) {
                        getWindow().getDecorView().setBackgroundColor(Color.YELLOW);
                    }
                    else if(orientations[2] == -25) {
                        getWindow().getDecorView().setBackgroundColor(Color.YELLOW);
                    }
                    else if(orientations[2] == -30) {
                        getWindow().getDecorView().setBackgroundColor(Color.YELLOW);
                    }
                    else if(orientations[2] == -35) {
                        getWindow().getDecorView().setBackgroundColor(Color.YELLOW);
                    }
                    else if(orientations[2] == -40) {
                        getWindow().getDecorView().setBackgroundColor(Color.YELLOW);
                    }
                    else if(orientations[2] == -45) {
                        getWindow().getDecorView().setBackgroundColor(Color.YELLOW);
                    }
                    else if(orientations[2] == -50) {
                        getWindow().getDecorView().setBackgroundColor(Color.YELLOW);
                    }
                    else if(orientations[2] == -55) {
                        getWindow().getDecorView().setBackgroundColor(Color.YELLOW);
                    }else if(orientations[2] == -60) {
                        getWindow().getDecorView().setBackgroundColor(Color.YELLOW);
                    }
                    else if(orientations[2] == -65) {
                        getWindow().getDecorView().setBackgroundColor(Color.YELLOW);
                    }
                    else if(orientations[2] == -70) {
                        getWindow().getDecorView().setBackgroundColor(Color.YELLOW);
                    }
                    else if(orientations[2] == -75) {
                        getWindow().getDecorView().setBackgroundColor(Color.YELLOW);
                    }
                    else if(orientations[2] == -80) {
                        getWindow().getDecorView().setBackgroundColor(Color.YELLOW);
                    }
                    else if(orientations[2] == -85) {
                        getWindow().getDecorView().setBackgroundColor(Color.YELLOW);
                    }
                    else if(orientations[2] == -90) {
                        getWindow().getDecorView().setBackgroundColor(Color.YELLOW);
                    }






                    }
                }

            @Override
            public void onAccuracyChanged(Sensor sensor, int accuracy) {

            }
        };

        // Register it
        sensorManager.registerListener(rvListener, rotationVectorSensor, SensorManager.SENSOR_DELAY_NORMAL);

    }
}


/*
*
*
* */