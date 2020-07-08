package ru.lember.leetcode.tree;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class CourseScheduleTest {


    @Test
    void canFinishTest() {

        CourseSchedule service = new CourseSchedule();

        int numCourses = 2;

        int[][] prerequisites = new int[][]{{1, 0}};
        Assertions.assertTrue(service.canFinish(numCourses, prerequisites));

        prerequisites = new int[][]{{1, 0}, {0, 1}};
        Assertions.assertFalse(service.canFinish(numCourses, prerequisites));

    }


}


