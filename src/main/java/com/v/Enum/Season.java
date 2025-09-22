package com.v.Enum;

public enum Season {

    //simple enum ; is optional
//    WINTER, SUMMER,RAINY

    WINTER("Low"), SPRING("Medium"), SUMMER("High"), FALL("Medium"), RAINY("Low");
    private final String expectedVisitors;

    Season(String expectedVisitors) {
        this.expectedVisitors = expectedVisitors;
    }

    public void printExpectedVisitors() {
        System.out.println(expectedVisitors);
    }
}
