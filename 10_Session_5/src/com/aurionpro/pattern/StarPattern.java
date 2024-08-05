package com.aurionpro.pattern;

public class StarPattern {
	public static void main(String[] args) {
		int rows = 5;
		// char a = ''*';
		for (int i = 1; i <= rows; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");}

			System.out.println("");
		}
	}
}
