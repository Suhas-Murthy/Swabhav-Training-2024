package com.aurionpro.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.aurionpro.model.AuthorTitlePrice;
import com.aurionpro.model.Book;
import com.aurionpro.model.BookAuthorComparator;
import com.aurionpro.model.BookPriceComparator;
import com.aurionpro.model.BookPublicationYearComparator;
import com.aurionpro.model.BookTitleComparator;
import com.aurionpro.model.PublicationyearPriceAuthorComparator;

public class BookTest {
	public static void main(String[] args) {

		List<Book> books = new ArrayList<Book>();

		books.add(new Book("Making India Awesome", "Chetan Bhagat", 750, 2001));
		books.add(new Book("Revolution 2020", "Chetan Bhagat", 865, 2023));
		books.add(new Book("Gitanjali", "Rabindranath Tagore", 550, 1910));
		books.add(new Book("Wings of Fire", "Arun Tiwari", 900, 1999));
		books.add(new Book("Anandmath", "Bankim Chandra Chatterjee", 690, 1965));

		System.out.println("Books List: ");
		printArrayList(books);

		Collections.sort(books, new BookTitleComparator());
		System.out.println();
		System.out.println("Books List sorted according to Title: ");
		printArrayList(books);

		Collections.sort(books, new BookAuthorComparator());
		System.out.println();
		System.out.println("Books List sorted according to Author: ");
		printArrayList(books);

		Collections.sort(books, new BookPriceComparator());
		System.out.println();
		System.out.println("Books List sorted according to Price: ");
		printArrayList(books);

		Collections.sort(books, new BookPublicationYearComparator());
		System.out.println();
		System.out.println("Books List sorted according to Book Publication: ");
		printArrayList(books);

		Collections.sort(books, new AuthorTitlePrice());
		System.out.println();
		System.out.println("Books List sorted AuthorTitlePrice: ");
		printArrayList(books);

		System.out.println();
		Collections.sort(books, new PublicationyearPriceAuthorComparator());
		System.out.println("Books List sorted PublicationyearPriceAuthorComparator: ");
		printArrayList(books);

	}

	public static void printArrayList(List<Book> books) {
		for (Book book : books) {
			System.out.println(book);
		}

	}
}
