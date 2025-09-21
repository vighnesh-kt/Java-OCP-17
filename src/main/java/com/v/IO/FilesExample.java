package com.v.IO;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class FilesExample {

    public static void main(String[] args) throws IOException {

        Path path = Path.of("/Users/BaBa/Intellij Workspace/Java OCP/Java OCP 17/src/main/resources/file.txt");

        //Check File Properties

        System.out.println("Exists: " + Files.exists(path));
        System.out.println("Is Directory: " + Files.isDirectory(path));
        System.out.println("Is Regular File: " + Files.isRegularFile(path));


        System.out.println("*******");

        // Writing File
        // Write text (overwrites if file exists)
        Files.write(path, "Hello, Files API!\n".getBytes());

        // Append more text
        Files.write(path, "Appending this line".getBytes(),
                StandardOpenOption.APPEND);

//        // Write multiple lines
//        Files.write(path, List.of("Line 1", "Line 2", "Line 3"));

//        System.out.println("*******");

        // Reading File
        // Read all lines as List<String>
        List<String> lines = Files.readAllLines(path);
        for (String line : lines) {
            System.out.println("Line: " + line);
        }

        // Java 11+: Read whole file as a String
        String content = Files.readString(path);
        System.out.println("\nFull content:\n" + content);

    }
}
