package com.five5;

public class MeiDuan {
    MeiDuan() {
        System.out.println("M构造函数");
    }

    {
        System.out.println("M非静态代码块");
    }
    static {
        System.out.println("M静态代码块");
    }
    static void testJing() {
        System.out.println("M静态方法");
    }

    void testFei() {
        System.out.println("M非静态方法");
    }

    public static void main(String[] args) {
       MeiDuan meiDuan =new MeiDuan();
        testJing();
        meiDuan.testFei();
        testJing();
    }
}
