package org.example;

import java.util.Scanner;

public class Task4 {
    static void run(){
        Scanner scanner = new Scanner(System.in);

        // Запрашиваем у пользователя ввод шестизначного числа
        System.out.println("Введите шестизначное число:");
        int number = scanner.nextInt();

        // Проверяем, является ли введенное число шестизначным
        if (String.valueOf(number).length() != 6) {
            System.out.println("Ошибка: Введено число неправильной длины.");
        } else {
            // Получаем отдельные цифры числа
            int digit1 = number / 100000;
            int digit2 = (number / 10000) % 10;
            int digit3 = (number / 1000) % 10;
            int digit4 = (number / 100) % 10;
            int digit5 = (number / 10) % 10;
            int digit6 = number % 10;

            // Формируем новое число, меняя местами цифры
            int newNumber = digit6 * 100000 + digit5 * 10000 + digit4 * 1000 + digit3 * 100 + digit2 * 10 + digit1;

            // Выводим результат
            System.out.println("Полученное число: " + newNumber);
        }
    }
}
