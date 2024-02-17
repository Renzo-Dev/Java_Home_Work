package org.example;

import java.util.Scanner;

public class Task2 {
    static void run(){
        Scanner scanner = new Scanner(System.in);

        // Запрос пользователю ввести два числа
        System.out.println("Введите число:");
        double number = scanner.nextDouble();
        System.out.println("Введите процент:");
        double percent = scanner.nextDouble();

        // Вычисляем процент от числа
        double result = (percent / 100) * number;

        // Выводим результат
        System.out.println(percent + "% от " + number + " равно " + result);
    }
}
