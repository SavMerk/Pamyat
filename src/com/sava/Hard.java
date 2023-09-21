package com.sava;

import java.util.Scanner;

public class Hard {
    public static void main(String[] args) {
        System.out.println("Задана строка «Hello world!». Вывести подстроку с 6 по 11 символ.");
        String s = "Hello world!";
        System.out.println(s.substring(6,11));

        System.out.println("Заданы координаты вершин треугольника, необходимо вычислить площадь");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите х координату первой точки");
        float x1 = scanner.nextFloat();
        System.out.println("Введите y координату первой точки");
        float y1 = scanner.nextFloat();
        System.out.println("Введите х координату второй точки");
        float x2 = scanner.nextFloat();
        System.out.println("Введите y координату второй точки");
        float y2 = scanner.nextFloat();
        System.out.println("Введите х координату третьей точки");
        float x3 = scanner.nextFloat();
        System.out.println("Введите y координату третьей точки");
        float y3 = scanner.nextFloat();
        float result = Math.abs((x2-x1)*(y3-y1)-(x3-x1)*(y2-y1));
        System.out.println("Площадь треугольника="+result*1/2);

    }
}
