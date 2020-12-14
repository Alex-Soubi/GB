package ru.geekbrains.lesson3;

import java.util.Scanner;

public class guessTheNumber {
    private static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        int a;
        do {
            System.out.println("В какую игру хочешь сыграть?");
            System.out.println("2 Нет");
            System.out.println("1 Угадай число");
            System.out.println("0 Угадай слово");
            a = scan.nextInt();
        } while (a < 0 || a > 2);
        while (a != 2)
        if (a == 1) { guessTheNumberGame(1); }
        else if (a == 0) { guessTheWord(0); }

    }
    public static void guessTheNumberGame(int a) {
        int numberSc;
        int number = (int) (Math.random() * 9);
        System.out.println("Ваша задачу угадать число от 0 до 9");
        while (true) {
        do {
            System.out.println("Введте число от 0 до 9");
            numberSc = scan.nextInt();
        } while (numberSc < 0 || numberSc > 9);
            if (numberSc == number) {
                System.out.println("Вы угадали.");
                break;
            } else if (numberSc > number) {
                System.out.println("Загаданное число меньше.");
            } else {
                System.out.println("Загаданное число больше.");
            }
        }
        do {
            System.out.println("Повторить игру еще раз?");
            System.out.println("0 Другая игра");
            System.out.println("1 Да");
            System.out.println("2 Нет");
            a = scan.nextInt();
        } while (a < 0 || a > 2);
        while (a != 2)
        if (a == 1) {guessTheNumberGame(1);}
        else if (a == 0) { guessTheWord(0); }

    }
    public static void guessTheWord(int a) {
        String o = scan.nextLine();
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
        String wordInput;
        String str = "###############";
        int i = (int) (Math.random() * (words.length - 1));
        String word = words[i];
        System.out.println("Ваша задача угадать слово");
        while (true) {
                System.out.println("Введте слово");
                wordInput = scan.nextLine();
            if (wordInput.equals(word)) {
                System.out.println("Вы угадали.");
                break;
            } else {
                if (word.length() < wordInput.length()) {
                    for (int j = 0; j < word.length(); j++) {
                        if (word.charAt(j) == wordInput.charAt(j)) {
                            char c = word.charAt(j);
                            char[] charArray = str.toCharArray();
                            charArray[j] = c;
                            str = new String(charArray);
                        }
                    }
                    System.out.println(str);
                }
                else {
                    for (int k = 0; k < wordInput.length(); k++) {
                        if (word.charAt(k) == wordInput.charAt(k)) {
                            char c = word.charAt(k);
                            char[] charArray = str.toCharArray();
                            charArray[k] = c;
                            str = new String(charArray);
                        }
                    }
                    System.out.println(str);
                }

            }
        }
        do {
            System.out.println("Повторить игру еще раз?");
            System.out.println("0 Да");
            System.out.println("1 Другая игра");
            System.out.println("2 Нет");
            a = scan.nextInt();
        } while (a < 0 || a > 2);
        while (a != 2)
            if (a == 1) {guessTheNumberGame(1);}
            else if (a == 0) { guessTheWord(0); }
    }
}
