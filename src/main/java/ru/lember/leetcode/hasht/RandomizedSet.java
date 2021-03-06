package ru.lember.leetcode.hasht;

import java.util.*;

/**
 * 380. Insert Delete GetRandom O(1)
 * Medium


 * Design a data structure that supports all following operations in average O(1) time.
 *
 *
 *
 * insert(val): Inserts an item val to the set if not already present.
 * remove(val): Removes an item val from the set if present.
 * getRandom: Returns a random element from current set of elements (it's guaranteed that at least one element exists when this method is called). Each element must have the same probability of being returned.
 *
 *
 * Example:
 *
 * // Init an empty set.
 * RandomizedSet randomSet = new RandomizedSet();
 *
 * // Inserts 1 to the set. Returns true as 1 was inserted successfully.
 * randomSet.insert(1);
 *
 * // Returns false as 2 does not exist in the set.
 * randomSet.remove(2);
 *
 * // Inserts 2 to the set, returns true. Set now contains [1,2].
 * randomSet.insert(2);
 *
 * // getRandom should return either 1 or 2 randomly.
 * randomSet.getRandom();
 *
 * // Removes 1 from the set, returns true. Set now contains [2].
 * randomSet.remove(1);
 *
 * // 2 was already in the set, so return false.
 * randomSet.insert(2);
 *
 * // Since 2 is the only number in the set, getRandom always return 2.
 * randomSet.getRandom();
 */
public class RandomizedSet {

    private static final Random RND = new Random();
    private final List<Integer> list;
    private final Map<Integer, Integer> indexMap;

    /** Initialize your data structure here. */
    public RandomizedSet() {
        list = new ArrayList<>();
        indexMap = new HashMap<>();
    }

    /** Inserts a value to the set. Returns true if the set did not already contain the specified element. */
    public boolean insert(int val) {

        if (indexMap.containsKey(val)) {
            return false;
        }

        indexMap.put(val, list.size());
        return list.add(val);
    }

    /** Removes a value from the set. Returns true if the set contained the specified element. */
    public boolean remove(int val) {

        if (!indexMap.containsKey(val)) {
            return false;
        }

        int index = indexMap.get(val);

        if (index < list.size() - 1) {

            int tempLast = list.get(list.size() - 1);
            list.set(index, tempLast);
            list.set(list.size() - 1, val);
            indexMap.put(val, list.size() - 1);
            indexMap.put(tempLast, index);

        }


        indexMap.remove(val);
        list.remove(list.size() - 1);

        return true;
    }

    /** Get a random element from the set. */
    public int getRandom() {
        return list.get(RND.nextInt(list.size()));
    }

}
