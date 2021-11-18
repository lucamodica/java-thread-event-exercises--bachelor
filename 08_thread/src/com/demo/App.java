package com.demo;

import java.util.ArrayList;
import java.util.List;

public class App {

    static class ActivityCounter implements Runnable{
        int count = 0;

        @Override
        public void run() {
            incr();
        }

        public int getCount() {
            return count;
        }

        synchronized public void incr(){
            count++;
        }
    }

    static class Step extends Thread{
        List<Step> preconditions;
        int slep;
        ActivityCounter count;

        public Step(String str, int slep, ActivityCounter count,
                    List<Step> preconditions){
            super(count, str);
            this.preconditions = preconditions;
            this.slep = slep;
            this.count = count;
        }

        private void letsJoin(){
            for (Thread prec : preconditions) {
                try{
                    prec.join();
                }catch (InterruptedException e){
                    System.out.println(e.getMessage());
                }
            }
        }

        public void run(){
            letsJoin();
            try {
                System.out.println("Am the thread " + getName() + ", bjour! " +
                        "(count value: " + count.getCount() + ")");
                sleep(slep);
            }catch (InterruptedException e){
                System.out.println(e.getMessage());
            }
            super.run();
            System.out.println("Gudnaaaait! (from " + getName() + ")" +
                    "(count value: " + count.getCount() + ")");
        }

    }

    public static void main(String[] args){

        //Counter to be incremented by all the threads
        ActivityCounter activityCounter = new ActivityCounter();

        //Set for action 0
        Step action0 = new Step("Action0", 3000, activityCounter, new ArrayList<>());

        //Set for action 1-2-3
        ArrayList<Step> prec123 = new ArrayList<>();
        prec123.add(action0);
        Step action1 = new Step("Action1", 15000, activityCounter, prec123);
        Step action2 = new Step("Action2", 5000, activityCounter, prec123);
        Step action3 = new Step("Action3", 10000, activityCounter, prec123);

        //Set for action 4
        ArrayList<Step> prec4 = new ArrayList<>();
        prec4.add(action1);
        prec4.add(action2);
        prec4.add(action3);
        Step action4 = new Step("Action4", 4000, activityCounter, prec4);

        //Set for action 5
        ArrayList<Step> prec5 = new ArrayList<>();
        prec5.add(action4);
        ArrayList<Step> action5 = new ArrayList<>();
        for (int i = 0; i < 5; i++){
            action5.add(new Step("Action5", 3000, activityCounter,
                    new ArrayList<>(prec5)));
            prec5.add(action5.get(i));
        }


        //Start of all the actions
        action0.start();

        action1.start();
        action2.start();
        action3.start();

        action4.start();

        for (Step action : action5) {
            action.start();
        }
    }
}
