package com.project;

public class Stopwatch {

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        clicks();
        long endTime = System.currentTimeMillis();
        printElapsedTime(startTime,endTime);
    }

    private static void printElapsedTime(long startTime, long endTime) {
        System.out.println("Elapsed time in millisecond is: "+(endTime-startTime));

    }

    private static void clicks() {
        for(int i=0;i<100;i++)
        {
            System.out.println("Clicks");
        }

    }

}