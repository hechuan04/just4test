package com.six6;

import com.five5.MeiDuan;

public class FinalTest {

    public static void main(String[] args) {
        final MeiDuan meiDuan =new MeiDuan();
        System.out.println(meiDuan.add());

        String a = "a";
        String b = "b";
        b = a + b;
        System.out.println(b);

    }




}
