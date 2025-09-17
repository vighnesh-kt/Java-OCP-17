package com.v.Utility;

public class BooleanUtilityExample {
    public static boolean checkName(String name) {
        System.out.println("Checking name...");
        return name != null && !name.isEmpty();
    }

    public static boolean checkAge(int age) {
        System.out.println("Checking age...");
        return age >= 18;
    }

    public static void main(String[] args) {
        String userName = "";
        int userAge = 15;

        // Using &&
        boolean result1 = checkName(userName) && checkAge(userAge);
        System.out.println("Result with && : " + result1);

        // Using Boolean.logicalAnd
        boolean result2 = Boolean.logicalAnd(checkName(userName), checkAge(userAge));
        System.out.println("Result with logicalAnd: " + result2);
    }
}
