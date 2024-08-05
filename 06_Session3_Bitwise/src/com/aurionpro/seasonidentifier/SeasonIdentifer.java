package com.aurionpro.seasonidentifier;

import java.util.Scanner;

public class SeasonIdentifer {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Month in number: Jan(1),Feb(2)....,Dec(12)");
		int numberInMonths = sc.nextInt();

		switch (numberInMonths) {
		case 2:
		case 3:
		case 4:
		case 5:System.out.println("Summer");
		break;
		case 6:
		case 7:
		case 8:
		case 9:System.out.println("Monsoon");
		break;
		case 10:
		case 11:
		case 12:
		case 1:System.out.println("Winter");
		break;
		}
	}
}
