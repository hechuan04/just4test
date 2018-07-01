package com.seven7.sbstactHW;

public class Client extends AllAct {


    public static void main(String[] args) {
        //要求1
//        AllAct allAct = new AllAct();
//        System.out.println("实付价格：" + allAct.activity(16, false, 2));

        int requestParam = 4;

        if (requestParam==0){
            AbstractAct act =new Activity0();
            System.out.println("实付价格：" + act.activity(16, false));
        }
        if (requestParam==1){
            AbstractAct act =new Activity1();
            System.out.println("实付价格：" + act.activity(16, false));
        }
        if (requestParam==2){
            AbstractAct act =new Activity2();
            System.out.println("实付价格：" + act.activity(16, false));
        }
        if (requestParam==3){
            AbstractAct act =new Activity3();
            System.out.println("实付价格：" + act.activity(16, true));
        }
        if (requestParam == 4) {
            AbstractAct act = new Activity4();
            System.out.println("实付价格：" + act.activity(16, false));
        }
    }

}
