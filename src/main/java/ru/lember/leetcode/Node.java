package ru.lember.leetcode;

public class Node {

    public int val;
    public Node next;
    public Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }

    public boolean isEqual(Node that) {
        if (that == null) {
            return false;
        }

        return this.val == that.val && this.next == that.next && this.random == that.random;
    }
}