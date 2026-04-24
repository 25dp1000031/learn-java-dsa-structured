# 🧠 Java, Memory, and Object-Oriented Programming
This guide explores key programming concepts in Java, focusing on memory management, stack vs heap, function call handling, object-oriented principles, and software design best practices.

## ⚖️ Java vs Python: Static vs Dynamic Typing
* Java: Statically typed  
    - Variables must have their types defined at compile time.  

* Python: Dynamically typed  
    - Variables can hold any type; types are resolved at runtime.  

* ✅ Static typing helps catch errors at compile time and enables better performance optimization.

* 🧱 Memory Management in Java
    - Java uses two main memory areas:

* 📦 Stack Memory
    - Stores primitive variables and references to objects.
    - Also stores function activation records (call frames).

* 🧠 Heap Memory
    - Stores objects and class instances created using new.
    - Managed automatically via Garbage Collection (GC).

* 🔁 Function Calls and the Stack
    - Every function call pushes an activation record (or stack frame) onto the stack:

* Contains:
    - Local variables
    - Return address
    - Links to previous stack frame

## Stack frame behavior:

- 📥 Push on function call

- 📤 Pop on return

- 🔗 Control link: Points to previous activation record

- 📍 Return link: Points to where result should be stored

- 💡 Variables exist only while their activation record is on the stack. When the function returns, they are deallocated.

## 🗑️ Automatic vs Manual Memory Management
* In Java & Python:
    - Memory is automatically managed.
    - Uses Mark-and-Sweep Garbage Collection:
    - Detects unreachable objects
    - Frees their memory automatically

* In C (for contrast):

```c
int* p = malloc(sizeof(int));  // Manual allocation
free(p);                      // Must be manually freed
```
* in C
    - ❌ Manual memory management is error-prone
    - Memory leaks
    - Dangling pointers
    - ✅ Java & Python prevent memory leaks (in most cases) using GC.

## 🪜 Stepwise Refinement

* Stepwise Refinement is a software design strategy:
    - Start with a high-level description of a task.  
    - Break it into subtasks.  
    - Recursively refine each subtask into smaller parts.
    - Assign subtasks to different developers for implementation.

* 💡 This approach helps build large systems by focusing on what to do before how to do it.

## 🧩 Modular Software Development
- Design your software as a set of independent components.

* 🔗 Component Basics:
    - Each component has:

    - Interface: What’s visible to other components (e.g. function headers)

    - Specification: What the component is supposed to do

* 🛠️ How to Develop Components:
- Build a prototype to validate functionality

- Improve each part independently, without changing its interface or spec

- Example:
```java
// Interface
public int add(int a, int b);

// Specification
// Returns the sum of two integers
```
- 💡 Think of components like contracts. As long as the contract doesn’t change, the internal implementation can evolve.

## 🧱 Classes and Objects
* 🔧 Class
- A class is a blueprint for creating objects.

- Defines:

- How data is stored

- What methods manipulate that data

- 🧍 Object
- A concrete instance of a class:

- Has its own copy of instance variables

- Responds to method calls → this is like sending a message

```java
class Dog {
    String name;
    void bark() { System.out.println("Woof!"); }
}

Dog d = new Dog();  // Object
d.bark();           // Message sent to d
```

## 🔁 Core Concepts of OOP
* 🎭 Abstraction
- Hide internal implementation details, expose only what's necessary.

* 🧬 Inheritance
- Enables code reuse

- A subclass can inherit methods and properties from a superclass

```java
class Animal { void speak() { System.out.println("..."); } }
class Dog extends Animal { void speak() { System.out.println("Woof!"); } }
```
* 🧩 Subtyping (Is-a Relationship)
- 💡 A subtype is a specialized version of a type

- If A is a subtype of B, then:

- A can be used anywhere B is expected

- Every A inherits all methods/attributes of B

- Example:

```less
B → Employee → f()
|
A → Manager → f()
Manager is a subtype of Employee

All Employee behavior is available in Manager
```

* 🔄 Philosophically:

- Subtyping = interface relationship

- Inheritance = implementation reuse

* ⚙️ Dynamic Method Lookup
- At compile time, Java checks if a method exists for the declared type (static typing).

- At runtime, it resolves the method to call based on the object’s actual type.

```java

Employee e = new Manager();
e.f();  // Executes Manager.f(), not Employee.f()
✅ This is called dynamic dispatch or polymorphism
```

* ⚠️ Challenge: Writing Specifications
- Specifications should:

- Describe what the function does

- Be language-independent

- Balance abstraction and detail

- ❌ You cannot always verify specifications algorithmically due to the halting problem

## ✅ Summary
* Concept	Description
* Java Memory Model	Stack (for variables) and Heap (for objects)
* Garbage Collection	Automatically frees unreachable memory (Mark-and-Sweep)
* Activation Record	Stack frame per function call, deallocated on return
* Stepwise Refinement	Break tasks into subtasks, refine progressively
* Modular Development	Interface + Specification + Independent Implementation
* Classes & Objects	Classes define structure; objects are instances
* Subtyping vs Inheritance	Subtyping = interface relationship, Inheritance = implementation reuse
* Dynamic Lookup	Runtime method resolution based on actual object type












Java is a static language unlike python 
java uses a stack heap memory management 
variables are stored in stack while objects are stored in heap
each function needs storage for local variables , create activation record when function is called
activation records are stacked - 1. popped when function exits - 2. control link points to start of previous record - 3. return value link tells where to store result

variable in activation record at top of stack
access global variables by following control links

lifetime of a variable - storage allocated is still on the stack

on stack variables are deallocated when a function exits , unused storage is taken care off by garbage collection

we can also do mannual memory management with p = malloc(...) and free(p) in c but this is prone to error and memory leaks 

thus we have automatic garbage collection in java and python , this marks and sweeps at runtime

Stepwise refinement :
begin with a high level description of the task
refine task into subtasks
further elaborate each subtask
subtasks can be coded by different people
program refinement -- focus on code, not much change in data structures

modular software development
use refinement to divide the solution into components
build a prototype of each component to validate the design 
components are described in terms of : 1 interfaces - what is visible to other components, typically function calls 2 specification - behaviour of the component, as visible through interface
improve each component independently, preserving interface and specification
simplest example of a component : a function : interfaces - function header, arguements and return type : specification - intended input output behaviour

main challenge : suitable language to write specifications
balance abstraction and detail, should not be another programming language!
cannot algorithmically check that specification is met (halting problem!)

programming with objects 
object are like abstract datatypes

class : templates for data type : how data is stored : how public functions manipulate data : basically a blueprint 

object : concrete instance of template(class) - each object maintains a separate copy of local data - invoke methods on objects - send a message to the object 

features of oop
abstraction, subtyping, Dynamic lookup, inheritance

inheritance : re-use of implementations for exmample a can inherit from b if a is a subtype of b
philosophically, however the two are different subtyping is a relationship of interfaces and inheritance is a relationship of implementations

subtyping : a subtype is a specialization of a type
if A is a subtype of B , whenever an object of type B is needed , an object of type A can be used 
every object of type A is also an object of type B
think subject -- if X ⊆ Y , every x ∈ X is also in Y
if f() is a method in B and A is a sbutype of B, every object of A also supports f()
for example dequeue is a subtype of stack, queue
for example :
B -> employee -> f()
|
A -> manager -> f() ->Subtyping
A is a subtype of B , it inherits all the attributes

dynamic lookup : 
whether a method can be invoked on an object is a static property - type-checking
