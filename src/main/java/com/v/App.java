package com.v;


import java.util.*;
import java.util.stream.IntStream;

/**
 * Hello world!
 *
 */
public class App{

    static char c;
    static float f;
    static boolean bo;

    private App(){

    }

    public static void main( String[] args )
    {

//        System.out.println(args[0]);

        System.out.println(c);
        System.out.println(f);
        System.out.println(bo);

        float value = 102;

//        final int score1 = 8, score2 = 3;
//         char myScore = 7;
//         var goal = switch (myScore) {
//         default -> {if(10>score1) yield "unknown";}
//         case score1 -> "great";
//         case 2, 4, 6 -> "good";
//         case score2,0 -> {"bad"};
//         };
//         System.out.println(goal);

        final int score1 = 8, score2 = 3;
        int myScore = 7;
        var goal = switch (myScore) {
            case score1 -> "great";
            case 2, 4, 6 -> "good";
            case score2, 0 -> "bad";
            default -> {
                if (10 > score1) yield "unknown";
                else yield "undefined";
            }
        };
        System.out.println(goal);

        int moon = 9, star = 2 + 2 * 3;//8
        float sun = star>10 ? 1 : 3;//3
        double jupiter = (sun + moon) - 1.0f;//11.0
        int mars = --moon <= 8 ? 2 : 3;//2
        System.out.println(sun+", "+jupiter+", "+mars);//3 11.0 2

        List<Integer> data = new ArrayList<>();
        IntStream.range(0,100).parallel().forEachOrdered(s -> data.add(s));
        System.out.println(data.size());

//         Predicate<String> empty = String::isEmpty;
//         Predicate<String> notEmpty = empty.negate();
//
//         var result = Stream.generate(() -> "")
//         .filter(notEmpty)
//         .collect(Collectors.groupingBy(k -> k))
//         .entrySet()
//         .stream()
//         .map(Map.Entry::getValue)
//         .flatMap(Collection::stream)
//         .collect(Collectors.partitioningBy(notEmpty));
//         System.out.println(result);


        int[] array = {6,9,8};
        System.out.println("B" + Arrays.binarySearch(array,9));
        System.out.println("C" + Arrays.compare(array,
                new int[] {6, 9, 8}));
        System.out.println("M" + Arrays.mismatch(array,
                new int[] {6, 9, 8}));




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



    }

    static boolean si(){
        return true;
    }

}
