package com.five5;

public class InsertOrderHW {
    InsertOrderHW() {
        System.out.println("I构造函数");
    }

    {
        System.out.println("I非静态代码块");
    }

    static {
        System.out.println("I静态代码块");
    }

    static void testJing() {
        System.out.println("I静态方法");
    }

    void testFei() {
        System.out.println("I非静态方法");
    }

    static void upTest(Object a){
       // a.testFei();
    }
    public static void main(String[] args) {
     MeiDuan meiDuan =new MeiDuan();
       // InsertOrderHW insertOrderHW =new InsertOrderHW();
     //upTest(insertOrderHW);
        meiDuan.testFei();
    }
}
