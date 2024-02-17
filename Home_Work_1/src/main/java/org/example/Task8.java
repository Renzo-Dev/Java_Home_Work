package org.example;

import java.util.Scanner;

public class Task8 {
    static void run(){
        Scanner scanner = new Scanner(System.in);

        // Запрашиваем у пользователя ввод диапазона
        System.out.println("Введите начало диапазона:");
        int start = scanner.nextInt();
        System.out.println("Введите конец диапазона:");
        int end = scanner.nextInt();

        // Проверяем корректность диапазона
        if (start <= 0 || end <= 0 || start > end) {
            System.out.println("Ошибка: Введены некорректные границы диапазона.");
            return;
        }

        // Выводим таблицу умножения в указанном диапазоне
        for (int i = start; i <= end; i++) {
            System.out.println("Таблица умножения для " + i + ":");
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " * " + j + " = " + (i * j));
            }
            System.out.println(); // Добавляем пустую строку между таблицами
        }
    }
}
