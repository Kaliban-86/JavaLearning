package com.company;

public class Arrays {
    public static void main(String[] args) {
        int[] arrays = new int[5];
        for (int i = 0; i < arrays.length; i++) {
            arrays[i] = i + 2;
            System.out.println(arrays[i]);
        }
        String[] arrays1 = new String[3];
        arrays1[0] = "Hellow";
        arrays1[1] = "Bye";
        arrays1[2] = "Java";
        for (String string:arrays1){
            System.out.println(string);
        }
        for (int x : arrays){
            System.out.println(x + 10);
        }
    }
}
