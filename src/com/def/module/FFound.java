package com.def.module;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class FFound {

    /*
        Overload method in file search operation
     */

    public static List<File> getFiles(File rootDir){
        List<File> files = new ArrayList<>();
        if (rootDir != null) {
            if (rootDir.isDirectory()) {
             System.out.println("->  " + rootDir.getAbsolutePath());
                File[] filesInRoot = rootDir.listFiles();
                if (filesInRoot != null) {
                    for (File file : filesInRoot) {
                        if (file.isDirectory()) {
                            getFiles(file,files);
                        } else {
                            if (file.getName().toLowerCase().endsWith(".jpg")) {
                                files.add(file);
                            }
                        }
                    }
                }
            }
        }
        return files;
    }
    public static void getFiles(File rootDir, List<File> files){
        if (rootDir != null) {
            if (rootDir.isDirectory()) {
             System.out.println("->  " + rootDir.getAbsolutePath());
                File[] filesInRoot = rootDir.listFiles();
                if (filesInRoot != null) {
                    for (File file : filesInRoot) {
                        if (file.isDirectory()) {
                            getFiles(file,files);
                        } else {
                            if (file.getName().toLowerCase().endsWith(".jpg")) {
                                files.add(file);
                            }
                        }
                    }
                }
            }
        }
    }
}
