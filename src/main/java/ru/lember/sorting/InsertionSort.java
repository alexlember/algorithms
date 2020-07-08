package ru.lember.sorting;


/**
 * runtime: O(n^2) average and worst, memory: O(1).
 *
 * Каждый элемент вставляется в отсортированную часть массива на то место, где он должен находиться.
 *
 * Proposition. For partially-sorted arrays, insertion sort runs in linear time.
 * Pf. Number of exchanges equals the number of inversions.
 *
 * Уже отсортированный массив сделает n-1 сравнений и 0 перестановок.
 *
 * Частично отсортированный массив сортируется за O(n), поэтому для малых массивов, это сортировка по умолчанию.
 *
 */
public class InsertionSort {

    public static void main(String... args) {

        System.out.println("Selection sort");
        int[] sorted = sort(SortingUtils.randomIntArray(20));
        SortingUtils.printArray(sorted, "sorted: ");

    }


    private static int[] sort(int[] input) {
        Tick tick = new Tick();
        for (int i = 1; i < input.length; i++) {
            int key = input[i];
            int j = i - 1;
            while (j >= 0 && input[j] > key) {
                input[j + 1] = input[j];
                j = j - 1;
            }
            input[j + 1] = key;
        }
        tick.stop();
        return input;
    }


}
