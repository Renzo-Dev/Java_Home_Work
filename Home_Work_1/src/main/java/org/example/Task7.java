package org.example;

import java.util.Scanner;

public class Task7 {
    static void run(){
        Scanner scanner = new Scanner(System.in);

        // Запрашиваем у пользователя ввод двух чисел
        System.out.println("Введите два числа:");
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();

        // Нормализуем границы диапазона, если первое число больше второго
        if (number1 > number2) {
            int temp = number1;
            number1 = number2;
            number2 = temp;
            System.out.println("Границы диапазона были нормализованы.");
        }

        // Выводим все нечетные числа в указанном диапазоне
        System.out.println("Нечетные числа в указанном диапазоне:");
        for (int i = number1; i <= number2; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }
}
