package com.sava;

import java.util.Scanner;

public class Middle {
    public static void main(String[] args) {
Scanner scanner=new Scanner(System.in);
        System.out.println("Количество рабочих дней в месяце:");
        int day = scanner.nextInt();
        System.out.println("Зарплата за день:");
        float money = scanner.nextFloat();
        float result = day*money;
        System.out.println("Зарплата за месяц:"+result);

        //Дискременант
        System.out.println("Дискриминант рассчитывается по формуле D=b^2-4ac");
        System.out.println("Введите число b:");
        float b = scanner.nextFloat();
        System.out.println("Введите число a:");
        float a = scanner.nextFloat();
        System.out.println("Введите число c:");
        float c = scanner.nextFloat();
        float D = b*b-4*a*c;
        System.out.println("D="+D);

        // Hello java
        String s = "Hello Java!";
        System.out.println("Задана строка «Hello Java!»");
        System.out.println("Номер буквы J: "+s.indexOf('J'));
        System.out.println("Возведение в верхний регистр: "+s.toUpperCase());

        // Длинна строки
        System.out.println("Введите слово:");
        String r = scanner.next();
        System.out.println("Размер строки: "+r.length());
    }
}
