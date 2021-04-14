package ru.lember.sorting;

public class Tick {

    private final long start;

    public Tick() {
        System.out.println("\n");
        System.out.println("Started measuring...");
        this.start = System.nanoTime();
    }

    public void stop() {
        long stop = System.nanoTime();
        System.out.println("Stopped measuring. Time is: " + (stop - start) + " ns");
    }



}
