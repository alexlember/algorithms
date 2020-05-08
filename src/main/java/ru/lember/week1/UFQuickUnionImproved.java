package ru.lember.week1;

/**
 * Основная идея в том, чтобы не допустить разрастания дерева, вводим понятию веса.
 * Depth of any node x is at most log2(n), n - number of nodes.
 *
 *
 *
 *
 */
public class UFQuickUnionImproved implements UF {


    private int[] id;
    private int[] sz; // 1 улучшение: доп. массив, в котором хранятся число элементов под узлом.

    public UFQuickUnionImproved(int n) { //O(n)
        this.id = new int[n];
        this.sz = new int[n];
        for (int i = 0; i < n; i++) {
            id[i] = i;
            sz[i] = 0;
        }
    }


    private int root(int i) {
        while ((i != id[i])) {
            id[i] = id[id[i]]; // 2 улучшение - после каждого определения root дл яnode делаем связь каждого узла него, дерево будет почти плоским.
            i = id[i];
        }
        return i;
    }

    public void union(int p, int q) { //O(log2(n))

        int i = root(p);
        int j = root(q);

        if (i == j) {
            return;
        }

        if (sz[i] < sz[j]) {
            id[i] = j;
            sz[j] += sz[i];
        } else {
            id[j] = i;
            sz[i] += sz[j];
        }


    }

    public boolean connected(int p, int q) { //O(log2(n))
        return root(p) == root(q);
    }

    public int find(int p) {
        return 0;
    }

    public int count() {
        return 0;
    }
}
