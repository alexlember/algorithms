package ru.lember.leetcode.hasht;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RandomizedSetTest {

    @Test
    void setTest() {

        RandomizedSet randomSet = new RandomizedSet();

        // Inserts 1 to the set. Returns true as 1 was inserted successfully.
        Assertions.assertTrue(randomSet.insert(1));

// Returns false as 2 does not exist in the set.
        Assertions.assertFalse(randomSet.remove(2));

// Inserts 2 to the set, returns true. Set now contains [1,2].
        Assertions.assertTrue(randomSet.insert(2));

// getRandom should return either 1 or 2 randomly.
        int val = randomSet.getRandom();
        Assertions.assertTrue(val == 1 || val == 2);

// Removes 1 from the set, returns true. Set now contains [2].
        Assertions.assertTrue(randomSet.remove(1));

// 2 was already in the set, so return false.
        Assertions.assertFalse(randomSet.insert(2));

// Since 2 is the only number in the set, getRandom always return 2.
        Assertions.assertEquals(2, randomSet.getRandom());


    }
}
