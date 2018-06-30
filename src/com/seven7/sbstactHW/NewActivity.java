package com.seven7.sbstactHW;

public class NewActivity {
    double original;
    double actual;
    boolean insider;
    int activity;

    public double activity(double original, boolean insider, int activity){
        if (activity==4){
            double a =15*0.7;
            double b = original-15;
            actual = a+b;
            }
        return actual;
    }
}
