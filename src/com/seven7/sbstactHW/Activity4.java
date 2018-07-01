package com.seven7.sbstactHW;

public class Activity4 extends AbstractAct {

    @Override
    public double activity(double original, boolean insider){
        double actual;
        double a =15*0.7;
        double b = original-15;
        actual = a+b;
        return actual;
    }

}
