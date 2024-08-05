package com.aurionpro.structural.proxy.test;

import com.aurionpro.structural.proxy.model.Library;
import com.aurionpro.structural.proxy.model.LibraryProxy;

public class Student {
    public static void main(String[] args) {
        Library studentLibrary = new LibraryProxy("Alice", "Student");
        studentLibrary.accessResource("Design Patterns Book");

        Library guestLibrary = new LibraryProxy("Bob");
        guestLibrary.accessResource("Design Patterns Book");
    }
}

