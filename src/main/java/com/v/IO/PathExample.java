package com.v.IO;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathExample {
    public static void main(String[] args) {

        // Absolute path
        Path p1 = Paths.get("//Users/BaBa/Intellij Workspace/Java OCP/Java OCP 17/src/main/resources/path.txt");

        // Relative path
        Path p2 = Paths.get("src/main/resources/path.txt");

        System.out.println("Absolute: " + p1);
        System.out.println("Relative: " + p2);

        Path p = Paths.get("/Users/BaBa/notes.txt");

        System.out.println(p.getFileName()); // notes.txt
        System.out.println(p.getParent());   // /Users/BaBa
        System.out.println(p.getRoot());     // /


        Path base = Paths.get("/Users/BaBa/Intellij Workspace/Java OCP/Java OCP 17/src/main/java/com/v/IO");
        Path child = Paths.get("/src/main/resources/path.txt");

        Path full = base.resolve(child);
        System.out.println(full); // /Users/BaBa/docs/file.txt

    }
}

