# Java Design Patterns Implementation

## Project Overview

This repository contains implementations of core Object-Oriented Design Patterns in Java.  

The goal of this project is to demonstrate practical understanding of reusable design solutions that solve recurring software design problems.

Each pattern includes:

- Clear problem statement
- Pattern structure
- Working Java implementation
- Explanation of when to use it
- Key architectural benefits

---

## Design Pattern Categories

Design patterns are categorized into three main types:

| Category      | Purpose |
|--------------|----------|
| Creational   | Object creation mechanisms |
| Structural   | Class and object composition |
| Behavioral   | Object interaction and responsibility |

---

## Project Structure

```
Java-Design-Patterns/
│
├── Creational/
│   ├── SimpleFactory/
│   ├── FactoryMethod/
│   ├── AbstractFactory/
│   └── (Future: Singleton, Builder)
│
├── Structural/
│   └── (Future: Adapter, Decorator, Proxy)
│
├── Behavioral/
│   └── (Future: Strategy, Observer, Command)
│
└── README.md
```

---

# Creational Patterns

## 1. Simple Factory

### Purpose
Centralizes object creation logic in a single factory class.

### Key Concept
Client does not directly instantiate concrete classes.

### Use Case
Small systems where object creation logic needs to be centralized.

---

## 2. Factory Method

### Purpose
Defines an interface for creating an object but allows subclasses to decide which class to instantiate.

### Key Concept
Object creation is delegated to subclasses.

### Benefit
Supports Open/Closed Principle better than Simple Factory.

---

## 3. Abstract Factory

### Purpose
Provides an interface for creating families of related objects without specifying their concrete classes.

### Key Concept
Ensures consistency among related products.

### Example in This Repository
- Burger product family
- GarlicBread product family
- Brand-specific factories (BurgerKing, BurgerSingh)

### Benefit
Switching factory changes the entire product family.

---

## Why Design Patterns Matter

Design patterns:

- Improve code reusability
- Reduce tight coupling
- Encourage abstraction
- Improve scalability
- Align with SOLID principles

They represent proven solutions to recurring software design problems.

---

## Technologies Used

- Java 17
- Object-Oriented Programming
- Abstraction
- Polymorphism
- Interfaces
- Clean Code Practices

---

## How to Run

Navigate to the specific pattern folder and compile:

```
javac DesignPattern/PatternFileName.java
java DesignPattern.PatternFileName
```

Ensure you are in the directory above the `DesignPattern` package when running the program.

---

## Learning Objectives

- Understand when to apply specific patterns
- Recognize common design problems
- Reduce code duplication
- Improve architectural thinking
- Prepare for backend and low-level design interviews

---

## Future Improvements

- Add Singleton and Builder pattern
- Add Strategy and Observer pattern
- Add UML diagrams
- Add unit tests
- Add real-world use case examples

---

## Author

Sneha 
B.Tech CSE (IoT & CS)  
Backend and Architecture Enthusiast
