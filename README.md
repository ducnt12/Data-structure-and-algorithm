# Data Structure
## Stack
Last in First out (LIFO)
## Queue
First in first out (FIFO)
## LinkedList
Same with List. Has no index. 
- SLow in searching and accessing
- Fast in adding and removing
## List
Has index
- Fast when searching and accessing data
- Slow in adding and removing
## HashMap (Dictionary)
- 1 key and 1 value. Good when finding item frequency
- Constant time when doing searching, acessing, adding or removing data.
- Has no index. Access using key or value.
- Does not allow duplicates
## HashSet (Set)
- Has 1 key only
- Does not allow duplicate
- Constant time when doing searching, acessing, adding or removing data.
# OOP
## Characteristics of OOP
### Inheritance:
-   The process that an object inherit fields, functions from another object.
-   The existing class is super-class while the new class is sub-class
### Encapsulation
-   The wrapping of data and functions into a single unit
-   Enable data and information hiding from other classes.
### Polymorphism
-   Multiple forms
-   Overloading and function overloading
-   2 types: static and dynamic
### Abstraction:
-   Show only essential information and hide unnecessary information

## Abtract class VS Interface
### Differences:
1.  Methods in interface is always public abstract
2.  Methods in abstract class can be either abstract or concrete
3.  Can implement multiple interfaces but cannot extend from multiple classes
4.  Methods in the interface must be public while they can set to public or protected in abstract class.

### When to use Abstract class:
    [+] When there is a group of objects with the same attributes inheritted from another class
    [+] Consider using it when the problem makes statement "A is B" EX. Cat is an animal, dog is an animal
### When to use Interface:
    [+] Need multiple inheritances
    [+] When that group of objects does not have the same attributes but same functionalities
    [+] Consider using Interface when the problem makes statement "A is capable of {doing this}" EX. ImageSender is capable of sending images.


# SQL vs NoSQL

## Differences
-   NoSQL is stored in form of document, graph or column
-   SQL is stored in form of table
-   SQL is vertical scale with extra hardware so it is limitted
-   NoSQL is horizontal scale by adding more nodes (computers or servers)
##  When to use?
### SQL
    [+]   Working with complex queries
    [+]   High transaction application
    [+]   Dont anticipate a lot of changes
### NoSQL
    [+] When constantly adding new features, functions
    [+] Working with highly flexible schema
    [+] When data needs to grow over time


# Socket network
