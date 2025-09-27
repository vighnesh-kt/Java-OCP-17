package com.v.records;

// A record that implements the Printable interface
 record ProductInterfaceImpl(String name, double price) implements Printable {

     public ProductInterfaceImpl(String name,double price){
         if(name.equals(null) || price==0){
             throw new IllegalArgumentException("Why zero buddy");
         }
         this.name=name;
         this.price=price;
     }


    @Override
    public void printDetails() {
        System.out.println("Product: " + name + ", Price: $" + price);
    }
}

interface Printable {
    void printDetails();
}

public class Person1 {
    public static void main(String[] args) {

        ProductInterfaceImpl p=new ProductInterfaceImpl("af",0);
        System.out.println(p);

    }
}
