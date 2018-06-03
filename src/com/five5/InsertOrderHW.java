package com.five5;

public class InsertOrderHW {
    InsertOrderHW() {
        System.out.println("构造函数");
    }

    {
        System.out.println("非静态代码块");
    }

    static {
        System.out.println("静态代码块");
    }

    static void testJing() {
        System.out.println("静态方法");
    }

    void testFei() {
        System.out.println("非静态方法");
    }

    public static void main(String[] args) {
        InsertOrderHW insertOrderHW = new InsertOrderHW();
        CatTest catTest = new CatTest();
        MeiDuan meiDuan = new MeiDuan();
        testJing();
        insertOrderHW.testFei();
        testJing();

    }
}
