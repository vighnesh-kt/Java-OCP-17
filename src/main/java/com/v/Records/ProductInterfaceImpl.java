package com.v.Records;

// A record that implements the Printable interface
public record ProductInterfaceImpl(String name, double price) implements Printable {
    @Override
    public void printDetails() {
        System.out.println("Product: " + name + ", Price: $" + price);
    }
}

interface Printable {
    void printDetails();
}

