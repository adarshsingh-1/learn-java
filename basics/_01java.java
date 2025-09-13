
package basics;
public class _01java {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}

// Java File Naming Rules

// A Java file must have the same name as the public class inside it.
// File extension must be .java.
// You cannot start a filename with a number or use spaces.
// Valid starts: letter, underscore _, or dollar sign $.
// Examples of valid filenames:
// _01java.java
// $01java.java
// Java_01.java

// ***********************************************************

// Class Definition

// public → Access modifier; class is visible everywhere.
// class → Keyword to define a class.
// _01java → Class name.
// Identifiers can start with letter, _, or $.
// Cannot start with a digit.
// Recommended: start with capital letter (e.g., Student, HelloWorld).
// So, public class _01java → Defines a public class named _01java.

// ************************************************************

// main() method

// public static void main(String[] args)
// Meaning of keywords:

// public → JVM can access it from anywhere.
// static → Runs without creating an object of the class.
// void → Returns nothing.
// main → Special method name; JVM looks for it as program entry point.
// String[] args → Stores command-line arguments passed while running the program.

// Example of command-line arguments:
// java _01java Hello Adarsh
// args[0] = "Hello"
// args[1] = "Adarsh"

// ************************************************************

//JVM (Java Virtual Machine)
// JVM is the engine that runs Java programs.
// Converts bytecode (.class files) into machine code.
// Provides platform independence (write once, run anywhere).
// Handles memory management and garbage collection.

// ************************************************************
// JRE (Java Runtime Environment)

// JRE = JVM + libraries + other files needed to run Java programs.
// Allows you to run Java programs but not develop them.
// Contains:
//      JVM
//      Core libraries (java.lang, java.util, etc.)
//      Supporting files

// ************************************************************

// JDK (Java Development Kit)

// JDK = JRE + development tools (compiler, debugger, etc.)
// Allows you to develop, compile, and run Java programs.
// Contains:
//      JRE
//      Development tools (javac, javadoc, etc.)
//      Supporting files
// To write and run Java programs, you need the JDK installed.

// ************************************************************

//Relationship between JDK, JRE, and JVM

// JDK > JRE > JVM
// JDK = full package (development + execution)
// JRE = only execution
// JVM = only execution engine

//************************************************************