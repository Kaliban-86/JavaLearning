package com.company;

 class Arrays {
    public static void main(String[] args) {
        int[] arrays = new int[5];
        for (int i = 0; i < arrays.length; i++) {
            arrays[i] = i + 2;
            System.out.println(arrays[i]);
        }
        String[] arrays1 = new String[3];
        arrays1[0] = "Hello";
        arrays1[1] = "Bye";
        arrays1[2] = "Java";
        for (String string : arrays1) {
            System.out.println(string);
        }
        for (int x : arrays) {
            System.out.println(x + 10);
        }

        int [][] arraysMult = {{1,2,3},
                               {4,5,6},
                               {7,8,9}};

        for (int[] ints : arraysMult) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }

    }
}
