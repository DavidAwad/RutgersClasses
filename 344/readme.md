### David Awad

Algorithms Homework

## 1. Boulder Breaking

Your input is an n by n chessboard with bombs painted on some of the squares. You are not supposed to step on those!  Your goal is to move a stone from the upper left corner to the bottom right corner without being blown up and while obeying the following rules:

- i.) you must always move right or down (never up or left);
- ii.) you never move in the same direction consecutively three times (for instance RDDDRRDR is prohibited, since you have moved consecutively three times down after the first left).

Design an algorithm that runs in O(n^2) time (i.e. in linear time in the size of the board), and outputs the set of all squares where the stone can be moved from the upper left corner.

**Input**: n, and an array B[n][n] of zeroes and ones, where the ones indicate where the bombs are.
```
001011
101001
000000
000000
000010
000000
 ```

**Output**: an array R[n][n] of zeroes and ones where the ones indicate the squares reachable from the upper left corner when you follow the rules.
```
110000
010000
011100
001111
001101
000111
```


## 2. Spygraph

Your input is a directed graph G(V,E) with n nodes and m edges and an array spies[n] that gives three types of labels:

- 1 (our spy)
- 2 (neutral person)
- -1 (enemy's spy)

A directed edge between A and B means that a message can be potentially passed from person A to person B. Design an O(n+m) time algorithm that determines if there is any possibility for a message getting passed from any of our spies to any of the enemy's spies (through a chain of people).

 Input: n, G(V, E), spies[n]
 Output: yes or no

 Sample input:
```python
 n=8,
 G: [1->2, 1->6, 2->1, 2->5, 3->5, 4->1,
     4->7, 5->2, 5->6, 7->3, 8->7, 8->6 ]
 spies[8] = (1,0,-1,-1,0,0,0,1)
 ```
  Sample output:

 `yes`  
 (because 8->7->3)


3. Robot Charge

Recall the following robot problem from the midterm: A robot is standing in the upper left corner of an n by n grid. It can traverse to a neighboring square (left, right, up, down) in one step (diagonal steps are not allowed). Certain squares contain charging stations. The robot starts fully charged, and after being fully charged it can make 10 steps before running out of power. When the robot passes through a charging station, it is fully recharged. Your task is to plan a route for the robot, if it is possible at all, in which it does not run out of power and reaches the bottom right corner.
We now modify the problem as follows: Because of the slight tilt of the terrain, only the steps right and down deplete the charge by one unit; moving in the other two directions does not deplete the charge at all. Design an algorithm that under this new condition determines if the robot is able to reach the desired destination.
As always, the running time of your algorithm should be the best possible. You need to use pseudo-code or code, add a brief summary of your code in English, and explain the running time too. You will be graded on clarity.
