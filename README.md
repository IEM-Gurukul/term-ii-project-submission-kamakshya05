
# PCCCS495 – Term II Project

## Project Title

Smart Task Scheduler with Priority-Based Execution

---

## Problem Statement 

Students and professionals often manage multiple tasks with varying deadlines and priorities. Traditional to-do list systems rely on manual prioritization, which becomes inefficient when deadlines change or workload increases. Users must repeatedly reorganize tasks, leading to poor time management and missed deadlines.

The proposed Smart Task Scheduler automates this process by dynamically organizing tasks based on priority, deadline, and estimated duration. The system uses a priority-based scheduling mechanism to continuously reorder tasks as conditions evolve. Tasks are modeled using an object-oriented structure, enabling flexibility and extensibility. This project demonstrates effective object-oriented design principles such as abstraction, inheritance, and polymorphism, along with Java collections and exception handling to ensure robust and efficient task management.

---

## Target User

College students and working professionals managing multiple deadlines and daily tasks.

---

## Core Features

* Add, update, and delete tasks
* Automatic priority-based task scheduling
* Dynamic reordering based on deadlines
* Support for one-time and recurring tasks
* Task completion tracking
* Persistent storage using file handling
* Input validation and error handling

---

## OOP Concepts Used

* **Abstraction:**
  An abstract `Task` class defines common attributes like title, priority, deadline, and duration.

* **Inheritance:**
  `OneTimeTask` and `RecurringTask` classes extend the base `Task` class.

* **Polymorphism:**
  Different task types override the `calculatePriority()` method to define their own scheduling behavior.

* **Exception Handling:**
  Used to handle invalid inputs, incorrect task data, and runtime errors.

* **Collections / Threads:**
  Java `PriorityQueue` is used to dynamically manage and reorder tasks based on priority.

---

## Proposed Architecture Description

The system follows a layered object-oriented architecture. An abstract `Task` class defines common behavior, while specialized subclasses implement specific task types. A `SchedulerManager` class manages task creation, prioritization, and scheduling using a `PriorityQueue`. A separate `PersistenceManager` handles saving and loading tasks from storage. This separation ensures modularity, maintainability, and clear division between business logic and data handling.

---

## How to Run

1. Clone the repository
2. Open the project in any Java IDE (IntelliJ / Eclipse / VS Code)
3. Compile all files inside the `src` folder
4. Run the `Main.java` file
5. Follow on-screen instructions to add and manage tasks

---

## Git Discipline Notes

Minimum 10 meaningful commits will be maintained, showing step-by-step development including project setup, core logic implementation, feature additions, testing, and documentation.
