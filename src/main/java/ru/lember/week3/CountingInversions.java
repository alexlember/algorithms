package ru.lember.week3;

/**
 * Counting inversions. An inversion in an array a[] is a pair of entries a[i] and a[j] such that
 * i < j but a[i] > a[j]. Given an array, design a linearithmic algorithm to count the number of inversions.
 */
public class CountingInversions {

    public static void main(String... args) {


        int[] arr = {8, 4, 2, 1};

        // enhance merge sort, counting all the swappings.

        int counts = sort(arr, arr.length);
        System.out.println(counts);
    }


    private static int sort(int[] a, int n) {

        if (n < 2) {
            return 0;
        }

        int count = 0;

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
        count += sort(l, mid); // рекурсивно сортируем левую
        count += sort(r, n - mid); // рекурсивно сортируем правую

        count += merge(a, l, r, mid, n - mid, mid); // делаем слияние каждого из кусков


        return count;
    }

    private static int merge(
            int[] a, int[] l, int[] r, int left, int right, int m) {

        int swapsCount = 0;

        int i = 0, j = 0, k = 0;
        while (i < left && j < right) {
            if (l[i] <= r[j]) {
                a[k++] = l[i++];
            }
            else {
                a[k++] = r[j++];

                //Create a function merge that counts the number of inversions when two halves
                // of the array are merged, create two indices i and j, i is the index for
                // first half and j is an index of the second half.
                // if a[i] is greater than a[j],
                // then there are (mid – i) inversions. because left and right subarrays are sorted,
                // so all the remaining elements in left-subarray (a[i+1], a[i+2] … a[mid]) will be greater than a[j].
                swapsCount += (m + 1) - (left + i);
            }
        }
        while (i < left) {
            a[k++] = l[i++];
        }
        while (j < right) {
            a[k++] = r[j++];
        }

        return swapsCount;
    }
}
