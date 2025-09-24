package com.v.Sealed;

sealed interface Shape permits Circle, Rectangle {
    void draw();
}

final class Circle implements Shape {
    public void draw() { System.out.println("Circle"); }
}

final class Rectangle implements Shape {
    public void draw() { System.out.println("Rectangle"); }
}




public class SealedExample {

//    static String get(Shape s) {
//        return switch (s) {
//            case Circle c -> "Circle";
//            // Rectangle missing
//            // ❌ compiler says: switch not exhaustive
//            default -> "default one";
//        };
//    }

    static String get(Shape s) {
        return switch (s) {
            case Circle c -> "Circle";
            case Rectangle r -> "rec";
            // Rectangle missing
            // ❌ compiler says: switch not exhaustive
//            default -> "default one";
        };
    }

    static void render(Shape s) {
        switch (s) {
            case Circle c -> c.draw();
            case Rectangle r -> r.draw();
        }
    }

    public static void main(String[] args) {

        Shape s=new Rectangle();
        render(s);

        Language java=new Java();

        switch(java){
            default -> System.out.println("aknvd");
        }

    }


}
interface Language {}

class Java implements Language{}
class Python implements Language{}

