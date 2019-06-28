package com.example.dell.factorypattern.bean;

import android.util.Log;

import com.example.dell.factorypattern.api.Shape;

public class Circle implements Shape{
    @Override
    public void draw() {
        Log.e("tag","Circle的draw()");
    }
}
