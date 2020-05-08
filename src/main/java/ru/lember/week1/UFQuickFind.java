package ru.lember.week1;

public class UFQuickFind implements UF {


    private int[] id;

    public UFQuickFind(int n) { //O(n)
        this.id = new int[n];
        for (int i = 0; i < n; i++) {
            id[i] = i;
        }
    }

    public void union(int p, int q) {

        int pId = id[p]; //O(n)
        int qId = id[q];
        for (int i = 0; i < id.length; i++) {
            if (id[i] == pId) {
                id[i] = qId;
            }
        }
    }

    public boolean connected(int p, int q) { //O(1)
        return id[p] == id[q];
    }

    public int find(int p) {
        return 0;
    }

    public int count() {
        return 0;
    }
}
