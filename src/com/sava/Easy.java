package com.sava;

import java.util.Scanner;

public class Easy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите значение для а:");
        int a =scanner.nextInt();
        System.out.println("Введите значение для b:");
        int b =scanner.nextInt();

        System.out.println("Пользователь ввел значение для a:"+b+" и b:"+a);
        System.out.println("Введите три вещественных числа");
        float one = scanner.nextFloat();
        float two = scanner.nextFloat();
        float three = scanner.nextFloat();
        float result_1 = one + two + three;
        float result_2 = one * two * three;
        System.out.println("Сумма трех чисел:"+result_1);
        System.out.println("Произведение трех чисел:"+result_2);
    }
    }
