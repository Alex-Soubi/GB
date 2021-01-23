package ru.geekbrains.lesson7;

public class StringTest {
    public static void main(String[] args) {
        String str = "I like Java!!!";
        printStr(str);
        printLastChar(str);
       System.out.println(isLastChar(str));
        System.out.println(isFirstChar(str));
        System.out.println(isHaveChar(str));
        findIndex(str);
        replaceChar(str);
        toLowerStr(str);
        toUpperStr(str);
        toCutStr(str);

    }
    public static void printStr(String str) {
        System.out.println(str);
    }
    public static void printLastChar(String str) {
        System.out.println(str.charAt(str.length()-1));
    }
    public  static boolean isLastChar(String str) {
      return str.endsWith("!!!");
    }
    public  static boolean isFirstChar(String str) {
        return str.startsWith("I like");
    }
    public  static boolean isHaveChar(String str) {
        return str.contains("Java");
    }
    public static void findIndex(String str) {
        int index = str.indexOf("java");
        System.out.println(index);
    }
    public static void replaceChar(String str) {
        System.out.println(str.replace("a", "o"));
    }
    public static void toLowerStr(String str) {
        System.out.println(str.toLowerCase());
    }
    public static void toUpperStr(String str) {
        System.out.println(str.toUpperCase());
    }
    public static void toCutStr(String str) {
        System.out.println(str.substring(7, 11));
    }
}
