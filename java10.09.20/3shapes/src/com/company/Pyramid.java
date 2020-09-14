package com.company;

public class Pyramid extends Shape {
    Pyramid(){}
    Pyramid(double s, double h){
        super.volume = (s * h)/3;
    }

    double s;
    double h;

    void setSH(double arg1, double arg2){
        this.s = arg1;
        this.h = arg2;
        super.volume = (this.s * this.h)/3;
    }

    double getVolume(){
        return super.volume;
    }

    String name(){
        return "пирамида";
    }
}