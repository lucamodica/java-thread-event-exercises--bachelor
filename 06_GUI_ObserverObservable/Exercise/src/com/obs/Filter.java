package com.obs;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

public class Filter extends Observable implements Observer {

    private List<Integer> list;

    public Filter() {
        list = new ArrayList<>();
    }

    public void filter(int c) {
        list.add(c);
        if (list.size()%2==0) {

            System.out.println("lista size: " + list.size());

            setChanged();
            notifyObservers(list);
        }
    }

    @Override
    public void update(Observable o, Object arg) {
        if(o instanceof Counter){
            filter((Integer) arg);
        }
    }
}