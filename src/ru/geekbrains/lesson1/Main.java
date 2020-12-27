package ru.geekbrains.lesson1;

public class Main {

	public static void main(String[] args) {
		byte malo = 2;
		short luchshe = 34;
		int ok = 890;
		long dlinno = 50000500;
		float droby = 6.8f;
		double dr = 4.8;
		char simvol = '*';
		boolean yee = true;
		String str = "Вася";
		System.out.println(calculate(3.6f, 7.9f, 30.6f, 9.9f));
		System.out.println(sumBetween(69, 5));
		printName(str);
		leapYear(1900);


	}

	public static float calculate (float a, float b, float c, float d) {
		return (a * (b + (c / d)));
	}

	public static boolean sumBetween (int ch1, int ch2) {
		if (10 < (ch1 + ch2) && (ch1 + ch2) < 21) {
			return true;
		} else {
			return false;
		}
	}

	public static void negativeOrPositive(int znak) {
		if (znak < 0) {
			System.out.println("Число отрицательное");
		} else {
			System.out.println("Число положительное");
		}
	}
	public static boolean negative (int number) {
		return number < 0;
		}
	public static void printName (String name) {
		System.out.println("Привет, " + name + "!");
	}
	public static void leapYear (int year) {
		if (year % 4 == 0 && year % 100 != 0) {
			System.out.println(year + " год является високосным.");
		}
		else if (year % 400 == 0) {
			System.out.println(year + " год является високосным.");
		}
		else {
			System.out.println(year + " год не является високосным.");
		}
	}
}


