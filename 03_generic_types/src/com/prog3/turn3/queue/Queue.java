package com.prog3.turn3.queue;

import java.util.List;

public class Queue<T> {

    private List<T> queue;

    public Queue (List<T> queue){
        if (!queue.isEmpty()){
            queue.clear();
        }
        this.queue = queue;
    }

    public boolean empty(){
        return queue.isEmpty();
    }

    public void enqueue(T elem){
        queue.add(queue.size(), elem);
    }
    
    public void enqueue(List<T> list){
        for (T elem: list) {
            enqueue(elem);
        }
    }

    public T dequeue (){
        assert queue.size() == 0 : "Cannot dequeue from an empty queue.";

        return queue.remove(0);
    }

    @Override
    public String toString() {
        return queue.toString();
    }
}
