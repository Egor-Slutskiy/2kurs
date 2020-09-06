package com.company;

import java.io.*;

public class Main {
    public static void nine(int args) {
        System.out.println("Разница между данным числом и 21: " + Math.abs(21-args));
    }

    public static void ten(int a, int b) {
        System.out.println("Среднее арифметическое двух чисел: " + (((float) a+b))/2);
    }

    public static void eleven(int a, int b) {
        System.out.printf("Среднее геометрическое двух чисел: %.4f", (Math.pow((a*b), 0.5)));
    }

    public static void twelve(float x1, float y1, float x2, float y2) {
        System.out.printf("Расстояние между двумя точками: %.2f", (Math.pow((Math.pow((x2-x1), 2) + Math.pow((y2-y1), 2)), 0.5)));
    }

    public static void main(String[] args) throws IOException {
        System.out.println("1. Hello!");
        System.out.println();


        int a = 4;
        System.out.println("2. Переменная а = " + a);
        System.out.println();


        int b = 0;
        System.out.println("3. Переменная b = " + b);
        b = ++b;
        System.out.println("b + 1 = " + b);
        b += 1;
        System.out.println("b + 1 = " + b);
        System.out.println();


        int c = 3;
        int d = 7;
        System.out.println("4. Переменные c,d = " + c + "," + d);
        int cache;
        cache = c;
        c = d;
        d = cache;
        System.out.println("Теперь c,d = " + c + "," + d);
        c = c + d - (d = c);
        System.out.println("Еще раз c,d = " + c + "," + d);
        System.out.println();


        System.out.println("5.");
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        System.out.print("Введите a: ");
        double a1 = Integer.parseInt((bufferedReader.readLine()));
        System.out.print("Введите b: ");
        double b1 = Integer.parseInt(bufferedReader.readLine());
        if (a1 > 0) {
            if (b1 > 0) {
                System.out.printf("Катет a = %.0f, катет b = %.0f. Гипотенуза = %.2f", a1, b1, Math.pow((Math.pow(a1, 2) + Math.pow(b1, 2)), 0.5));
                System.out.println();
                System.out.println();
            } else {
                System.out.println("Значение <= 0.");
            }
        } else {
            System.out.println("Значение <= 0.");
        }


        System.out.print("6.Введите число: ");
        int e = Integer.parseInt((bufferedReader.readLine()));
        System.out.println("Последняя цифра числа: " + e%10);
        System.out.println();


        System.out.print("7.Введите число: ");
        int f = Integer.parseInt((bufferedReader.readLine()));
        System.out.println("Вторая цифра с конца: " + f/10%10);
        System.out.println();


        System.out.print("8.Введите число (не очень понял что надо сделать): ");
        int g = Integer.parseInt((bufferedReader.readLine()));
        System.out.println("Число десятков: " + g/10);
        System.out.println();


        System.out.print("9. Введите число: ");
        int zxc = Integer.parseInt((bufferedReader.readLine()));
        nine(zxc);
        System.out.println();


        System.out.print("10. Введите первое число: ");
        int zx = Integer.parseInt((bufferedReader.readLine()));
        System.out.print("Введите второе число: ");
        int xc = Integer.parseInt((bufferedReader.readLine()));
        ten(zx, xc);
        System.out.println();


        System.out.print("11. Введите первое число: ");
        int zx1 = Integer.parseInt((bufferedReader.readLine()));
        System.out.print("Введите второе число: ");
        int xc1 = Integer.parseInt((bufferedReader.readLine()));
        eleven(zx1, xc1);
        System.out.println();


        System.out.print("12. Введите первую координату первой точки: ");
        float x1 = Float.parseFloat((bufferedReader.readLine()));
        System.out.print("Введите вторую координату первой точки: ");
        float y1 = Float.parseFloat((bufferedReader.readLine()));
        System.out.print("Введите первую координату второй точки: ");
        float x2 = Float.parseFloat((bufferedReader.readLine()));
        System.out.print("Введите вторую координату второй точки: ");
        float y2 = Float.parseFloat((bufferedReader.readLine()));
        twelve(x1,y1,x2,y2);
        System.out.println();
    }
}