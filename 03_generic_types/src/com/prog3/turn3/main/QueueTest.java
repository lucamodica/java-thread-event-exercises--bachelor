package com.prog3.turn3.main;

import com.prog3.turn3.queue.Queue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class QueueTest {

    public static void main(String[] args) {

        //Test queue class with integer element
        System.out.println("***Integer queue test***");
        Queue<Integer> intQueue = new Queue<>(new ArrayList<>());
        Integer[] intArr = {1, 2, 3, 4, 5, 6};
        intQueue.enqueue(Arrays.asList(intArr));
        System.out.println("It was enqueued the following element: " + intQueue);
        System.out.println("And now we dequeue the first 2 element: " +
                intQueue.dequeue() + ", " + intQueue.dequeue());
        System.out.println("Finally, the queue after dequeues: " + intQueue + "\n\n");

        //Test queue class with integer element
        System.out.println("***Double queue test***");
        Queue<Double> doubleQueue = new Queue<>(new LinkedList<>());
        Double[] doubleArr = {1.1, 2.2, 3.3, 4.4, 5.5, 6.6};
        doubleQueue.enqueue(Arrays.asList(doubleArr));
        System.out.println("It was enqueued the following element: " + doubleQueue);
        System.out.println("And now we dequeue the first 2 element: " +
                doubleQueue.dequeue() + ", " + doubleQueue.dequeue());
        System.out.println("Finally, the queue after dequeues: " + doubleQueue);


    }
}
