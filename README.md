# Java OOP Practice – CSCI185
This repository contains Java programming exercises completed as part of my Computer Programming II coursework.
The project focuses on applying Object-Oriented Programming (OOP) principles such as inheritance, composition, and class relationships.

[Back to portfolio](https://github.com/lourdhadweh4-del) · [Coursework index](https://github.com/lourdhadweh4-del/lourdhadweh4-del/blob/main/COURSEWORK.md)

## Repository guide

These are learning exercises. Each source folder is compiled separately because some exercises reuse class names.

| Source folder | Java files | Programs with a `main` method |
| --- | ---: | --- |
| [.](./) | 6 | [ConverterUtility](ConverterUtility.java), [Main](Main.java), [StudentMain](StudentMain.java) |
| [src](src) | 2 | [Automobile](src/Automobile.java), [studentRecord](src/studentRecord.java) |

## Compile and run

Install a JDK with `javac` and `java` available. The source folders below were compiled successfully with **JDK 24.0.2**. Run commands from the repository root.

### Root exercises

```bash
mkdir -p build/root
javac -d build/root *.java
java -cp build/root ConverterUtility
```

### src

```bash
mkdir -p build/src
javac -d build/src src/*.java
java -cp build/src Automobile
```

Choose another entry point from the table to run a different exercise. Some programs prompt for console input; others demonstrate object construction without printing output.

## Scope

These repositories document programming practice and coursework. Successful compilation is a basic check; it does not mean every exercise has complete input validation or production-level behavior.
