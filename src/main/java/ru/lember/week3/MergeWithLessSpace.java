package ru.lember.week3;

import java.util.Arrays;

/**
 * Merging with smaller auxiliary array.
 * Suppose that the subarray a[0] to a[n−1] is sorted and
 * the subarray a[n] to a[2∗n−1] is sorted.
 * How can you merge the two subarrays so that a[0] to a[2∗n−1] is sorted using
 * an auxiliary array of length n (instead of 2n)?
 */
public class MergeWithLessSpace {

    public static void main(String... args) {


        int[] arr1 = {1, 5, 9, 12, 15};
        int[] arr2 = {4, 5, 6, 16, 18};


        // копируем 1-й массив в дополнительный массив
        int[] aux = Arrays.copyOf(arr1, arr1.length);

        int auxPointer = 0;
        int arr2ExtractorPointer = 0;
        int arr2InserterPointer = 0;
        int arr1Pointer = 0;

        while (arr1Pointer < arr1.length || arr2ExtractorPointer < arr2.length) {

            // идем параллельно по aux и arr2, смотрим на каждой итерации, где меньший элемент
            // выбираем его, вставляем сначала в arr1, потом когда заканчивается место в arr2, пока
            // arr1 и arr2 не заполняться.

            int from2nd = arr2[arr2ExtractorPointer];

            if (arr1Pointer < arr1.length) {

                int fromAux = aux[auxPointer];

                if (fromAux < from2nd) {
                    arr1[arr1Pointer] = fromAux;

                    auxPointer++;
                } else {
                    arr1[arr1Pointer] = from2nd;

                    arr2ExtractorPointer++;
                }

                arr1Pointer++;


            } else {

                if (auxPointer < aux.length) {

                    int fromAux = aux[auxPointer];

                    if (fromAux < from2nd) {
                        arr2[arr2InserterPointer] = fromAux;

                        auxPointer++;
                    } else {
                        arr2[arr2InserterPointer] = from2nd;

                        arr2ExtractorPointer++;
                    }

                } else {

                    arr2[arr2InserterPointer] = from2nd;

                    arr2ExtractorPointer++;
                }

                arr2InserterPointer++;
            }
        }

    }
}
