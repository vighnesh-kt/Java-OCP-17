package com.v.utility;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class IteratorExample {
    public static void main(String[] args) {

        // doesnt throw exception due to naturaly exit loop without checking iterator value
//        List<String> names = new ArrayList<>();
//        names.add("Alice");
//        names.add("Bob");
//        names.add("Charlie");

        // throws exception
        List<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        names.add("David");

        /*
         how to fix concurrent modification exception using iterator.remove
         */
        
//        Iterator<String> iterator = names.iterator();
//        while (iterator.hasNext()) {
//            String name = iterator.next();
//            if (name.equals("Bob")) {
//                iterator.remove(); // ✅ Safe way
//            }
//        }
//
//        System.out.println(names); // [Alice, Charlie]
//
//        System.out.println(names);
//
//        // When you use a for-each loop on a list, Java internally uses an Iterator:
//        for (String name : names) {
//
//            if (name.equals("Bob")) {
//                names.remove(name); // 💥 Always throws now
//            }
//        }


        /*
        Option 2: Use a Copy of the Collection
         */

        for (String name : new ArrayList<>(names)) {
            if (name.equals("Bob")) {
                names.remove(name); // ✅ Safe, iterating over copy
            }
        }

        /*
        Option 3: Use Concurrent Collections
        If you’re working with multi-threaded code, use thread-safe collections like:
        CopyOnWriteArrayList
                ConcurrentHashMap
                  */



//        CopyOnWriteArrayList<String> names = new CopyOnWriteArrayList<>();
//        names.add("A");
//        names.add("B");
////        names.add("C");
//
//        for (String name : names) {
//            if (name.equals("B")) {
//                names.remove(name); // ✅ No exception
//            }
//        }

        System.out.println(names);
    }
}
