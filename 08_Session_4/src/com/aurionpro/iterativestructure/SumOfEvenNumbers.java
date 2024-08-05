package com.aurionpro.iterativestructure;

public class SumOfEvenNumbers {
public static void main(String[] args) {
	int n = 4;
	int i = 1;
	int ans = 0;
	while(i<=n) {
		ans = i + 2;
		i++;
	}
	System.out.println(ans);
}
}
