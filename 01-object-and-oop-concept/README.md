# Object and OOP concept

## 1. `Object` and `Class`

### 1.1 Definitions
- `Object` is anything around us, 
but the abstract things we can not consider as object such as emotion, anger, funny, happy, ... 
For example, table, chair, computer, ... are objects.

- A collection of object having same one or more characteristics/behaviours is called `Class`.
For instance, class `Student` is a class standing for any student in our program; 
as the `Student.java` file in source code, they will have some properties such as `id`, `name`, `className`, ...

```java
package com.github.truongbb;

public class Student {
  int id;
  String name;
  String className;

  public void showInfo() {
    System.out.println("ID: " + id);
    System.out.println("Name: " + name);
    System.out.println("Class : " + className);
  }
}
```

Another example is class `person` is a class standing for any person, it has `id`, `name`, `maritalStatus`, ...

### 1.2 Code explanation

- Declare variables/properties:

The syntax use to declare variables/properties is: `<variable/property type> <variable/property name>;` 
(don't forget the semicolon at the end of statement).
For instance, the declaration `int age;` means I have a variable named `age` having the `integer` type.
The same with `String name;` that I have a variable named `name` having `String` type.

- Data type in java:

    There're a lot of data types in java, they're divided into two types:
  - Primitives: `boolean`, `byte`, `char`, `short`, `int`, `long`, `float`, `double`.
  - Object: `Boolean`, `Byte`, `Char`, `String`, `Short`, `Integer`, `Long`, `Float`, `Double`, .... or any other Objects (maybe discuss later).

More details about java primitive data type:


| Data Type | Size | Description |
| --- | --- | --- |
| byte | 1 byte	| Stores `whole numbers` from `-128` to `127`
| short	| 2 bytes | Stores `whole numbers` from `-32,768` to `32,767`
| int | 4 bytes | Stores `whole numbers` from `-2,147,483,648` to `2,147,483,647`
| long | 8 bytes | Stores `whole numbers` from `-9,223,372,036,854,775,808` to `9,223,372,036,854,775,807`
| float | 4 bytes | Stores `fractional numbers`. Sufficient for storing `6` to `7` decimal digits
| double | 8 bytes | Stores `fractional numbers`. Sufficient for storing `15` decimal digits
| boolean | 1 bit | Stores `true` or `false` values
| char | 2 bytes  |Stores a `single character/letter` or `ASCII values`

- Packages, Class, Properties, Methods:

`package` is just a folder contains `.java` files. A `.java` file should be in a certain package and a `class` should have package they belong to.
<br>
<br>
`class` in java code stands for a set/collection of object (as explained above) and we declare a class in `.java` file by `public class <class name>`.
Note that in a `.java` file just has only one `public class`.
<br>
<br>
`properties` is talked above.
<br>
<br>
`method` is function to do an action we want in class, and it brings common characteristics of that class.
For instance, in `Student` class we have method `showInfo` as above.

- `main method`, `main class`:

`main method` must be `public static void main(String[] args){/*content here*/}`. Each class just has only one main method and in project we can have many main methods.
If that, when we run project, we must choose a `main class` containing `main method` to run a program. 

### 1.3 Input and output with console in Java

#### 1.3.1 Input console methods

We use `System.out.println(<your content goes here>)` to write down everything what you want to console.
Your content can be a `string`, a `number` (integer, float, double, ...) or even an object.

#### 1.3.2 Output console methods

In first you getting with Java, the recommended input methods you should use is `Scanner`. Here is the usage:
```java
// of course you must import Scanner from java.util.Scanner

Scanner scanner = new Scanner(System.in);

String yourInputString = scanner.nextLine(); // you type string value
int  yourInputInteger = scanner.nextInt(); // you type integer value
boolean  yourInputInteger = scanner.nextBoolean(); // you type boolean value
float  yourInputInteger = scanner.nextFloat(); // you type float value

//... and many other supported methods
```
So, what'll happen when you type wrong format with your using method, for example, use `scanner.nextInt()` but you enter `abc`?

==> An exception will be thrown and this will be discussed later.   


# 2. Object oriented programming (OOP)

In this section we don't go deeply to talk about OOP including `encapsulation`, `inheritance`, `polymorphism`,`abstraction`;
we're just talking about some basic concepts, simple ideas.

OOP is programming about objects; we define, manage, use objects. And all these actions is following objects.
We create class to collect objects, we declare properties and methods to describe characteristics and behaviours of objects/class.

And this section just has a note: `you do your job and I'll do mine`.

That means the `showInfo` of `student` cannot write in `Person` class, or the `wingColor` property cannot write in `Cow` class.
Each class stands for a set of objects having same characteristics and behaviours, so we should organize the properties and methods
to make it clear and correct.
