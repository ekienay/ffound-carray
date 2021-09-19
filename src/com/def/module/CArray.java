package com.def.module;

public class CArray {

    /*
        array copy example (default and new)
     */

    //default method
    public static int[] def(int... vararg){
        int[] arr = new int[vararg.length];
        for (int i = 0; i < vararg.length;i++){
            arr[i] = vararg[i];
        }
        return arr;
    }

    //new method
    public static int[] fun(int... vararg){
        int[] arr = new int[vararg.length];
        System.arraycopy(vararg, 0, arr, 0, vararg.length);
        return arr;
    }
}
