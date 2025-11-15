package com.wrapperscenario;

import java.util.*;

class Benchmark {

    public void runBenchmark() {
        long start1 = System.currentTimeMillis();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 1_000_000; i++) list.add(i);
        long end1 = System.currentTimeMillis();

        long start2 = System.currentTimeMillis();
        int[] arr = new int[1_000_000];
        for (int i = 0; i < 1_000_000; i++) arr[i] = i;
        long end2 = System.currentTimeMillis();

        System.out.println("ArrayList<Integer>: " + (end1 - start1));
        System.out.println("int[]: " + (end2 - start2));
    }

    public static void main(String[] args) {
        Benchmark bench = new Benchmark();
        bench.runBenchmark();
    }
}

