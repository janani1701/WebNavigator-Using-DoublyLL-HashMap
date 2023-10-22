# WebNavigatorUsingDoublyLLAndHashMap


The **WebNavigatorUsingDoublyLLAndHashMap** is a Java program that simulates a basic web browser history management system. Users can interact with this program to visit web pages, navigate their browsing history, and search for specific keywords within their browsing history.

## Table of Contents

- [Introduction](#introduction)
- [Features](#features)
- [How to Use](#how-to-use)
- [Classes and Data Structures](#classes-and-data-structures)
- [Conclusion](#conclusion)


## Introduction

The Browser History Manager is a command-line application that allows users to perform the following actions:

1. **Add Website:** Users can add a website URL to their browsing history.
2. **Browse History:** Users can view their entire browsing history.
3. **Current History:** Users can view the current page in their browsing history.
4. **Go Back/Forward:** Users can navigate back and forward in their browsing history.
5. **Search for a Keyword:** Users can search for URLs containing a specific keyword in their browsing history.
6. **Quit:** Users can exit the application.

The program is built using a combination of classes, including `BrowserHistoryManager`, `DoublyLinkedList`, `HistoryNavigator`, `HistorySearcher`, and `ListNode`.

## Features

### Adding Websites to History

When a user adds a website to their browsing history, the program checks if the page already exists in the history. If it does, the page is moved to the end of the history as the most recent entry. If the page is new, it is added to the history.

### Navigating History

Users can navigate their browsing history by going back and forward a specified number of steps. The program informs users if there are no previous or next websites available.

### Searching History

Users can search for URLs containing a specific keyword within their browsing history. The program displays matching URLs for the search term.

## How to Use

To run the Browser History Manager program, follow these steps:

1. Compile the Java files: Compile the `Main.java`, `BrowserHistoryManager.java`, `DoublyLinkedList.java`, `HistoryNavigator.java`, `HistorySearcher.java`, and `ListNode.java` files.

   ```bash
   javac Main.java BrowserHistoryManager.java DoublyLinkedList.java HistoryNavigator.java HistorySearcher.java ListNode.java
   ```

2. Run the compiled program:

   ```bash
   java Main
   ```

3. Follow the on-screen menu to interact with the Browser History Manager.

## Classes and Data Structures

### `BrowserHistoryManager`

- Manages the browsing history and provides methods to visit web pages, go back and forward, and search history.

### `DoublyLinkedList`

- Represents a doubly linked list used to store browsing history. It includes methods for adding and displaying history entries.

### `HistoryNavigator`

- Provides methods to navigate back and forward in browsing history.

### `HistorySearcher`

- Provides a method to search for URLs containing a specific keyword in the browsing history.

### `ListNode`

- Represents a node in the doubly linked list, storing URL information and references to the previous and next nodes.

## Conclusion

In conclusion, the **WebNavigatorUsingDoublyLLAndHashMap** is a Java program that offers a simple yet effective solution for managing web browsing history. It allows users to visit web pages, navigate through their browsing history, and search for specific keywords within their visited URLs. The program is designed with a clear and interactive command-line interface, making it user-friendly and accessible.

The underlying logic of this application is built around the principles of data structures, utilizing a doubly linked list to efficiently manage and manipulate the history of web pages. Additionally, it provides users with a convenient way to search for URLs matching a specific keyword, enhancing the user experience and making it a practical tool for maintaining a well-organized browsing history.

This project serves as a foundation for developing more advanced web browser history management systems or as a learning resource for those interested in data structure implementations in Java.


