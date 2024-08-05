package com.aurionpro.structural.proxy.model;

public class RealLibrary implements Library {
    @Override
    public void accessResource(String resourceName) {
        System.out.println("Accessing the resource: " + resourceName);
    }
}

