package com.v.Enum;

enum OverloadEg {
    SUCCESS,                // calls no-arg constructor
    ERROR("Failure"),       // calls constructor with a String
    UNKNOWN(404);           // calls constructor with an int

    private String message;
    private int code;

    // No-arg constructor
    private OverloadEg() {
        this.message = "OK";
    }

    // Constructor with String
    private OverloadEg(String message) {
        this.message = message;
    }

    // Constructor with int
    private OverloadEg(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message + " (code=" + code + ")";
    }
}

public class Test {
    public static void main(String[] args) {
        System.out.println(OverloadEg.SUCCESS);
        System.out.println(OverloadEg.ERROR.getMessage());
        System.out.println(OverloadEg.UNKNOWN.getMessage());

        System.out.println(City.GHATKOPAR.pincode());
    }
}
