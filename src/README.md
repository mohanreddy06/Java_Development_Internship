Java Development Internship

## Overview

This repository contains the Java programs and applications developed as
part of my Java Development Internship.

The projects were implemented using Java and IntelliJ IDEA, covering
core programming concepts, file handling, networking, multithreading,
GUI development, and practical application development.

## Technologies Used

-   Java
-   IntelliJ IDEA
-   Java I/O
-   Java Networking (Socket Programming)
-   Multithreading
-   Java Swing
-   Git / GitHub

## Project Structure

``` text
Santhosam_Mohan_Java_Development_Internship/
│
├── Level_1/
│   ├── TemperatureConverter.java
│   ├── PalindromeChecker.java
│   ├── StudentGradeCalculator.java
│   └── RandomPasswordGenerator.java
│
├── Level_2/
│   ├── TicTacToe.java
│   ├── PasswordStrengthChecker.java
│   └── FileEncryptionDecryption.java
│
├── Level_3/
│   ├── ChatApplication/
│   │   ├── Server.java
│   │   └── Client.java
│   │
│   ├── MultiThreadedApplication/
│   │   └── BankAccount.java
│   │
│   ├── DesktopApplication/
│   │   └── StudentManagementSystem.java
│   │
│   └── CurrencyConverter/
│       └── CurrencyConverter.java
│
└── README.md
```

## Completed Tasks

### Level 1

#### 1. Temperature Converter

A Java console application for converting temperature values between
supported temperature units.

**Concepts:** variables, arithmetic operations, conditional logic, and
user input.

#### 2. Palindrome Checker

Checks whether a given string or value reads the same forward and
backward.

**Concepts:** strings, loops, character processing, and conditional
statements.

#### 3. Student Grade Calculator

Accepts student marks and calculates the corresponding grade.

**Concepts:** input handling, arithmetic operations, conditions, and
validation.

#### 4. Random Password Generator

Generates a random password based on selected character types.

**Concepts:** strings, loops, random number generation, and character
handling.

------------------------------------------------------------------------

### Level 2

#### 1. Tic-Tac-Toe Game

A console-based Tic-Tac-Toe game implemented using Java.

**Concepts:** arrays, loops, conditions, methods, and game logic.

#### 2. Password Strength Checker

Checks a password against common strength requirements such as length
and character variety.

**Concepts:** strings, regular expressions/character checking,
conditions, and validation.

#### 3. File Encryption / Decryption

Reads text from a file, applies a character-shift encryption technique,
and writes the result to another file. The reverse operation decrypts
the content.

**Concepts:** file handling, `FileReader`, `FileWriter`, streams,
exception handling, and basic encryption logic.

------------------------------------------------------------------------

### Level 3

#### 1. Chat Application

A client-server chat application implemented using Java Socket
Programming.

**Main components:** - `Server.java` - `Client.java`

The application establishes a TCP connection between the client and
server and supports sending and receiving messages.

**Concepts:** `ServerSocket`, `Socket`, input/output streams,
client-server architecture, and multithreading.

#### 2. Multi-threaded Application

A bank-account simulation demonstrating multiple threads accessing a
shared account.

The application uses synchronization to prevent inconsistent updates to
the shared balance.

**Concepts:** `Thread`, lambda expressions, shared resources,
`synchronized`, concurrency, and race-condition prevention.

#### 3. Desktop Application

A Student Management System developed using Java Swing.

The application provides a graphical interface for entering and
displaying student information.

**Concepts:** `JFrame`, `JPanel`, `JLabel`, `JTextField`, `JButton`,
`JTextArea`, event handling, and `ActionListener`.

#### 4. Currency Converter

A console-based currency conversion application supporting conversions
between selected currencies.

**Concepts:** `Scanner`, `switch`, arithmetic operations,
methods/variables, and user input.

> Note: The basic implementation uses fixed example exchange rates.
> These rates should not be interpreted as live market rates.

## How to Run

### Using IntelliJ IDEA

1.  Open the project in IntelliJ IDEA.
2.  Make sure the project is configured with a compatible JDK.
3.  Open the required `.java` file.
4.  Click the **Run** button.
5.  Follow the instructions displayed in the console or GUI.

### Chat Application

Run the files in this order:

1.  Start `Server.java`.
2.  Start `Client.java`.
3.  Enter messages from either side.
4.  Type `exit` to close the chat.

The server and client must use the same port number.

## Key Java Concepts Demonstrated

-   Variables and data types
-   Operators and expressions
-   Conditional statements
-   Loops
-   Arrays
-   Strings
-   Methods
-   Classes and objects
-   Exception handling
-   File handling
-   Input/output streams
-   Socket programming
-   Client-server architecture
-   Threads
-   Synchronization
-   Shared-resource management
-   GUI development with Swing
-   Event handling
-   User input validation

## Learning Outcomes

Through these tasks, I gained practical experience in developing Java
applications and applying Java programming concepts to different types
of problems. The projects progressed from basic console programs to
file-processing, networking, concurrent, and graphical applications.

## Author

**Santhosam Mohan**

B.Tech -- Information Technology

------------------------------------------------------------------------

## Internship Project

**Java Development Internship**

This repository contains the implementation of the tasks completed
during the internship.
