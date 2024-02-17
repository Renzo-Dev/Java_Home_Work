package org.example;

import java.util.Random;

public class Task9 {
    static void run() {
        int[] array = generateRandomArray(20, -10, 10);

        // Выводим массив на экран
        System.out.println("Массив случайных чисел:");
        printArray(array);

        // Определяем минимальный и максимальный элементы массива
        int min = array[0];
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
            if (array[i] > max) {
                max = array[i];
            }
        }

        // Считаем количество отрицательных, положительных и нулевых элементов
        int negativeCount = 0;
        int positiveCount = 0;
        int zeroCount = 0;
        for (int num : array) {
            if (num < 0) {
                negativeCount++;
            } else if (num > 0) {
                positiveCount++;
            } else {
                zeroCount++;
            }
        }

        // Выводим результаты на экран
        System.out.println("\nМинимальный элемент: " + min);
        System.out.println("Максимальный элемент: " + max);
        System.out.println("Количество отрицательных элементов: " + negativeCount);
        System.out.println("Количество положительных элементов: " + positiveCount);
        System.out.println("Количество нулевых элементов: " + zeroCount);
    }

    // Функция генерации рандомных чисел в массив
    private static int[] generateRandomArray(int size, int min, int max) {
        Random random = new Random();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(max - min + 1) + min;
        }
        return array;
    }

    // Метод для вывода массива на экран
    private static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
