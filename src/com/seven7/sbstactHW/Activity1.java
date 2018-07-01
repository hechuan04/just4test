package com.seven7.sbstactHW;

public class Activity1 extends AbstractAct {
    @Override
    public double activity(double original, boolean insider) {
        double actual = 0;
        actual = original * 0.8;
        return actual;
    }
}
