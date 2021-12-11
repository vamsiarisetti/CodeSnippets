package com.org;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;

public class FileCreate
{
    public static void main(String[] args) throws IOException {
        /**
         Write a Java program to write "Hello" to a text file -
         output should be in the ./output directory if it exists. If
         ./output directory does not exist, write to the ./test/output directory
         **/
        // /output - ifExists -> true - create a file store it it the same dir
        // if false - create test/output/ and store file here
        File outputFile = new File("output");
        if (outputFile.exists())
        {
            // create a file and wrie hello
            String content = "hello";
            Files.write(Paths.get("./output/output.txt"), content.getBytes(StandardCharsets.UTF_8));
        }
        else if(!outputFile.exists())
        {
            // create test/output and rite the file here
            String content = "hello";
            new File("./test/output").mkdirs();
            Files.write(Paths.get("./test/output/fileName.txt"), content.getBytes());
        }
    }
}
