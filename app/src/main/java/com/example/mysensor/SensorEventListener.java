package com.example.mysensor;

import android.hardware.Sensor;
import android.hardware.SensorEvent;

public interface SensorEventListener {
    abstract void onSensorChanged(SensorEvent event);

    void onAccuraChanged(Sensor sensor, int accuracy);
}
