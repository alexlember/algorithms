package ru.lember.sorting;


/**
 * O(n * log n), память O(log n).
 *
 * 1. shuffle array (performance guarantee)
 * 2. partition the array (in place, no extra space)
 * 3. sort each piece recursively.
 *
 * bad case - already ordered, 1/2 n^2. eliminating by random shuffling.
 *
 * 1.39 n log n - comparison number but it's faster because operation is cheap.
 *
 * problem: non-stable, could be sable with extra space.
 *
 * improvement 1: small array cutoff to insertion sort
 * improvement 2: find the proper element (like a median).
 *
 *
 * could be quadratic on duplicate keys.
 *
 * В отличие от MergeSort сначала разбивает, затем сортирует.
 *
 */
public class QuickSort {


    public static void main(String... args) {

        System.out.println("Quick sort");

        int[] original = SortingUtils.randomIntArray(5); //30045816
        SortingUtils.printArray(original, "original: ");

        Tick tick = new Tick();
        sort(original, 0, original.length - 1);
        tick.stop();
        SortingUtils.printArray(original, "sorted: ");

    }


    private static void sort(int arr[], int begin, int end) {
        if (begin < end) {
            int partitionIndex = partition(arr, begin, end);

            sort(arr, begin, partitionIndex - 1);
            sort(arr, partitionIndex + 1, end);
        }
    }


    private static int partition(int arr[], int begin, int end) {
        int pivot = arr[end];
        int i = (begin - 1);

        for (int j = begin; j < end; j++) {
            if (arr[j] <= pivot) {
                i++;

                int swapTemp = arr[i];
                arr[i] = arr[j];
                arr[j] = swapTemp;
            }
        }

        int swapTemp = arr[i + 1];
        arr[i + 1] = arr[end];
        arr[end] = swapTemp;

        return i + 1;
    }

}
