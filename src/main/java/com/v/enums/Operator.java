package com.v.enums;

interface Calculator {
    int apply(int a, int b);
}

public enum Operator implements Calculator {
    PLUS {
        @Override
        public int apply(int a, int b) {
            return a + b;
        }
    },
    MINUS {
        @Override
        public int apply(int a, int b) {
            return a - b;
        }
    },
    TIMES {
        @Override
        public int apply(int a, int b) {
            return a * b;
        }
    };
}
