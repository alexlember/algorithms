package ru.lember.sorting;

/**
 * runtime: O(n^2) average and worst, memory: O(1).
 *
 * Каждый элемент полностью проходится по всему массиву, делая попарные сравнения.
 *
 */
public class BubbleSort {

    public static void main(String... args) {

        System.out.println("Bubble sort");
        int[] sorted = sort(SortingUtils.randomIntArray(20000)); //1685717413 ns
        SortingUtils.printArray(sorted, "sorted: ");

    }



    private static int[] sort(int[] arr) {
        Tick tick = new Tick();
        int n = arr.length;
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (arr[j] > arr[j+1])
                {
                    // swap temp and arr[i]
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
        tick.stop();
        return arr;
    }

}
