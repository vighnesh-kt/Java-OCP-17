package com.v.Enum;

public enum City {

    KURLA("400070"),
    GHATKOPAR("400084"); // Semicolon is present here

    private final String pincode;

    City(String pincode) {
        this.pincode=pincode;
    }

    String pincode(){
        return pincode;
    }
}


