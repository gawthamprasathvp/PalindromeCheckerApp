# PalindromeCheckerApp
📘 Palindrome Checker – Java Use Cases

This project demonstrates multiple approaches to check whether a string is a palindrome using different data structures and techniques in Java.

A palindrome is a word, phrase, or sequence that reads the same forward and backward.
Examples: radar, noon, civic, refer

🎯 Learning Objectives

Understand different ways to validate palindromes

Learn how various data structures work in practice

Compare algorithmic approaches for the same problem

Apply Stack, Queue, and Deque operations

🧩 Implemented Use Cases
✅ UC4 – Character Array Two-Pointer Method

Converts string to character array

Uses start and end pointers

Compares characters from both ends

Efficient memory usage

Concepts used

Arrays

Two-pointer technique

✅ UC5 – Stack Based Palindrome Checker

Push characters into stack (LIFO)

Pop characters and compare with original string

Concepts used

Stack

Reverse order processing

✅ UC6 – Queue + Stack Fairness Check

Queue stores characters in FIFO order

Stack stores characters in LIFO order

Compare queue front with stack top

Concepts used

Queue vs Stack behavior

Symmetric comparison

✅ UC7 – Deque Based Optimized Checker

Uses double-ended queue

Removes elements from both ends

Direct bidirectional comparison

Concepts used

Deque (Double Ended Queue)

Optimal front-back traversal

📂 Project Structure
PalindromeChecker/
│
├── UseCase4PalindromeCheckerApp.java
├── UseCase5PalindromeCheckerApp.java
├── UseCase6PalindromeCheckerApp.java
└── UseCase7PalindromeCheckerApp.java
▶️ How to Compile and Run
Step 1 — Compile
javac FileName.java

Example:

javac UseCase4PalindromeCheckerApp.java
Step 2 — Run
java ClassName

Example:

java UseCase4PalindromeCheckerApp
💻 Sample Output
Input : radar
Is Palindrome? : true
⚙️ Requirements

Java JDK 8 or higher

Command line or IDE (IntelliJ / Eclipse / VS Code)

📊 Complexity Overview
Method	Time Complexity	Space Complexity
Character Array	O(n)	O(n)
Stack	O(n)	O(n)
Queue + Stack	O(n)	O(n)
Deque	O(n)	O(n)
👨‍💻 Author

Developer

📜 Version History
Version	Description
4.0	Character array approach
5.0	Stack based check
6.0	Queue + Stack comparison
7.0	Deque optimized approach
⭐ Future Improvements

Take user input from keyboard

Ignore spaces and punctuation

Case-insensitive comparison

GUI implementation

Menu-driven single program