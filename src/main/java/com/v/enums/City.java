package com.v.enums;

public enum City {

    KURLA("400070"),
    GHATKOPAR("400084"); // Semicolon is present here

    private final static String staticPincode="10";

    String pincode;

    City(String pincode) {
        this.pincode=pincode;
    }


    static String pincode(){
        return staticPincode;
    }
}
