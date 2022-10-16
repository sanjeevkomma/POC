package com.demo.model;

public class Customer {
	private static int idCounter=0;
    private int id;
    private String name;

    public Customer(String name) {
        idCounter += 1;
        this.id = idCounter;
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
