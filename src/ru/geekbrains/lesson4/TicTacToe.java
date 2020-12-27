package ru.geekbrains.lesson4;

import java.util.Random;
import java.util.Scanner;

public class TicTacToe {
    public static final int SIZE = 5;
    public static char[][] map = new char[SIZE][SIZE];
    public static final char DOT_EMPTY = '•';
    public static final char DOT_X = 'X';
    public static final char DOT_O = 'O';
    public static final int DOTS_TO_WIN = 4;
    public static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        initilizeGame();
        printMap();

        while (true) {
            humanTurn();
            printMap();
            if (checkEndGame(DOT_X)) break;

            computerTurn();
            printMap();
            if (checkEndGame(DOT_O)) break;
        }
    }

    private static boolean checkEndGame(char symbol) {
        if (checkWin(symbol)) {
            System.out.println(symbol == DOT_X ? "Человек победил!" : "Компьютер победил!");
            return true;
        }
        if (isMapFull()) {
            System.out.println("Ничья!");
            return true;
        }
        return false;
    }

    private static boolean isMapFull() {
        for (char[] row : map) {
            for (char cellValue : row) {
                if (cellValue == DOT_EMPTY) {
                    return false;
                }
            }
        }
        return true;
    }
    private static boolean checkWin(char symbol) {
        if (colCheckWin(symbol)) return true;
        else if (rowChekWin(symbol)) return true;
        return diagonalCheck(symbol);
    }
    private static boolean colCheckWin (char symbol) {
        int countSymbolCol = 0;
        for (int rowIndex = 0; rowIndex < SIZE; rowIndex++) {
            for (int colIndex = 0; colIndex < SIZE; colIndex++) {
                countSymbolCol = (map[rowIndex][colIndex] == symbol) ? countSymbolCol + 1 : 0;
                if (countSymbolCol == DOTS_TO_WIN) return true;
            }
        }
        return false;
    }
    private static boolean rowChekWin (char symbol) {
        int countSymbolRow = 0;
        for (int colIndex = 0; colIndex < SIZE; colIndex++) {
            for (int rowIndex = 0; rowIndex < SIZE; rowIndex++) {
                countSymbolRow = (map[rowIndex][colIndex] == symbol) ? countSymbolRow + 1 : 0;
                if (countSymbolRow == DOTS_TO_WIN) return true;
            }
        }
        return false;
    }
    private static boolean diagonalCheck (char symbol) {
        int countSymbolTop1 = 0;
        int countSymbolTop2 = 0;
        int countSymbolSide1 = 0;
        int countSymbolSide2 = 0;
        int countSymbolSide3 = 0;
        for (int index = 0; index < SIZE; index++) {
            countSymbolTop1 = (map[index][index] == symbol) ? countSymbolTop1 + 1 : 0;
            countSymbolTop2 = (map[index][map[index].length - 1 - index] == symbol) ? countSymbolTop2 + 1 : 0;
           // countSymbolSide1 = (map[index][index + 1] == symbol) ? countSymbolSide1 + 1 : 0;
           // countSymbolSide2 = (map[index][map[index].length - index] == symbol) ? countSymbolSide2 + 1: 0;
            //countSymbolSide3 = (map[index][map[index].length - 2 - index] == symbol) ? countSymbolSide3 + 1 : 0;
            if (countSymbolTop1 == DOTS_TO_WIN || countSymbolTop2 == DOTS_TO_WIN) return true;
            //else if (countSymbolSide1 == DOTS_TO_WIN || countSymbolSide2 == DOTS_TO_WIN || countSymbolSide3 == DOTS_TO_WIN) return true;
        }
        return false;
    }

    private static void humanTurn() {
        int rowIndex = -1;
        int colIndex = -1;
        do {
            System.out.print("Введите номер строки ");
            if (!SCANNER.hasNextInt()) {
                SCANNER.nextLine();
                System.out.println("Введите число!");
                continue;
            }
            rowIndex = SCANNER.nextInt() - 1;

            System.out.print("Введите номер столбца ");
            if (!SCANNER.hasNextInt()) {
                SCANNER.nextLine();
                System.out.println("Введите число!");
                continue;
            }
            colIndex = SCANNER.nextInt() - 1;
        } while (!isCellValid(rowIndex, colIndex, DOT_X));
        map[rowIndex][colIndex] = DOT_X;
    }
    private static void computerTurn() {
       int[] cell =  getWinTurn(DOT_O);
       if (cell == null) {
           cell =  getWinTurn(DOT_X);
           if (cell == null) {
               cell = randomComputerTurn(DOT_O);
           }
       }
       int indexRow = cell[0];
       int indexCol = cell[1];
        trialRun(indexRow, indexCol, DOT_O);
    }
    private static int[] getWinTurn(char symbol) {
        for (int indexRow = 0; indexRow < SIZE; indexRow++) {
            for (int indexCol = 0; indexCol < SIZE; indexCol++) {
                if (map[indexRow][indexCol] == DOT_EMPTY && isMoveWin(indexRow, indexCol, symbol)) {
                    return new int[] {indexRow,indexCol};
                }
            }
        }
        return null;
    }
    private static boolean isMoveWin(int indexRow, int indexCol, char symbol) {
        trialRun(indexRow, indexCol, symbol);
        boolean result = checkWin(symbol);
        trialRun(indexRow, indexCol, DOT_EMPTY);
        return result;
    }
    private  static void trialRun(int indexRow, int indexCol, char symbol) {
        map[indexRow][indexCol] = symbol;
    }
    private static int[] randomComputerTurn(char symbol) {
        int rowIndex = -1;
        int colIndex = -1;
        Random rand = new Random();
        do {
            rowIndex = rand.nextInt(SIZE);
            colIndex = rand.nextInt(SIZE);

        } while (!isCellValid(rowIndex, colIndex, DOT_O));
        return new int[] {rowIndex, colIndex};
    }
    private static boolean isCellValid(int rowIndex, int colIndex, char symbol) {
        if (!isArrayIndexValid(rowIndex) | !isArrayIndexValid(colIndex)) {
            System.out.println("Индексы строки и столбца должны быть от 1 до " + SIZE);
            return false;
        }
        if (map[rowIndex][colIndex] != DOT_EMPTY) {
            if (symbol == DOT_X) {
            System.out.println("Данная ячейка уже занята!");}
            return false;
        }
        return true;
    }

    private static boolean isArrayIndexValid(int index) {
        return index >= 0 && index < SIZE;
    }

    public static void printMap() {
        printHeader();
        printMapState();
        System.out.println();

    }

    private static void printMapState() {
        for (int rowIndex = 0; rowIndex < SIZE; rowIndex++) {
            System.out.print((rowIndex + 1) + " ");
            for (int colIndex = 0; colIndex < SIZE; colIndex++) {
                System.out.print(map[rowIndex][colIndex] + " ");
            }
            System.out.println();
        }
    }

    private static void printHeader() {
        for (int i = 0; i <= SIZE; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void initilizeGame( ) {
        for (int rowIndex = 0; rowIndex < SIZE; rowIndex++) {
            for (int colIndex = 0; colIndex < SIZE; colIndex++) {
                map[rowIndex][colIndex] = DOT_EMPTY;

            }

        }

    }
}
