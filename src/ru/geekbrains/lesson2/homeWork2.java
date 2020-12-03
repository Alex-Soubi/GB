package ru.geekbrains.lesson2;

public class homeWork2 {
    public static void main(String[] args) {
        int[] change0And1 = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i<change0And1.length; i++) {
            if (change0And1[i] == 1) {
                change0And1[i] = 0;
            }
            else {
                change0And1[i] = 1;
            }
        }
        fillTheArray(8);
        int[]arra = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        ifMin6Double(arra);
        diagonalsInTheTable(5,5);
        int[] minMax = {6, 800, 674, 5, 43, 87, 25, 13};
        minAndMaxInArray(minMax);
        int[] summ = {1, 2, 1, 1, 1};
        System.out.println(summLeftAndRightAreEqual(minMax));
    }
    public static void fillTheArray(int a) {
        int[] arr = new int[a];
        int j = 0;
        for (int i = 0; i < a; i++) {
            arr[i] = j;
            j += 3;
            }
        }
        public static void ifMin6Double(int[] b) {
        for (int i = 0; i < b.length; i++) {
            if (b[i] < 6) {
                b[i] = b[i] * 2;
            }
        }
        }
        public static void diagonalsInTheTable (int x, int y) {
        int[][] table = new int[x][y];
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                if (i == j || (i + j) == table.length - 1) {
                    table[i][j] = 1;
                }
                System.out.println(table[i][j]);
            }
        }
        }
    public static void minAndMaxInArray(int[] c) {
        int minimum = 2147483647;
        int maximum = -2147483648;
        for (int i = 0; i < c.length; i++) {
            if (c[i] < minimum) {
                minimum = c[i];
            }
            if (c[i] > maximum) {
                maximum = c[i];
            }
        }
        System.out.println(minimum);
        System.out.println(maximum);
    }
    public static boolean summLeftAndRightAreEqual(int[] d) {
        int a = d[0];
        int b = 0;
        for (int i = 0; i < d.length; i++) {
            b += d[i];
        }
        for (int j = 0; j < d.length; j++) {
            a = d[j];
            b = b - a;
            if (a == b) {
                break;
            }
        }
        if (a == b) return true;
        else return false;
    }
    public static void moveArrayLeftOrRight (int[] e, int n) {
        if (n > 0) {
            for (int i = 0; i < n; i++) {
                int memory = e[0];
                e[0] = e[e.length - 1];
                for (int j = 1; j < e.length - 1; j++) {
                    e[e.length - j] = e[e.length - j - 1];
                }
                e[1] = memory;
            }
            }
        else if(n < 0) {
            for (int g = 0; g > n; n--) {
                int memory = e[e.length - 1];
                e[e.length - 1] = e[0];

                for (int k = 1; k < e.length - 1; k++) {
                    e[k - 1] = e[k];
                }

                e[e.length - 2] = memory;
            }
        }
        }
    }




