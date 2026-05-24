# Enterprise Role-Based Access Control (RBAC) System

A modular, production-grade security backend written in Java that simulates real-world enterprise authorization and access control logic. 

This project was built to demonstrate deep practical application of **Object-Oriented Programming (OOP) Pillars** and architectural clean-coding practices, moving away from standard monolithic scripting paradigms.


##Core Features

- **Dynamic Permission Evaluation:** Real-time checking of privileges based on active user attributes.
- **Interactive CLI Interface:** A continuous terminal console that accepts runtime user input to test system authorization limits dynamically.
- **Strict Data Encapsulation:** Zero direct field manipulation; all authorization routes are strictly gated by secure state management methods.
- **Type-Safe Security Maps:** Built utilizing robust Java Collections and custom enumerations to mitigate runtime permission definition vulnerabilities.

---

## Object-Oriented Architecture & Patterns

This system deliberately avoids tight coupling and single-file procedural layouts by leveraging a highly modular, decoupled package architecture:

* **Abstraction:** Managed via an abstract base `User` class to decouple shared identity attributes from variable permissions.
* **Inheritance:** Implemented cleanly via specialised `AdminUser` and `ManagerUser` children, optimizing code reuse.
* **Polymorphism:** Leveraged dynamically through functional lambda interfaces passed into the central access validation engine.
* **Factory Design Pattern:** Standardized object creation handled through a creational `UserFactory` layer to eliminate hardcoded instances across the codebase.


