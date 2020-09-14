package com.company;

public class Box extends Shape {
    Box(){}
    Box(double x, double y, double z){
        super.volume = x*y*z;
    }
    double x, y, z;
    double counter;

    boolean add(Shape object) {
        double object_volume = object.getVolume();
        if (object_volume + counter < volume) {
            counter += object_volume;
            return true;
        }else{
            return false;
        }
    }

    double getVolume(){
        return super.volume;
    }

    double getCounter(){
        return counter;
    }
}
