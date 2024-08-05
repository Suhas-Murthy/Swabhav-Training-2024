package com.aurionpro.test;

import java.util.Scanner;

import com.aurionpro.model.Book;

public class BookTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of books: ");
		int size = sc.nextInt();
		System.out.println();
		
		Book books[] = new Book[size];
		for (int i = 0; i < books.length; i++) {
			System.out.println("Enter Book ID: ");
			int bookId = sc.nextInt();
			System.out.println("Enter Book Name: ");
			String name = sc.next();
			System.out.println("Enter Book Author: ");
			String author = sc.next();
			System.out.println("Enter Book Price: ");
			double price = sc.nextDouble();
			System.out.println("Enter Book Publication: ");
			String publication = sc.next();

			books[i] = new Book(bookId, name, author, price, publication);
		}
		for (int i = 0; i < books.length; i++) {
			System.out.println("Book ID: " + books[i].getBookId());
			System.out.println("Book Name: " + books[i].getName());
			System.out.println("Book Author: " + books[i].getAuthor());
			System.out.println("Book Price: " + books[i].getPrice());
			System.out.println("Book Publication: " + books[i].getPublication());
			sc.close();
		}
	}
}
