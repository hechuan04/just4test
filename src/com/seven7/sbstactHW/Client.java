package com.seven7.sbstactHW;

public class Client extends AbstrctActHW {


    public static void main(String[] args) {
        AbstrctActHW abstrctActHW = new AbstrctActHW();
        System.out.println("实付价格：" + abstrctActHW.activity(20.5, false, 2));


    }

}
