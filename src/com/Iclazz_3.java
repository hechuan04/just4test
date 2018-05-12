package com;

public class Iclazz_3 {
    public int t = 10;
    static {
        System.out.println("1.");
    }

    public Iclazz_3(int t) {
        this.t=t;
        System.out.println("2.t=" + t);
    }

    public void hm() {
        t++;
        System.out.println("3.t=" + t);
    }

    static void hm2() {
        System.out.println("static");

    }
}
