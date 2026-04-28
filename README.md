# 90Days_BackendInterview

# ✅ DAY 1 — JAVA FOUNDATIONS (ZERO → SOLID)

⏱️ **Time:** ~2–2.5 hours      
🎯 **Outcome:** You understand *how Java actually runs* and can write clean basic programs confidently.
## 1️⃣ How Java Works (40 mins)
## Concepts (must know for interviews)
* What is **JVM**, **JDK**, **JRE**
* How Java code executes ( `.java → .class → JVM`)
* Why Java is platform-independent
## 2️⃣ Java Basics – Hands ON (50 mins)
## Topics
* Variables
* Data types
* Type casting
* Input using `Scanner`
* `if-else`, `switch`
## 3️⃣ Coding (MANDATORY) (40 mins)
  🔹 Program 1: Even / Odd     
  🔹 Program 2: Largest of 3 numbers     
  🔹 Program 3: Simple Calculator (switch case)      
  🔹 Program 4: Print first N natural numbers        
  🔹 Program 5: Celsius → Fahrenheit
## 4️⃣ Interview Questions (20 mins)
1. Difference between **JVM, JDK, JRE**
2. Why Java is platform independent?
3. Is Java 100% object-oriented? Why?
4. What is bytecode?
5. Why `main()` is static?
6. Can we run Java without JDK?


================================================================================
# ✅ DAY 2 — ARRAYS (ZERO → CONFIDENT)

⏱️ **Time:** 2–2.5 hours
🎯 **Outcome:** You can **think + code array problems without panic**
## 1️⃣ Arrays Basics (30 mins)
### Must-know concepts
* What is an array?
* Memory layout (contiguous)
* Indexing (0-based)
* Time complexity of access → **O(1)**
## 2️⃣ Arrays Operations (30 mins)
### Topics
* Traversal
* Insert element
* Update element
* Delete element (logical)
* Reverse array
## 3️⃣ CODING PRACTICE (MANDATORY) (60 mins)
🔹 Problem 1: Traverse an array
Input: [2, 4, 6]      
Output: 2 4 6                 
🔹 Problem 2: Find max & min
     Input: [3, 7, 2, 9]      
     Output:    
      Max = 9    
      Min = 2    
 🔹 Problem 3: Count even & odd numbers       
 🔹 Problem 4: Reverse an array        
     *(Do NOT use extra array first)*         
🔹 Problem 5: Linear Search    
    Input: [5, 3, 9], key = 3    
    Output: Found at index 1     
## 4️⃣ INTERVIEW QUESTIONS (20 mins)
1. Why array size is fixed?
2. Difference between array and ArrayList?
3. Time complexity of searching in array?
4. Can array store objects?
5. What happens if index is out of range?
6. Why arrays are faster than collections?

## 5️⃣ THINKING QUESTION (VERY IMPORTANT)
👉 **Why binary search cannot work on unsorted array?**
Explain in your own words.

## 6️⃣ Mini Challenge (Optional but Powerful)

👉 Rotate array by 1 position (left)       
Example:
Input: [1, 2, 3, 4]
Output: [2, 3, 4, 1]



---

===========================================================================
# 🔒 DAY 3 — OOPS (CLASS, OBJECT, CONSTRUCTOR)

⏱️ **Time:** ~2–2.5 hours
🎯 **Outcome:** You can **design basic classes**, understand **objects**, and explain **constructors clearly in interviews**

---

## 1️⃣ CORE CONCEPT (45–60 mins)

### 📌 Topics (ONLY THESE TODAY)

* What is a **Class**
* What is an **Object**
* Fields (variables) vs Methods
* **Constructor** (default + parameterized)
* `this` keyword (basic use)

---

### 🎥 RESOURCE (STICK TO ONE)

Use your locked source:

---

## 2️⃣ HANDS-ON CODING (MANDATORY) (60 mins)

Create package:

```java
com.shrey.day3
```

---

### 🔹 Program 1: Student Class

```java
class Student {
    int id;
    String name;

    void display() {
        System.out.println(id + " " + name);
    }
}
```

👉 In `main()`:

* Create 2 objects
* Assign values
* Call `display()`

---

### 🔹 Program 2: Constructor Example

```java
class Employee {
    int id;
    String name;

    Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    void show() {
        System.out.println(id + " " + name);
    }
}
```

👉 Create object using constructor

---

### 🔹 Program 3: Default vs Parameterized Constructor

Try:

* One class with no constructor
* One with parameterized

👉 Observe difference

---

## 3️⃣ MINI LOGIC TASK (20 mins)

👉 Create a class `Calculator`

Methods:

* add()
* subtract()
* multiply()

Call them using object.

---

## 4️⃣ INTERVIEW QUESTIONS (25 mins)

Answer clearly:

1. What is class and object?
2. Difference between object and reference?
3. What is constructor?
4. Can constructor be private?
5. What is `this` keyword?
6. Can we have multiple constructors?
7. What happens if we don’t define constructor?

---

## 5️⃣ THINK LIKE BACKEND DEV (IMPORTANT)

👉 Why do we use classes in backend?

Answer should include:

* Data modeling
* Real-world mapping (User, Order, Product)
* Code reusability

---

## 🔒 DAY 3 RULES

* ❌ No inheritance today
* ❌ No abstraction
* ✅ Only basics + clarity

---

## ✅ COMPLETION CHECK

You should:

* Understand object creation clearly
* Know constructor role
* Write class-based code without confusion


==========================================================================

---

# 🔒 DAY 4 — INHERITANCE + POLYMORPHISM

⏱️ **Time:** ~2–2.5 hours
🎯 **Outcome:** You can **design relationships between classes** and explain **runtime vs compile-time behavior**

---

## 1️⃣ CORE CONCEPT (45–60 mins)

### 📌 Topics (ONLY THESE)

* What is **Inheritance**
* Types (focus on **single inheritance**)
* `extends` keyword
* **Method Overriding**
* **Polymorphism**

  * Compile-time (overloading)
  * Runtime (overriding)

---

### 🎥 RESOURCE (stick to one)

---

## 2️⃣ HANDS-ON CODING (MANDATORY) (60 mins)

### 🔹 Program 1: Inheritance

```java
class Animal {
    void sound() {
        System.out.println("Animal makes sound");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks");
    }
}
```

👉 In main:

```java
Dog d = new Dog();
d.sound();
d.bark();
```

---

### 🔹 Program 2: Method Overriding (VERY IMPORTANT)

```java
class Animal {
    void sound() {
        System.out.println("Animal sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}
```

👉 In main:

```java
Animal a = new Dog();
a.sound();
```

---

### 🧠 IMPORTANT (UNDERSTAND THIS LINE)

```java
Animal a = new Dog();
```

👉 This is **Runtime Polymorphism**

---

### 🔹 Program 3: Method Overloading

```java
class Calculator {
    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }
}
```

---

## 3️⃣ INTERVIEW QUESTIONS (25 mins)

Answer clearly:

1. What is inheritance?
2. Why use inheritance?
3. What is method overriding?
4. Difference between overloading vs overriding?
5. What is runtime polymorphism?
6. What is upcasting?
7. Can we override static methods?
8. What is `@Override` annotation?

---

## 4️⃣ THINK LIKE BACKEND DEV (IMPORTANT)

👉 Real-world example:

* `User → AdminUser`
* `Payment → UPI / Card / NetBanking`

👉 Inheritance helps:

* Code reuse
* Cleaner design

---

## 5️⃣ MINI CHALLENGE (OPTIONAL)

Create:

* `Vehicle` class
* `Car` and `Bike` extending it
* Override `start()` method

---

## 🔒 DAY 4 RULES

* ❌ No abstraction yet
* ❌ No interfaces yet
* ✅ Focus on clarity

---

## ✅ COMPLETION CHECK

You should:

* Understand `extends`
* Explain overriding vs overloading
* Understand `Animal a = new Dog()`

---
===========================================================================

# 🔒 DAY 5 — ABSTRACTION + INTERFACES

⏱️ **Time:** ~2–2.5 hours
🎯 **Outcome:** You can clearly explain **abstraction vs interface** and use them in code (this is asked in almost every Java interview)

---

## 1️⃣ CORE CONCEPT (45–60 mins)

### 📌 Topics (ONLY THESE TODAY)

* What is **Abstraction**

* Abstract class

* Abstract method

* Why abstraction is used

* What is **Interface**

* Interface vs Abstract class

* Default & static methods (basic idea)

---

### 🎥 RESOURCE (stick to one)

## 2️⃣ HANDS-ON CODING (MANDATORY) (60 mins)

Create package:

```java
com.shrey.day5
```

---

## 🔹 Program 1: Abstract Class

```java
abstract class Animal {
    abstract void sound();

    void sleep() {
        System.out.println("Sleeping...");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }
}
```

👉 In main:

```java
Animal a = new Dog();
a.sound();
a.sleep();
```

---

## 🔹 Program 2: Interface

```java
interface Payment {
    void pay();
}

class UPI implements Payment {
    public void pay() {
        System.out.println("Paid using UPI");
    }
}
```

👉 In main:

```java
Payment p = new UPI();
p.pay();
```

---

## 🔹 Program 3: Multiple Implementation (IMPORTANT)

```java
class Card implements Payment {
    public void pay() {
        System.out.println("Paid using Card");
    }
}
```

👉 Try switching objects:

```java
Payment p = new Card();
p.pay();
```

👉 This is **real backend design thinking**

---

## 3️⃣ INTERVIEW QUESTIONS (30 mins)

Answer clearly:

1. What is abstraction?
2. Difference between abstract class and interface?
3. Can abstract class have constructor?
4. Can interface have methods with body?
5. Why multiple inheritance not allowed in class but allowed in interface?
6. When to use abstract class vs interface?
7. Can we create object of abstract class?

---

## 4️⃣ THINK LIKE BACKEND DEV (VERY IMPORTANT)

👉 Real-world example:

Payment system:

* Interface → `Payment`
* Implementations → `UPI`, `Card`, `NetBanking`

👉 Why?

* Loose coupling
* Easy to extend
* Clean architecture

---

## 5️⃣ MINI CHALLENGE (OPTIONAL)

Create:

* Interface `Vehicle`
* Classes `Car`, `Bike`
* Method `start()`

---

## 🔒 DAY 5 RULES

* ❌ No Spring yet
* ❌ No deep theory
* ✅ Focus on clarity + coding

---

## ✅ COMPLETION CHECK

You should:

* Understand abstraction clearly
* Know abstract vs interface difference
* Be comfortable with interface-based design

---



