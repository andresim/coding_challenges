# coding_challenges
Some simple Java coding challanges. Taking some challanges from Leetcode as well as some challenges posted by Jarvis. This README will contain a few of the written answers explaining some common data structures and methods related to them

## Stack vs. Queue Data Structure
This section will explain the stack and queue data structures, some common methods each has and the fundamental differences between them.

### Stack

A stack in Java can be thought of like a stack of plates in real life. It is an ordered list of tasks that obeys a last in first out (LIFO) method of processing, meaning that the last task added to the stack is the first to be processed. Relating this back to the real-world example makes sense; if you were to try and take out the bottom plate (the first plate added) before taking off all plates above it, the plates would likely fall. Stacks have two fundamental methods known as push and pop. Push is to add a task to the top of the stack and pop is to take off the top task. Another very useful method for stacks is peek, which will return the top item in the stack, but not remove or execute it. There are many other stack methods that can also be looked into.

### Queue

A queue in Java is much like a real life queue. It is an ordered list of tasks that obeys a first in first out (FIFO) method of processing, meaning that the first item added to the queue will be the first item that is processed. By default, items are always added to the end of the queue. A queue (generally) also has a few basic methods to look at the head of the queue and the length of the queue. There are also many other useful queue methods that are not described here, but can be looked into.

There is also another version of a queue called a priority queue. In this implementation, items can be passe to the queueu with a priority flag. In this case the priority item is placed at the beginning of the queue so it is executed first (hence the priority).

## Tree Traversal
In this section, the different traversal methods for binary trees are explained. 

### In-Order
This method recursively goes through these three steps:
1. Traverse the left sub-tree (apply these steps for this sub-tree).
2. Inspect the root node.
3. Traverse the right sub-tree (apply these steps for this sub-tree).

This method, when combined with the properties of a binary search tree (BST) will traverse each node in ascending order, starting from the lowest valued node to the highest.

### Pre-Order
This method recursively goes through these three steps:
1. Inspect the root node.
2. Traverse the left sub-tree (apply these 3 steps).
3. Traverse the right sub-tree (apply these 3 steps).

This method results in the Polish notation of the tree and outputs the topologically sorted list of the nodes. Both of those topics are a bit more advanced though and are not discussed here.

### Post-Order
This method recursively goes through these three steps:
1. Traverse the left sub-tree (apply these 3 steps).
2. Traverse the right sub-tree (apply these 3 steps).
3. Inspect the root node.

This method is useful for getting the postfix expression of the tree. 
