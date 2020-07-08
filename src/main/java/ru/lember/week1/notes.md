Suggested Readings. Section 1.4 and 1.5 in Algorithms, 4th edition.


Рассмативается решение проблемы с проверкой соединенности двух узлов.


N union-find operations on a set of N objects
quick-find worst-case time: MN
quick-union - MN
weighted QU N + MlogN
QU + path compression N + MlogN
weighted QU + path compression N + M lgN 


percolation threshold - нет математического решения для определения (есть ли проход сверху сетки до низу, 
можно представить, что рассматривается модель электричества или проходимости воды или связи людей в социальной сети).

Есть только модель Монте-Карло, которая работает следующим образом:

1) Создается сетка N на N полностью заблокированная (черные квадраты, белые разблокированы)
2) Произвольным образом добавляются белые блоки, каждый раз проверяется, стала ла модель проходима (percolated)
3) Вычисляется примерное число повторений, при котором система становится проходимой (на основании млн вычислений)

Модель можно сделать на основе QU, если добавить снизу и сверху по вируальному узлу, к которому будут прикрепляться открывающиеся ячейки.



Social network connectivity. 

Given a social network containing n members and a log file containing m timestamps 
at which times pairs of members formed friendships, 
Вesign an algorithm to determine the earliest time at which all members are connected 
(i.e., every member is a friend of a friend of a friend ... of a friend). 
Assume that the log file is sorted by timestamp and that friendship is an equivalence relation. 
The running time of your algorithm should be m log(n) or better and use extra space proportional to n.



Нужно отличать функции оценки алгоритмов (О, Омега, Тета, Тильда)    

Oh - worst case (upper bound)
Omega - best case (lower bound)
Teta - optimal case
~ (Tilda) - approximate model                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    


Questions:

1) 3-SUM in quadratic time. Design an algorithm for the 3-SUM problem t
hat takes time proportional to n^2 in the worst case. 
You may assume that you can sort the nn integers in time proportional to n^2 or better.
   
Note: these interview questions are ungraded and purely for your own enrichment. To get a hint, submit a solution.


Похожая задача из книги:
Быстрые тройки. В качестве разминки разработайте реализацию TwoSumFaster, 
в которой используется линейный алгоритм подсчета пар с нулевой суммой 
после сортировки этого массива (вместо линейно-логарифмического алгоритма на основе бинарного поиска). 
Затем примените аналогичный принцип для разработки квадратичного алгоритма 
для задачи поиска троек с нулевой суммой


2) Search in a bitonic array. An array is bitonic if it is comprised of an increasing sequence of integers 
followed immediately by a decreasing sequence of integers. 
Write a program that, given a bitonic array of n distinct integer values, 
determines whether a given integer is in the array.
   
   Standard version: Use ∼3lgn compares in the worst case.
   Signing bonus: Use ∼2lgn compares in the worst case 
   (and prove that no algorithm can guarantee to perform fewer than ∼2lgn compares in the worst case).
   
   
Битонический поиск. Массив называется битоническим, если он состоит из возрастающей последовательности целых чисел, 
за которой идет убывающая последовательность целых чисел. 
Напишите программу, которая при заданном битоническом массиве А целых чисел определяет, 
присутствует ли в массиве заданное число. Эта программа должна использовать ~3 lgA сравнений в худшем случае.


   
3) Egg drop. Suppose that you have an nn-story building (with floors 1 through nn) and plenty of eggs. 
An egg breaks if it is dropped from floor T or higher and does not break otherwise. 
Your goal is to devise a strategy to determine the value of T given the following limitations 
on the number of eggs and tosses:
   
   Version 0: 1 egg, \le T≤T tosses.
   Version 1: \sim 1 \lg n∼1lgn eggs and \sim 1 \lg n∼1lgn tosses.
   Version 2: \sim \lg T∼lgT eggs and \sim 2 \lg T∼2lgT tosses.
   Version 3: 22 eggs and \sim 2 \sqrt n∼2 
   n
   ​	
     tosses.
   Version 4: 22 eggs and \le c \sqrt T≤c 
   T
   ​	
     tosses for some fixed constant cc.
     
     
     Выбрасывание яиц из здания. 
     Пусть имеется N-этажное здание и много яиц. 
     Пусть также яйцо разбивается, если оно выбрасывается с этажа F или выше. 
     Вначале разработайте стратегию для определения значения F, разбив -lgN яиц и выбросив ~lgN, 
     а затем найдите способ снизить стоимость до ~2lgF.