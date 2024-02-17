package org.example;

import java.util.Scanner;

public class Task6 {
    static void run(){
        Scanner scanner = new Scanner(System.in);

        // Запрашиваем у пользователя ввод количества метров
        System.out.println("Введите количество метров:");
        double meters = scanner.nextDouble();

        // Запрашиваем у пользователя выбор единицы измерения
        System.out.println("Выберите единицу измерения для конвертации (1 - мили, 2 - дюймы, 3 - ярды):");
        int choice = scanner.nextInt();

        // Выполняем конвертацию в зависимости от выбора пользователя
        switch (choice) {
            case 1:
                double miles = meters * 0.000621371;
                System.out.println("Результат: " + meters + " метров = " + miles + " миль.");
                break;
            case 2:
                double inches = meters * 39.3701;
                System.out.println("Результат: " + meters + " метров = " + inches + " дюймов.");
                break;
            case 3:
                double yards = meters * 1.09361;
                System.out.println("Результат: " + meters + " метров = " + yards + " ярдов.");
                break;
            default:
                System.out.println("Ошибка: Выбрана неверная единица измерения.");
        }
    }
}
