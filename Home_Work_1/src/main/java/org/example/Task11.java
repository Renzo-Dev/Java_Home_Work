package org.example;

import java.util.Scanner;

public class Task11 {
    static void run() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите длину линии:");
        int size = scanner.nextInt();

        System.out.println("Введите направление: 0 - горизонтально, 1 - вертикально");
        Direction direction;
        String input = scanner.next();
        if (input.charAt(0)==1){
            direction = Direction.VERTICAL;
        } else {
            direction = Direction.HORIZONTAL;
        }

        System.out.println("Введите символ, для построение линии:");
        input = scanner.next();
        // Получаем первый символ из введенного слова
        char symbol = input.charAt(0);

        drawLine(size,direction, symbol);
    }

    // Перечисление для направления линии
    public enum Direction {
        HORIZONTAL,
        VERTICAL
    }

    // Метод для отображения линии
    public static void drawLine(int length, Direction direction, char symbol) {
        switch (direction) {
            case HORIZONTAL:
                for (int i = 0; i < length; i++) {
                    System.out.print(symbol);
                }
                break;
            case VERTICAL:
                for (int i = 0; i < length; i++) {
                    System.out.println(symbol);
                }
                break;
            default:
                System.out.println("Ошибка: Некорректное направление.");
        }
    }
}
