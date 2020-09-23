package hw3_glazov;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.PreparedStatement;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Digits {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        startProgram();
    }

    private static void startProgram() {
        System.out.println("Начинаем игру. Загадано число Х. Введите своё число.");

        int number = getNumber();
        compareInput(number);

        System.out.println("Вы проиграли! Повторить игру? 1 - да / 0 - нет");
        if (scanner.nextInt() == 0) {
            System.out.println("Игра окончена.");
            System.exit(0);
        } else startProgram();

    }

    // Формируем случайное число от 0 до 9.
    private static int getNumber() {
        int number = (int) (Math.random() * 10);
// Для проверки работы временно выводим сформированное число:
//        System.out.println("Отладочный вывод: Х = " + number);
        return number;
    }

    //Начинаем цикл из трёх попыток.
    private static void compareInput(int number) {
        for (int i = 0; i < 3; i++) {
            int a = scanner.hasNextInt() ? scanner.nextInt() : 100;
            if (a == 100) {
                System.out.println("Неправильный ввод. Игра окончена!");
                System.exit(0);

            } else if (number > a) {
                System.out.println("Ваше число меньше Х");
            } else if (number < a) {
                System.out.println("Ваше число больше Х");
            } else {
                System.out.println("Вы угадали! Повторить игру? 1 - да / 0 - нет");
                if (scanner.nextInt() == 0) {
                    System.out.println("Игра окончена.");
                    System.exit(0);
                } else startProgram();

            }

        }
    }
}




