package com.v.IO;

import java.io.*;

public class JavaIOExample {
    public static void main(String[] args) throws Exception {

/*
       This will create a new file if it doesn't already exist.
       If the file already exists, it will open the file for writing (and overwrite it unless you specify append mode).
       can give absolute or relative path
       relative path eg=FileWriter fw = new FileWriter("../../../../resources/filename.txt")
*/
        try (FileWriter fw = new FileWriter("/Users/BaBa/Intellij Workspace/Java OCP/Java OCP 17/src/main/resources/data.txt")) {
            //\n means add in new line
            fw.write("A\nB\n你好");
        }

        try (FileReader fr = new FileReader("/Users/BaBa/Intellij Workspace/Java OCP/Java OCP 17/src/main/resources/data.txt")) {
            int c;
            while ((c = fr.read()) != -1) {
                System.out.print((char) c);
            }
        }
        System.out.println();

        try (FileInputStream fis = new FileInputStream("/Users/BaBa/Intellij Workspace/Java OCP/Java OCP 17/src/main/resources/data.txt")) {
            int b;
            while ((b = fis.read()) != -1) {
                System.out.print((char) b + " ");
            }
        }
    }
}
