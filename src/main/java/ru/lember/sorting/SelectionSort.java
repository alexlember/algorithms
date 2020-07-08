package ru.lember.sorting;


/**
 * runtime: O(n^2) average and worst, memory: O(1).
 * Поиск минимума линейным сканированием, затем перетаскиваем его в самое начало,
 * далее смотрим следующий минимальный элемент и перетаскиваем на вторую позицию.
 *
 * Всегда квадратичная, без разницы, частично ли отсортирован массив или нет.
 */
public class SelectionSort {

    public static void main(String... args) {

        System.out.println("Insert sort");
        int[] sorted = sort(SortingUtils.randomIntArray(20));
        SortingUtils.printArray(sorted, "sorted: ");

    }



    private static int[] sort(int[] arr) {
        Tick tick = new Tick();
        for (int min = 0; min < arr.length - 1; min++) {
            int least = min;
            for (int j = min + 1; j < arr.length; j++) {
                if (arr[j] < arr[least]) {
                    least = j;
                }
            }
            SortingUtils.swap(arr, min, least);
        }
        tick.stop();
        return arr;
    }


}
