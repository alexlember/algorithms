package ru.lember.week3;

import java.util.Random;

/**
 * Shuffling a linked list. Given a singly-linked list containing n items,
 * rearrange the items uniformly at random. Your algorithm should consume a logarithmic (or constant)
 * amount of extra memory and run in time proportional to nlogn in the worst case.
 */
public class ShufflingLinkedList {

    static class Node {
        int value;
        Node next;

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }

        public Node() {

        }
    }


    public static void main(String... args) {

        // https://stackoverflow.com/questions/12167630/algorithm-for-shuffling-a-linked-list-in-n-log-n-time
        /*


        What about the following? Perform the same procedure as merge sort.
        When merging, instead of selecting an element (one-by-one) from the two lists in sorted order, flip a coin. ]
        Choose whether to pick an element from the first or from the second list based on the result of the coin flip.


         */





        for (int i = 0; i < 500; i++) {
            Node n8 = new Node(8, null); // assume even node number
            Node n7 = new Node(7, n8);
            Node n6 = new Node(6, n7);
            Node n5 = new Node(5, n6);
            Node n4 = new Node(4, n5);
            Node n3 = new Node(3, n4);
            Node n2 = new Node(2, n3);
            Node n1 = new Node(1, n2);

            System.out.println("original list: ");
            printLinkedList(n1);


            Node shuffled = shuffle(n1, 8);

            System.out.println("shuffled list: ");
            printLinkedList(shuffled);

            System.out.println("");
        }

    }

    private static final Random RND = new Random();

    private static Node merge(Node left, Node right) {
        //System.out.println("left=" + left.value + ",right=" + right.value);

        Node aux = new Node();
        Node l = left;
        Node r = right;
        Node current = aux;
        while (l != null && r != null) {
            int rand = RND.nextInt(2);
            if (rand == 0) {
                current.next = l;
                current = current.next;
                l = l.next;
            } else {
                current.next = r;
                current = current.next;
                r = r.next;
            }
        }
        if (l != null) {
            current.next = l;
        } else {
            current.next = r;
        }
        return aux.next;
    }

    private static Node shuffle(Node head, int N) {
        if (N == 1) return head;

        int k = 1;
        Node mid = head;
        while (k < N / 2) {
            mid = mid.next;
            k++;
        }
        Node rh = mid.next;
        mid.next = null;
        Node left = shuffle(head, N / 2);
        Node right = shuffle(rh, N - N / 2);
        return merge(left, right);
    }

//    private static Node shuffle(Node first) {
//
//        if (first == null) {
//            return null;
//        }
//
//        if (first.next == null) {
//            return first;
//        }
//
//
//        Node slow = first.next;
//        Node fast = first.next.next;
//
//        int halfSize = 2;
//
//        while (fast != null && fast.next != null && fast.next.next != null) {
//
//            halfSize++;
//
//            slow = slow.next;
//            fast = fast.next.next;
//
//        }
//
//        Node secondHalfFirstNode = slow.next;
//
//
//
//        return first; //
//
//    }


    private static void printLinkedList(Node first) {
        if (first == null) {
            System.out.println("list is empty");
            return;
        }

        StringBuilder sb = new StringBuilder();
        sb.append(first.value);

        Node current = first;
        while (current.next != null) {
            sb.append("->");
            current = current.next;
            sb.append(current.value);
        }

        System.out.println(sb.toString());
    }


//    // Function to count the number of inversions
//    // during the merge process
//    private static void merge(int[] arr, int l, int m, int r)
//    {
//
//        // Left subarray
//        int[] left = Arrays.copyOfRange(arr, l, m + 1);
//
//        // Right subarray
//        int[] right = Arrays.copyOfRange(arr, m + 1, r + 1);
//
//        int i = 0, j = 0, k = l, swaps = 0;
//
//        while (i < left.length && j < right.length) {
//            if (left[i] <= right[j])
//                arr[k++] = left[i++];
//            else {
//                arr[k++] = right[j++];
//            }
//        }
//
//        // Fill from the rest of the left subarray
//        while (i < left.length)
//            arr[k++] = left[i++];
//
//        // Fill from the rest of the right subarray
//        while (j < right.length)
//            arr[k++] = right[j++];
//
//    }
//
//    // Merge sort function
//    private static void sort(int[] arr, int l, int r)
//    {
//
//
//        if (l < r) {
//            int m = (l + r) / 2;
//
//            // Total inversion count = left subarray count
//            // + right subarray count + merge count
//
//            // Left subarray
//            sort(arr, l, m);
//
//            // Right subarray
//            sort(arr, m + 1, r);
//
//            // Merge
//            merge(arr, l, m, r);
//        }
//
//    }

}
