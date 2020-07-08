package ru.lember.leetcode.tree;

import java.util.*;

/**
 * There are a total of numCourses courses you have to take, labeled from 0 to numCourses-1.
 *
 * Some courses may have prerequisites, for example to take course 0 you have to first take course 1, which is expressed as a pair: [0,1]
 *
 * Given the total number of courses and a list of prerequisite pairs, is it possible for you to finish all courses?
 *
 *
 *
 * Example 1:
 *
 * Input: numCourses = 2, prerequisites = [[1,0]]
 * Output: true
 * Explanation: There are a total of 2 courses to take.
 *              To take course 1 you should have finished course 0. So it is possible.
 * Example 2:
 *
 * Input: numCourses = 2, prerequisites = [[1,0],[0,1]]
 * Output: false
 * Explanation: There are a total of 2 courses to take.
 *              To take course 1 you should have finished course 0, and to take course 0 you should
 *              also have finished course 1. So it is impossible.
 *
 *
 * Constraints:
 *
 * The input prerequisites is a graph represented by a list of edges, not adjacency matrices. Read more about how a graph is represented.
 * You may assume that there are no duplicate edges in the input prerequisites.
 * 1 <= numCourses <= 10^5
 */
public class CourseSchedule {


    public static void main(String... args) {

    }

    boolean canFinish(int numCourses, int[][] prerequisites) {

        // prerequisites - edges list.
        // idea is looking for cycles in the directed graph

        if (prerequisites.length == 0) {
            return true;
        }

        int[] indregree = new int[numCourses]; // все вершины перечислены, для каждой хранится ее степень.

        int count = 0;

        for (int i = 0; i < prerequisites.length; i++) {
            indregree[prerequisites[i][0]]++; // если в какую-то вершину ведет стрелка, то мы повышаем степень этой вершины.
        }

        Stack<Integer> stack = new Stack<>();

        // теперь идем по всем вершинам со степенями и собираем в стек все вершины, у которых степень 0.
        for (int i = 0; i < indregree.length; i++) {
            if (indregree[i] == 0) {
                stack.push(i);
            }
        }

        while (!stack.isEmpty()) {
            Integer current = stack.pop();
            count++;

            for (int[] prerequisite : prerequisites) {
                if (prerequisite[1] == current) { // находим элемент, который куда-то ведет, мы его убрали из стека, как что можно понизить степень.
                    indregree[prerequisite[0]]--;
                    if (indregree[prerequisite[0]] == 0) { // если степень понизилась до 0, помещаем в стек.
                        stack.push(prerequisite[0]);
                    }
                }
            }
        }


        return count == numCourses;
    }

//    private Map<Integer, List<Integer>> adjacencyMap(int[][] prerequisites) {
//
//        Map<Integer, List<Integer>> map = new HashMap<>();
//
//        for (int[] vertexPair : prerequisites) {
//
//            int startVertex = vertexPair[0];
//            int finishVertex = vertexPair[1];
//
//            List<Integer> vertexes = map.computeIfAbsent(startVertex, k -> new ArrayList<>());
//            vertexes.add(finishVertex);
//
//        }
//
//        return map;
//
//    }


}


