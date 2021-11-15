package com.obs;

import java.util.List;
import java.util.Observable;
import java.util.Observer;

public class Visualizer implements Observer {

    public void visualize(List<Integer> list) {

        for (Integer i : list) {
            System.out.println(i.intValue());
        }
        System.out.println();
    }

    @Override
    public void update(Observable o, Object arg) {
        if(o instanceof Filter){
            visualize((List<Integer>) arg);
        }
    }
}