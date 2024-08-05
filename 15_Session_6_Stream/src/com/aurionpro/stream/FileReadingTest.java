package com.aurionpro.stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileReadingTest {
public static void main(String[] args) throws IOException {
	FileInputStream fileInputStream = new FileInputStream("D:\\Aurionpro\\15_Session_6_Stream\\src\\com\\aurionpro\\stream\\text1");
		
	int character;
	while((character=fileInputStream.read()) != -1) {
		System.out.println((char)character);
	}
	System.out.println("File Copied Sucessfully");
	
}
}
