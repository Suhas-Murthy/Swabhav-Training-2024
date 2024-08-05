package com.aurionpro.structural.facade.test;

import java.util.Scanner;

import com.aurionpro.structural.facade.model.HomeThreaterController;

public class HomeThreaterControllerTest {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	HomeThreaterController home = new HomeThreaterController();
	home.start();
	System.out.println();
	home.stop();
	System.out.println("Enter the volume: ");
	home.setVolume(scanner.nextInt());
	scanner.close();
}
}
