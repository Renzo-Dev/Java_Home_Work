package org.example;

import java.util.Scanner;

public class Task5 {
    static void run(){
        Scanner scanner = new Scanner(System.in);

        // Запрашиваем у пользователя ввод номера месяца
        System.out.println("Введите номер месяца (от 1 до 12):");
        int month = scanner.nextInt();

        // Проверяем, введено ли число в диапазоне от 1 до 12
        if (month >= 1 && month <= 12) {
            // Определяем сезон в зависимости от номера месяца
            String season;
            if (month == 12 || month <= 2) {
                season = "Winter";
            } else if (month >= 3 && month <= 5) {
                season = "Spring";
            } else if (month >= 6 && month <= 8) {
                season = "Summer";
            } else {
                season = "Autumn";
            }

            // Выводим результат
            System.out.println("Сезон: " + season);
        } else {
            // Выводим сообщение об ошибке, если номер месяца не в диапазоне от 1 до 12
            System.out.println("Ошибка: Введено неверное значение номера месяца.");
        }
    }
}