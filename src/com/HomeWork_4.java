package com;

public class HomeWork_4 {

//    static int array[] = {1, 2, 4, 4, 68, 9, 0, 5, 7, 9, 44, 4, 7, 99, 3, 3, 6, 6, 4, 333, 56, 74, 4, 6, 8, 7, 23, 35, 45, 879, 567, 456, 6};
//    static int array2[];
//
//    static void maopao() {
//        for (int i = array.length; i > 1; i--) {
//            for (int j = 0; j < i - 1; j++) {
//                if (array[j + 1] < array[j]) {
//                    int a = array[j + 1];
//                    array[j + 1] = array[j];
//                    array[j] = a;
//
//                }
//            }
//        }
//        for (int i = 0; i < array.length; i++) {
//            System.out.print(array[i] + " ");
//        }
//    }

    public static void main(String[] args) {
        //自定义一个数组，存放排序后的int，打印数组
        //冒泡排序（交换排序）
        //  HomeWork_4.maopao();
        HomeWork_4.maopao2();
        System.out.println();
        System.out.println(array.length);
    }


    static int array[] = {1, 2, 4, 4, 68, 9, 0, 5, 7, 9, 44, 4, 7, 99, 3, 3, 6, 6, 4, 333, 56, 74, 4, 6, 8, 7, 23, 35, 45, 879, 567, 456, 6};

    static void maopao2() {

        for (int i = 1; i < array.length; i++) {
            for (int j = array.length-1; j >= 1; j--) {
                if (array[j] < array[j - 1]) {
                    int a=array[j];
                    array[j]=array[j-1];
                    array[j-1]=a;

                }
            }
        }
        for (int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
    }
}

