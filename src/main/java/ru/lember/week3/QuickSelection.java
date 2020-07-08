package ru.lember.week3;


/**
 * Quick-select takes O(n), without shuffling could be wost n^2.
 *
 * There's proved O(n) but with high constant that's why not in used.
 */
public class QuickSelection {

    public static Comparable select(Comparable[] a, int k) {

        // todo shuffle

        int lo = 0;
        int hi = a.length - 1;
        while (hi > lo) {
            int j = partition(a, lo, hi);
            if (j < k) {
                lo = j + 1;
            } else if (j > k) {
                hi = j - 1;
            } else {
                return a[k];
            }
        }
        return a[k];

    }

    private static int partition(Comparable[] a, int lo, int hi) {
        return 0;
    }


}
