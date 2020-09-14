package com.company;

public class Main {

    public static void main(String[] args) {
        Box box = new Box(8,12,16);
        Shape[] arr = new Shape[]{new Pyramid(4,2), new Cylinder(7,3), new Ball(1)};

        while(true){
            int n = (int)Math.floor(Math.random() * arr.length);
            if (box.add(arr[n]) == true) {
                System.out.printf("Был добавлен %s площадью %.2f. Содержимое ящика: %.1f/%.1f", arr[n].name(), arr[n].getVolume(), box.getCounter(),box.getVolume());
                System.out.println();
            }else {
                break;
            }
        }
    }
}