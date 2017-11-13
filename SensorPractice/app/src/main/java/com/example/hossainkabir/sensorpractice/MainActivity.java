package com.example.hossainkabir.sensorpractice;

import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    private TextView textView;

    private SensorManager sensorManager;

    private List<Sensor> mySensor;

    String sensor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView=(TextView)findViewById(R.id.sensorList);
        sensorManager=(SensorManager) getSystemService(SENSOR_SERVICE);

        mySensor=sensorManager.getSensorList(Sensor.TYPE_ALL);
        textView.setMovementMethod(new ScrollingMovementMethod());

        for(int i=0;i<mySensor.size();i++){
            sensor=("\n"+mySensor.get(i).getName()+"\n"+mySensor.get(i).getVendor()+"\n"+mySensor.get(i).getVersion());
            textView.append(sensor);

        }



    }
}
