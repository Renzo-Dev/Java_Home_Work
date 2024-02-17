package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Task12 {
    static void run() {
        // Создаем массив для сортировки
        int[] array = {5, 2, 8, 1, 9};

        // Запрашиваем у пользователя выбор сортировки
        System.out.println("Выберите тип сортировки (1 - по возрастанию, 2 - по убыванию):");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        // Сортируем массив в зависимости от выбора пользователя
        if (choice == 1) {
            sortAscending(array);
            System.out.println("Отсортированный массив по возрастанию: " + Arrays.toString(array));
        } else if (choice == 2) {
            sortDescending(array);
            System.out.println("Отсортированный массив по убыванию: " + Arrays.toString(array));
        } else {
            System.out.println("Ошибка: Некорректный выбор.");
        }
    }

    // Метод для сортировки массива по возрастанию
    private static void sortAscending(int[] array) {
        Arrays.sort(array);
    }

    // Метод для сортировки массива по убыванию
    private static void sortDescending(int[] array) {
        Arrays.sort(array);
        reverseArray(array);
    }

    // Метод для обращения массива
    private static void reverseArray(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
    }
}