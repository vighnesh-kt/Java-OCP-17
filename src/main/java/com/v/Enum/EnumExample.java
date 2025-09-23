package com.v.Enum;

import java.util.Arrays;

public class EnumExample {

    public static void main(String[] args) {
        var win= Season.WINTER;
        var som=Season.valueOf("SUMMER");

        Season[] values = Season.values();

        Arrays.stream(values).forEach(System.out::println);

        String name = win.name();
        System.out.println(win.name());

        int ordinal = win.ordinal();
        System.out.println(ordinal);

        for(Season season:Season.values()){
            System.out.println(season.name()+" and order for this is"+season.ordinal());

        }

        //switch case
        switch(som){
            default -> System.out.println("Nothing is comming");
            case RAINY -> System.out.println("Barrish comming");
            case SUMMER -> System.out.println("Dhoop comming");
        }


        System.out.println("begin,");
        OnlyOne firstCall = OnlyOne.ONCE; // Prints constructing,
        OnlyOne secondCall = OnlyOne.ONCE; // Doesn't print anything
        System.out.println("end");


    }
}
