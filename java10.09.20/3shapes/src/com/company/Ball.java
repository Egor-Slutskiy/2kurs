package com.company;

public class Ball extends SolidOfRevolution {
    Ball(){}
    Ball(double radius){
        super.radius = radius;
        super.volume = 4*3.14*Math.pow(radius, 2);
    }

    void setR(double radius){
        super.radius = radius;
        super.volume = 4*3.14*Math.pow(radius, 2);
    }

    double getVolume(){
        return super.volume;
    }

    double getRadius(){
        return super.radius;
    }

    String name(){
        return "шар";
    }
}
