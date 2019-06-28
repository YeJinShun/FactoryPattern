package com.example.dell.factorypattern.bean;

import android.util.Log;

import com.example.dell.factorypattern.api.Shape;

public class Rectangle implements Shape {
    @Override
    public void draw() {
        Log.e("tag","Rectangle的draw()");
    }
}
