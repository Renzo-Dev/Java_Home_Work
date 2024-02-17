package org.example;

import java.util.Scanner;

public class Task3 {
    static void run(){
        Scanner scanner = new Scanner(System.in);

        // Запрашиваем у пользователя ввод трех цифр
        System.out.println("Введите первую цифру:");
        int firstDigit = scanner.nextInt();
        System.out.println("Введите вторую цифру:");
        int secondDigit = scanner.nextInt();
        System.out.println("Введите третью цифру:");
        int thirdDigit = scanner.nextInt();

        // Формируем число из введенных цифр
        int number = firstDigit * 100 + secondDigit * 10 + thirdDigit;

        // Выводим результат
        System.out.println("Сформированное число: " + number);
    }
}