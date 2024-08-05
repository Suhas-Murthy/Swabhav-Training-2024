package com.aurionpro.test;

import java.util.Scanner;

import com.aurionpro.model.CricketPlayer;

public class CricketPlayerTest {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter size: ");
	int size = sc.nextInt();
	CricketPlayer cricketPlayers[] = new CricketPlayer[size];
	
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
	
	for (int i=0; i<size; i++) {
		double max = cricketPlayers[i].calculateAverage();
		for(int j = i+1; j<size;j++) {
			double avg = cricketPlayers[j].calculateAverage();
			if(max < avg) {
				CricketPlayer temp = cricketPlayers[j];
				cricketPlayers[j] = cricketPlayers[i];
				cricketPlayers[i] = temp;
			}
			cricketPlayers[i].displayInfo();
		}
		cricketPlayers[i].calculateAverage();
	}
	
	
	sc.close();
}
}
