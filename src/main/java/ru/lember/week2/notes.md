unit 1.3, 2.1

Stacks

Node - inner class in LinkedList

N items of LinkedList uses ~40N bytes (stack memory)

16 bytes - object overhead
8 bytes - inner class extra overhead
8 bytes - ref to String
8 bytes - ref to Node

Stack with array implementations.
Defect is overflowing.

loitering - мы не используем какие-то элементы, но
JVM не знает про это, получается, что есть некоторые неоптимальности в использовании памяти.
(слоняться без дела).

Как делать array resize.
Удваиваем массив при заполнении.
cost of inserting N items ~3N (ignoring creating of the array)
N + 2 + 4 + 8 + .... + N



thrashing: push-pop-push-pop.

halve size of array when array is 1/4 full

Memory.

public class ResizingArrayStackOfStrings {

    private String[] s;
    private int N = 0;

}

8 bytes ref to array
24 bytes array overhead
8 bytes * array size
4 bytes int
4 bytes padding


LinkedList:
-every operation takes constant time in the worst case
-uses extra time and space to deal with links

ResizingArray
-every operation takes constant amortized time
-less wasted space

Suppose that, starting from an empty data structure, we perform 
n push operations in our resizing-array implementation of a stack. 
How many times is the resize() method called?

A: logarithmic


Given a reference first to the first node of a null-terminated
linked list with at least two nodes, what does the code fragment below do?

Node x = first;
while (x.next.next != null) {
    x = x.next;
}
x.next = null;

A: deletes the last node of the list

What about this:

Node x = first;
while (x.next.next.next != null) {
    x = x.next;
}
x.next = null;

A: deletes the next-to-last node in the list


-------------
Queue:

dequeue ~ pop
enqueue ~ add to the end

2 pointers: front and back


iterable returns iterator()
common implementation - inner class with

next
hasNext
remove



Suppose that we copy the iterator code from our linked list and resizing 
array implementations of a stack to the corresponding implementations of a queue.

Which queue iterator(s) will correctly return the items in FIFO order?

linked-list iterator only.

The linked-list iterator will work without modification 
because the items in the linked list are ordered in FIFO order 
(which is the main reason we dequeue from the front and enqueue to the back 
instead of vice versa).

The array iterator will fail for two reasons. 
First, the the items should be iterated over in the opposite order. 
Second, the items won't typically be stored in the array as entries 0 to n-1.


Не очень понял, на мой взгляд и linked list тоже не подходит, мы же
имеем ссылку на first, а это на самом деле последний добавленный элемент.


Dijkstra 2 staks:
value stack and operator stack.
value push to the value stack
operator push to the operator stack
left parentheses - ignore
right parentheses - pop operator and 2 values, evaluate and push result to the value stack.




How to prove that complexity in worst case for compare=based algorithm nust use at least NlgN compares.
model of computation - decision tree.

Mergesort is optimal for compares but not from space.


Under which of the following scenarios does the NlgN lower bound for sorting apply? 
Assume that the keys are accessed only through the compareTo() method unless otherwise specified
"A" : no two keys are equal.

Что такое стабильная сортировка: если у нас есть 2 поля - название и время и мы отсортируем санчала по времени, потом 
по названию, то в нестабильной сортировке записи необязательно будут отсортированы также и по времени, 
а в стабильной всегда. В стабильной соритровке ключи никогда не меняются местами.


