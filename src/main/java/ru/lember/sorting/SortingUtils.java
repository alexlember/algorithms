package ru.lember.sorting;

import java.util.Random;

/**
 * Устойчивость:
 * Был бы устойчивым (то есть, не менял порядок элементов с одинаковыми ключами)
 */
public class SortingUtils {

    private static final Random RND = new Random();

    static int[] randomIntArray(int elements) {

        if (elements <= 0) {
            throw new IllegalArgumentException("elements should be > 0");
        }

        int[] arr = new int[elements];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = RND.nextInt(100);
        }

        printArray(arr, "random: ");

        return arr;
    }

    static void printArray(int[] arr, String message) {
        System.out.println("\n");
        System.out.println(message);
        for (int anArr : arr) {
            System.out.print(anArr + " ");
        }
    }

    static void swap(int[] arr, int first, int second) {
        int tmp = arr[first];
        arr[first] = arr[second];
        arr[second] = tmp;
    }
}
