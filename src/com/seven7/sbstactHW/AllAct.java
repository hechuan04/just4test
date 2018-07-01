package com.seven7.sbstactHW;

public class AllAct {

    public double activity(double original, boolean insider, int activity) {
        double actual=0;

        if (activity == 0 && original > 10) {
            actual = original--;
        }
        if (activity == 1) {
            actual = original * 0.8;
        }
        if (activity == 2) {
            System.out.println("买一赠一");
            actual = original;
        }
        if (activity == 3 && insider == true) {
            actual = original * 0.9;
        }
        return actual;
    }

}







