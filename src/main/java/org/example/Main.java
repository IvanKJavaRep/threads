package org.example;

import java.util.ArrayList;
import java.util.Queue;

public class Main {


    public static void main(String[] args) {
        ArrayList<Integer> buffer = new ArrayList<>();
        int buffeerize = 2;
        Thread consumer = new Thread(new Consumer(buffer));
        Thread producer = new Thread(new Producer(buffer, buffeerize));
        consumer.start();
        producer.start();
    }
}