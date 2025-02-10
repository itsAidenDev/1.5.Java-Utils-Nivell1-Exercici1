package org.example.main;

import java.io.File;
import java.util.*;

public class DirectoryList {
    public static void main (String[] args){
        if (args.length != 1){
            System.out.println("Usage: java DirectoryList <directory_path>");
            return;
        }

        File directory = new File(args[0]);
        if (!directory.exists() || !directory.isDirectory()){
            System.out.println("Invalid directory path");
            return;
        }

        File[] files = directory.listFiles();
        if (files != null) {
            Arrays.sort(files);
            for (File file : files){
                System.out.println(file.getName());
            }
        }
    }

}