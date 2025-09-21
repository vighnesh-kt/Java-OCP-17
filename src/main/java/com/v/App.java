package com.v;


import java.util.function.IntFunction;

/**
 * Hello world!
 *
 */
public class App{

    private App(){

    }

    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

//        System.out.println("12345".charAt(6));
        labelName:
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                if (j == 2) break labelName; // exits outer loop
                System.out.println(i + "," + j);
            }
        }


        int i=10;
        float f=i;
        int[] iA = new int[0];
        System.out.println(iA.toString());


        StringBuilder s=new StringBuilder();
        System.out.println(f);
        if(8==81){};
        if (i == 10 ? true:false) { }
//        if (i = 3) {}
        boolean bool=false;
        if (false) {}else {

        };

        String st="a";
        IntFunction intF=new IntFunction() {
            @Override
            public Object apply(int value) {
                return null;
            }
        }

    }

    static boolean si(){
        return true;
    }

}

class MyString extends String{    MyString(){ super(); } }

