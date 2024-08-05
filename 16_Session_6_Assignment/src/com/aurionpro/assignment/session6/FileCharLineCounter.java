package com.aurionpro.assignment.session6;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCharLineCounter {
	public static void main(String[] args) throws IOException {
		FileInputStream fileInputStream = new FileInputStream("D:\\Aurionpro\\15_Session_6_Stream\\src\\com\\aurionpro\\stream\\text1");
		
		int ch;
		int count = 1;
		int count1 = 1;
		int count2 = 0;

		while ((ch = fileInputStream.read()) != -1) {
			if ((char) ch == ' ' || (char) ch == '\n') {

				count++;
			}

			if ((char) ch == '\n') {

				count1++;
			}

			if ((char) ch == ' ' || (char) ch != '\n' ) {

				count2++;
			}

		}count2 = count2 - (count1-1);
		System.out.println("Number of Words is : " + count);
		System.out.println("Number of Lines is : " + count1);
		System.out.println("Number of Characters is : " + count2);
		

	}

}