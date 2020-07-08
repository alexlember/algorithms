package ru.lember.sorting;


/**
 * devide and conquer
 * O(n * log n), память O(n).
 *
 *
 * t makes \sim \frac{1}{2} n \log_2 n∼
 * 2
 * 1
 * ​
 *  nlog
 * 2
 * ​
 * How many compares does mergesort—the pure version without any optimizations—
 * make to sort an input array that is already sorted?
 *
 *  1/2 n log2 n compares, which is the best case for mergesort.
 *  We note that the optimized version that checks whether a[mid]≤a[mid+1] requires only n - 1 compares.
 *
 *  there's a way called bottom-up mergesort (no recursion needed) it takes logarithmic passes?
 */
public class MergeSort {


    public static void main(String... args) {

        System.out.println("Merge sort");

        int[] original = SortingUtils.randomIntArray(20000); //30045816

        Tick tick = new Tick();
        int[] sorted = sort(original, original.length);
        tick.stop();
        SortingUtils.printArray(sorted, "sorted: ");

    }



    private static int[] sort(int[] a, int n) {


        if (n < 2) {
            return a;
        }


        // делим на 2 части, заполняем
        int mid = n / 2;
        int[] l = new int[mid];
        int[] r = new int[n - mid];

        for (int i = 0; i < mid; i++) {
            l[i] = a[i];
        }
        for (int i = mid; i < n; i++) {
            r[i - mid] = a[i];
        }
        sort(l, mid); // рекурсивно сортируем левую
        sort(r, n - mid); // рекурсивно сортируем правую

        merge(a, l, r, mid, n - mid); // делаем слияние каждого из кусков


        return a;
    }

    private static void merge(
            int[] a, int[] l, int[] r, int left, int right) {

        int i = 0, j = 0, k = 0;
        while (i < left && j < right) {
            if (l[i] <= r[j]) {
                a[k++] = l[i++];
            }
            else {
                a[k++] = r[j++];
            }
        }
        while (i < left) {
            a[k++] = l[i++];
        }
        while (j < right) {
            a[k++] = r[j++];
        }
    }

}
