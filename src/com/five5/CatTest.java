package com.five5;

public class CatTest extends InsertOrderHW{
    CatTest() {
        System.out.println("C构造函数");
    }

    {
        System.out.println("C非静态代码块");
    }
    static {
        System.out.println("C静态代码块");
    }
    static void testJing() {
        System.out.println("C静态方法");
    }

    void testFei() {
        System.out.println("C非静态方法");
    }



}
