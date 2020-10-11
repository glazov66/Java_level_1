package hw4_glazov;

import java.util.Random;
import java.util.Scanner;

public class TicTacToe {

    public static final int SIZE = 5;
    public static final int DOTS_TO_WIN = 3;

    public static final char DOT_EMPTY = '•';
    public static final char DOT_HUMAN = 'X';
    public static final char DOT_AI = '0';

    public static final String EMPTY = " ";
    public static final String DOUBLEEMPTY = "  ";

    public static final char[][] map = new char[SIZE][SIZE];
    public static final Scanner scanner = new Scanner(System.in);
    public static final Random random = new Random();

    public static void main(String[] args) {

        turnGame();

    }

    private static void turnGame() {
        initMap();

        printMap();

        playGame();

    }


    //инициализация игрового поля

    private static void initMap() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                map[i][j] = DOT_EMPTY;
            }
        }
    }
    // печать игрового поля

    public static void printMap() {

        // вывод разметки игрового поля
        System.out.print(DOUBLEEMPTY);
        for (int i = 0; i < SIZE; i++) {
            System.out.print(i + 1 + EMPTY);
        }
        System.out.println();

        // вывод строк игрового поля
        for (int i = 0; i < SIZE; i++) {
            System.out.print(i + 1 + EMPTY);
            for (int j = 0; j < SIZE; j++) {
                System.out.print(map[i][j] + EMPTY);
            }
            System.out.println();
        }
    }

    private static void playGame() {

        while (true) { //следующий ход
            // ход игрока
            humanTurn();

            // вывод хода игрока
            printMap();

            // проверка результата хода
            if (checkEnd(DOT_HUMAN)) {
                System.exit(0);
            }

            // ход компьютера
            aiTurn();

            // вывод хода компьютера
            printMap();

            // проверка результата хода
            if (checkEnd(DOT_AI)) {
                System.exit(0);
            }

        }

    }

    private static void humanTurn() {
        int rowNumber, colNumber;
        do {
            System.out.println("Ваш ход! Введите номер строки");
            rowNumber = scanner.nextInt();
            System.out.println("Введите номер столбца");
            colNumber = scanner.nextInt();

        } while (!isSellValid(rowNumber, colNumber));

        map[rowNumber - 1][colNumber - 1] = DOT_HUMAN;
    }


    private static boolean isSellValid(int rowNumber, int colNumber, boolean isAI) {
        if (!isAI && ((rowNumber < 1) || (rowNumber > SIZE) || (colNumber < 1) || (colNumber > SIZE))) {
            System.out.println("\nНомера строки и столбца должны быть от 1 до " + SIZE);
            return false;

        }
        if (map[rowNumber - 1][colNumber - 1] != DOT_EMPTY) {
            if (!isAI)
                System.out.println("\nЭта ячейка занята. Выберите другую ячейку");
            return false;
        }

        return true;
    }

    private static boolean checkEnd(char symbol) {

        if (checkWin(symbol)) {
            String winMessage;
            if (symbol == DOT_HUMAN) {
                winMessage = "Поздравляем, Вы выиграли!";
            } else {
                winMessage = "К сожалению, компьютер Вас обыграл.";
            }
            System.out.println(winMessage);
            return true;

        }

        if (isMapFull()) {
            System.out.println("Ничья!");
            return true;

        }

        return false;

    }

    private static boolean checkWin(char symbol) {

        if (checkRow(symbol)) return true;

        if (checkColumn(symbol)) return true;

        if (checkMainDiags(symbol)) return true;

        if (checkBackDiags(symbol)) return true;

        return false;

    }

    private static boolean checkRow(char symbol) {
        for (int i = 0; i < SIZE; i++) {
            int winSymCountRow = 0;
            for (int j = 0; j < SIZE; j++) {

                if (map[i][j] == symbol) {
                    winSymCountRow++;
                }

                if (map[i][j] != symbol) {
                    winSymCountRow = 0;
                }
                if (winSymCountRow >= DOTS_TO_WIN) {
                    return true;
                }
            }

        }
        return false;
    }

    private static boolean checkColumn(char symbol) {
        for (int i = 0; i < SIZE; i++) {
            int winSymCountCol = 0;
            for (int j = 0; j < SIZE; j++) {

                if (map[j][i] == symbol) {
                    winSymCountCol++;
                }
                if (map[j][i] != symbol) {
                    winSymCountCol = 0;
                }
                if (winSymCountCol >= DOTS_TO_WIN) {
                    return true;
                }
            }

        }
        return false;
    }

    private static boolean checkMainDiags(char symbol) {
        for (int i = 0; i < SIZE; i++) {
            int winSymCountMainDiag = 0;
            for (int j = 0; j < SIZE; j++) {
                int b = SIZE - DOTS_TO_WIN - i + j;

                if (b < 0 || b > (SIZE - 1)) {
                    continue;
                }
                if (map[b][j] == symbol) {
                    winSymCountMainDiag++;
                }
                if (map[b][j] != symbol) {
                    winSymCountMainDiag = 0;
                }

                if (winSymCountMainDiag >= DOTS_TO_WIN) {
                    return true;
                }
            }

        }
        return false;
    }

    private static boolean checkBackDiags(char symbol) {
        for (int i = 0; i < SIZE; i++) {
            int winSymCountBackDiag = 0;
            for (int j = 0; j < SIZE; j++) {
                int b = SIZE - DOTS_TO_WIN - i + j;

                if (b < 0 || b > (SIZE - 1)) {
                    continue;
                }
                if (map[b][(SIZE - 1) - j] == symbol) {
                    winSymCountBackDiag++;
                }
                if (map[b][(SIZE - 1) - j] != symbol) {
                    winSymCountBackDiag = 0;
                }

                if (winSymCountBackDiag >= DOTS_TO_WIN) {
                    return true;
                }
            }

        }
        return false;
    }

    private static boolean isMapFull() {
        for (char[] chars : map) {
            for (char aChar : chars) {
                if (aChar == DOT_EMPTY) {
                    return false;
                }
            }
        }
        return true;
    }

    private static boolean isSellValid(int rowNumber, int colNumber) {
        return isSellValid(rowNumber, colNumber, false);

    }

    private static void aiTurn() {
        int rowNumber, colNumber;
        do {

            rowNumber = random.nextInt(SIZE) + 1;
            colNumber = random.nextInt(SIZE) + 1;

        } while (!isSellValid(rowNumber, colNumber, true));

        map[rowNumber - 1][colNumber - 1] = DOT_AI;

    }
}
