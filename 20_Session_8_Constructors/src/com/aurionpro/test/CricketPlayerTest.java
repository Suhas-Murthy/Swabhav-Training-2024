package com.aurionpro.test;

import java.util.Scanner;

import com.aurionpro.model.CricketPlayer;

public class CricketPlayerTest {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	CricketPlayer cricketPlayers[] = new CricketPlayer[11];
	
	for (int i=0; i<cricketPlayers.length; i++) {
		System.out.println("Enter Player ID: ");
		int playerId = sc.nextInt();
		System.out.println("Enter Player Name: ");
		String name = sc.next();
		System.out.println("Enter Player's Number of Matches Played: ");
		int numberOfMatches = sc.nextInt();
		System.out.println("Enter Player total Runs: ");
		int runs = sc.nextInt();
		System.out.println("Enter Player total Wickets: ");
		int wickets = sc.nextInt();
		cricketPlayers[i] = new CricketPlayer(playerId, name, numberOfMatches, runs, wickets);
	}
	for (int i=0; i<cricketPlayers.length; i++) {
		cricketPlayers[i].displayInfo();
		cricketPlayers[i].calculateAverage();
	}
	sc.close();
}
}
