package com.obs;

import java.util.Observable;

public class Counter extends Observable {

    private int c;

    public Counter() {
        c = 0;
    }

    public void start() {

        for (int i=0; i<50; i++) {
            c++;
            if (c%5==0) {
                setChanged();
                notifyObservers(c);
            }
        }
    }
}