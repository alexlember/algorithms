package ru.lember.week1;

public class UFQuickUnion implements UF {


    private int[] id;

    public UFQuickUnion(int n) { //O(n)
        this.id = new int[n];
        for (int i = 0; i < n; i++) {
            id[i] = i;
        }
    }


    private int root(int i) {
        while ((i != id[i])) {
            i = id[i];
        }
        return i;
    }

    public void union(int p, int q) { //O(n) worst

        int i = root(p);
        int j = root(q);
        id[i] = j;

    }

    public boolean connected(int p, int q) { //O(2) worst
        return root(p) == root(q);
    }

    public int find(int p) {
        return 0;
    }

    public int count() {
        return 0;
    }
}
