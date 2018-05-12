package com;

public class Auth_4 {

    private static void func(String... array){
        for (int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }
    }

    public static void main(String[] args) {
//        int array[] = {1,2,3,4,5};
//        for(int i=0;i<array.length;i++){
//            System.out.println(array[i]);
//        }
        Auth_4.func("deflaut","public","protect","private");
    }

}
