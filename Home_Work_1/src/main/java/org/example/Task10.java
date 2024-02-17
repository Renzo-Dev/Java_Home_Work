package org.example;

import java.util.Arrays;
import java.util.Random;

public class Task10 {
    static void run() {
        // Создаем массив случайных чисел
        int[] array = generateRandomArray(20, -10, 10);
        System.out.println("Исходный массив:");
        printArray(array);

        // Создаем массивы только с четными, нечетными, отрицательными и положительными числами
        int[] evenArray = filterEvenNumbers(array);
        int[] oddArray = filterOddNumbers(array);
        int[] negativeArray = filterNegativeNumbers(array);
        int[] positiveArray = filterPositiveNumbers(array);

        // Выводим результаты на экран
        System.out.println("\nМассив четных чисел:");
        printArray(evenArray);
        System.out.println("Массив нечетных чисел:");
        printArray(oddArray);
        System.out.println("Массив отрицательных чисел:");
        printArray(negativeArray);
        System.out.println("Массив положительных чисел:");
        printArray(positiveArray);
    }

    // Метод для генерации массива случайных чисел
    private static int[] generateRandomArray(int size, int min, int max) {
        Random random = new Random();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(max - min + 1) + min;
        }
        return array;
    }

    // Метод для фильтрации четных чисел из массива
    private static int[] filterEvenNumbers(int[] array) {
        return Arrays.stream(array).filter(num -> num % 2 == 0).toArray();
    }

    // Метод для фильтрации нечетных чисел из массива
    private static int[] filterOddNumbers(int[] array) {
        return Arrays.stream(array).filter(num -> num % 2 != 0).toArray();
    }

    // Метод для фильтрации отрицательных чисел из массива
    private static int[] filterNegativeNumbers(int[] array) {
        return Arrays.stream(array).filter(num -> num < 0).toArray();
    }

    // Метод для фильтрации положительных чисел из массива
    private static int[] filterPositiveNumbers(int[] array) {
        return Arrays.stream(array).filter(num -> num > 0).toArray();
    }

    // Метод для вывода массива на экран
    private static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}