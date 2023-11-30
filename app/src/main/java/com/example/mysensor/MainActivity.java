package com.example.mysensor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements SensorEventListener {

    SensorManager mSersonManager;
    Sensor mSensorLight;
    TextView mtvLight = findViewById(R.id.tvSensorLight);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mSersonManager = (SensorManager) getSystemService(SENSOR_SERVICE);
        mSensorLight =  mSersonManager.getDefaultSensor(Sensor.TYPE_LIGHT);
        mSersonManager.registerListener((android.hardware.SensorEventListener) this,mSensorLight,SensorManager.SENSOR_DELAY_NORMAL);
    }

    @Override
    public void onSensorChanged(SensorEvent event){
        int sensoeType=event.sensor.getType();
        float currentValue=event.values[0];
        mtvLight.setText(Float.toString(currentValue));


    }
    @Override
    public void onAccuraChanged(Sensor sensor,int accuracy ){

    }
}