package com.company;

public class FinalVar {
    public static final int SOME = 35;

    public static void main(String[] args) {
        final  int AGE = 30;
        AGE = 35; // Не можем менять!!!!!
    }
}
class TestFinal{
    public static final int AGE_2 = 35;

}