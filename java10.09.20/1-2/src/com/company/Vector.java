package com.company;

public class Vector {
    public static void main(String[] args) {
        System.out.println("Первый вектор: ");
        Vector_class vector1 = new Vector_class(5, -7, 20);
        vector1.print_vector();
        System.out.println();

        System.out.println("Второй вектор: ");
        Vector_class vector2 = new Vector_class(8, 9, 80);
        vector2.print_vector();
        System.out.println();

        System.out.println("Длинна вектора 1: ");
        System.out.println(vector1.length());

        System.out.println("Скалярное произведение векторов: ");
        System.out.println(vector1.scalar(vector2));
        System.out.println();

        System.out.println("Произведение векторов: ");
        vector1.vector_multiply(vector2).print_vector();
        System.out.println();

        System.out.println("Косинус угла между векторами: ");
        System.out.println(vector1.cos(vector2));
        System.out.println();

        System.out.println("Сложение векторов: ");
        vector1.sum(vector2).print_vector();
        System.out.println();

        System.out.println("Вычитание векторов: ");
        vector1.sub(vector2).print_vector();
        System.out.println();

        System.out.println("Массив случайных 10 векторов: ");
        Vector_class[] array = Vector_class.vectors(10);
        for(int i = 0; i < array.length; i++) {
            array[i].print_vector();
        }
    }
}

class Vector_class {
    int x;
    int y;
    int z;

    Vector_class(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    double length() {
        return Math.sqrt(Math.pow(this.x, 2) + Math.pow(this.y, 2) + Math.pow(this.z, 2));
    }

    double scalar(Vector_class vector2) {
        return (this.x * vector2.x) + (this.y * vector2.y) + (this.z * vector2.z);
    }

    Vector_class vector_multiply(Vector_class vector2) {
        int x = (this.y * vector2.z) - (this.z * vector2.y);
        int y = (this.z * vector2.x) - (this.x * vector2.z);
        int z = (this.x * vector2.y) - (this.y * vector2.x);

        return new Vector_class(x, y, z);
    }

    double cos(Vector_class vector2) {
        return this.scalar(vector2) / (this.length() + vector2.length());
    }

    Vector_class sum(Vector_class vector2) {
        return new Vector_class((this.x + vector2.x), (this.y + vector2.y), (this.z + vector2.z));
    }

    Vector_class sub(Vector_class vector2) {
        return new Vector_class((this.x - vector2.x), (this.y - vector2.y), (this.z - vector2.z));
    }

    static Vector_class[] vectors(int n) {
        Vector_class[] massiv = new Vector_class[n];
        for (int i = 0; i < n; i++) {
            Vector_class random_vector = new Vector_class(((int) ((Math.random() * 100) - 50)), ((int) ((Math.random() * 100) - 50)), ((int) ((Math.random() * 100) - 50)));
            massiv[i] = random_vector;
        }
        return massiv;
    }

    void print_vector() {
        System.out.println("(" + this.x + "; " + this.y + "; " + this.z + ")");
    }
}
