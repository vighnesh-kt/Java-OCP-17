package com.v.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class BufferReadWriteExample {
    public static void main(String[] args) throws Exception {

        try (BufferedWriter bw = new BufferedWriter(new FileWriter("/Users/BaBa/Intellij Workspace/Java OCP/Java OCP 17/src/main/resources/buff.txt"))) {
            bw.write("Hello");
            bw.newLine();       // Writes a line separator
            bw.write("World");
            bw.newLine();
        }

        try (BufferedReader br = new BufferedReader(new FileReader("/Users/BaBa/Intellij Workspace/Java OCP/Java OCP 17/src/main/resources/buff.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.print("Line: " + line);
            }
        }
    }
}
