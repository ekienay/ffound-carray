package com.def;

import com.def.module.CArray;
import com.def.module.FFound;

import java.io.File;
import java.util.List;

public class Run {
    public static void main(String[] args) {
        List<File> list = FFound.getFiles(new File("sas"));
        list.forEach(System.out::println);
        int[] arr = CArray.fun(1,2,3,5);
        for (int i = 0; i < arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
