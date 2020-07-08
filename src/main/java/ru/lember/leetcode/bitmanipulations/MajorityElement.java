package ru.lember.leetcode.bitmanipulations;

/**
 * Given an array of size n, find the majority element.
 * The majority element is the element that appears more than ⌊ n/2 ⌋ times.
 *
 * You may assume that the array is non-empty and the majority element always exist in the array.
 *
 * Example 1:
 *
 * Input: [3,2,3]
 * Output: 3
 * Example 2:
 *
 * Input: [2,2,1,1,1,2,2]
 * Output: 2
 */
public class MajorityElement {

    /* Куча способов решения.
     1) Я решил через голосование (каждый элемент голосует за себя и против остальных) Boyer-Moore
     2) Отсортировать и посмотреть n/2 элемент
     3) Радомно выбрать индекс и проверить, что таких элементов большинство (посчитать сколько раз встерчается)
     4) Собрать в мап число встреч
     */


    public int majorityElement(int[] nums) {

        int majorElement = nums[0];
        int majorElementCount = 1;

        for (int i = 1; i < nums.length; i++) {

            int current = nums[i];

            if (majorElement == current) {
                majorElementCount++;
            } else {
                if (majorElementCount == 0) {
                    majorElement = current;
                    majorElementCount++;
                } else {
                    majorElementCount--;
                }
            }
        }

        return majorElement;
    }

}
