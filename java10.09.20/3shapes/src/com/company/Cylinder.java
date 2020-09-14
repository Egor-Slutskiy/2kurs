package com.company;

public class Cylinder extends SolidOfRevolution {
    Cylinder(){}
    Cylinder(double height, double radius){
        super.radius = radius;
        super.volume = 2*3.14*radius*height;
    }
    double height;

    void setRH(double radius, double height){
        this.height = height;
        super.radius = radius;
        super.volume = 2*3.14*radius*height;
    }

    double getVolume(){
        return super.volume;
    }

    double getRadius(){
        return super.radius;
    }

    String name(){
        return "цилиндр";
    }
}
