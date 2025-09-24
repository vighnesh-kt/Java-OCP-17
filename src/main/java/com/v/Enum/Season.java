package com.v.Enum;

public enum Season {

    //simple enum ; is optional
//    WINTER, SUMMER,RAINY




    WINTER("Low"), SPRING("Medium"), SUMMER("High"), FALL("Medium"), RAINY("Low");

    @Override
    public String toString() {
        return "Parent toString called ='" + super.toString() + '\'' +
                '}';
    }

    private final String expectedVisitors;

    Season(String expectedVisitors) {
        this.expectedVisitors = expectedVisitors;
    }

    public void printExpectedVisitors() {
        System.out.println(expectedVisitors);
    }
}
