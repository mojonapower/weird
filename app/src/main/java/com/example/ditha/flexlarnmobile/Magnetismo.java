package com.example.ditha.flexlarnmobile;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class Magnetismo  extends AppCompatActivity implements SensorEventListener {

    TextView textView;
    private static SensorManager sensorManager;
    private Sensor sensor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.Magnetismo);
        textView=(TextView) findViewById(R.id.magneticfield);

        sensorManager = (SensorManager) getSystemService(Context.SENSOR_SERVICE);
        sensor =  sensorManager.getDefaultSensor(Sensor.TYPE_MAGNETIC_FIELD);

    }

    @Override
    protected void onResume() {
        super.onResume();

        if(sensor !=null ){
            sensorManager.registerListener(this,sensor, SensorManager.SENSOR_DELAY_NORMAL);
        }else{
            Toast.makeText(this,"not supported", Toast.LENGTH_SHORT).show();
        }

    }

    protected void onPause(){
        super.onPause();

        sensorManager.unregisterListener(this);

    }

    @Override
    public void onSensorChanged(SensorEvent event) {
        //Geomagnetic field strength along the x axis.
        float intensity_X = Math.round(event.values[0]);
        //	Geomagnetic field strength along the y axis.
        float intensity_Y= Math.round(event.values[1]);
        //Geomagnetic field strength along the z axis.
        float intensity_Z = Math.round(event.values[2]);

        float result = (float) Math.sqrt((intensity_X * intensity_X) + (intensity_Y * intensity_Y) + (intensity_Z * intensity_Z));

        String text_result=String.format("%.0f",result);

        textView.setText(text_result+"Tesla");
    }
    @Override
    public void onAccuracyChanged(Sensor sensor, int accuracy) {

    }
}
