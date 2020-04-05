# Access modifiers, getter, setter, constructor, static, final, overload

## 1. Access modifiers

In java, we have some `access modifiers` (in Vietnamese called *bổ từ xác định quyền truy cập*):
- `public`
- `protected`
- `private`
- `default`

### 1.1 Public
`public` is the access modifier, used before properties, methods, classes to mark that the properties, methods, classes are public, 
can be access from anywhere in project. 

A class is just one of two kinds: `public` and `un-public`. In a `.java` file, we only have one `public class` and many `un-public` classes.
If in a `.java` file has many classes, when compiling we'll get a separated `.class` files.
(Demo in `MultipleClassInFile`)

```java
// public class
public class Student{
  // class content 
}

// public property
public int id;

// public method
public void showInfo(){
  // method content
}
```

### 1.2 Protected
`protected` is the access modifier, used before properties and methods to mark that the properties, methods are protected when inheriting (will discuss later).
A protected property, method can be accessed in classes in the same package, with classes in different package they can not access directly.  

```java
// protected property
protected int id;

// protected method
protected void showInfo(){
  // method content
}
```

### 1.3. Private
`private` is the access modifier, used before properties and methods to mark that the properties, methods are private,
these properties and methods can not be access outside the class that they belonging to.

The only way (at this time) to access `private` methods and properties in other classes is using `getter` and `setter`.

```java
// private property
private int id;

// private method
private void showInfo(){
  // method content
}
```

### 1.4. Default
`default` is the access modifier, used before properties, methods and classes to mark that properties, methods and classes can be accessed from classes in the same package.
 
```java
// default class
class Student{
  // class content 
}

// default property
int id;

// default method
void showInfo(){
  // method content
}
```

## 2. Getter, setter
`get` and `set` are methods to help us can access to `private` properties or methods by invoking `get` and `set` at other outside classes.
 
 Besides, `getter` and `setter` help us recognize the property names, based on the name of `getter`, `setter`.
 See examples below:
 
 - Example 1:
 ```java
private String className;

public String getClassName() {
  return className;
}

public void setClassName(String className) {
  this.className = className;
}

// => the property is "className"
```   

- Example 2:
 ```java
private String className;

public String getClassName() {
  return className;
}

public void setTenLop(String name) {
  this.className = name;
}

// => the property "className" is read only property, the property "tenLop" is write only property 
```  

- Example 3:
 ```java
private String className;

public String getClazzName() {
  return className;
}

public void setTenLop(String name) {
  this.className = name;
}

// => the property "clazzName" is read only property, the property "tenLop" is write only property 
```

## 3. Constructor
`constructor` is the special method of class which has no response type. This method'll be invoked while we initiate new object.
If we don't write constructor then java'll auto create empty constructor (default constructor). 
By contrast, if we write our constructor then java use that constructor instead of default constructor.

`constructor` helps us can do things when we create new objects.

```java
// default constructor
public Student() {
}

// custom constructor
public Student(String name) {
  this.name = name;
  System.out.println("Do anything here");
  for(int i = 0; i < 10; i++){
    // ....
  }
}
```

## 4. Static
`static` keyword is used before properties, method and code blocks.

- Before properties: The `static` properties can be access directly by class name. It can be access outside class or same/different packages depends on the access modifiers.
The static properties/variables are a static memory space which are shared commonly.

```java
public class Student{
  public static int STUDENT_NUMBER = 1000;
  
  // class content
}

Student.STUDENT_NUMBER = 500;
```  
The constant in java is usually defined using `public static final` like this: `public static final String SCHOOL_NAME = "PTIT";`

- Before methods: The `static method` just allow `static` variables inside and is used by another `static method`

- Before code blocks: The `static code block` in a class is invoked **ONLY ONCE** when we initiate new object

```java
public class Student {
  static {
    System.out.println("Static codeeeeeee");
  }

  public Student() {
    System.out.println("Initiate new student");
  }
}

class Main {
  Student s1 = new Student();
  // Static codeeeeeee
  // Initiate new student

  Student s2 = new Student();
  // Initiate new student
}
```

## 5. Final
`final` is a keyword used before properties, methods and classes to mark that are constant properties, methods, classes.

## 5.1 Final properties

We cannot assign final variables/properties into other variables/properties.

- primitive types: constant
```java
final int SIZE = 10;
final float AVG_MARK = 8.5f;

SIZE = 5; // not allowed
```

- object types:
```java
final Student COMMON_STUDENT = new Student();

Student s1 = new Student();
s1.id = 101;

COMMON_STUDENT = s1; // not allowed

// allowed
COMMON_STUDENT.id = 101;
COMMON_STUDENT.name = "truongbb";
```

### 5.2 Final methods
Final methods are constant methods and they cannot be overridden (discuss later).

### 5.3 Final classes
Final classes are classes which are not allowed other classes to inherit (discuss later).

## 6. Overload

Overload is an way to organize methods, it allowed us can write methods having same name but other number/type of arguments.
Applying for any methods including constructors, normal methods.

```java
public void foo() {
}

public void foo(int a) {// overload
}

public void foo(String b) {//overload
}

public void foo(float c) {//overload
}

public void foo(int a, int b) {//overload
}

public static void main(String[] args) {
  foo();
  foo(13);
  foo(13, 21);
}
```

## Note
- Recommended: using `private` properties in each class (ensure the encapsulation in OOP, discuss later)
- Recommended: every properties should have access modifier (except default) 
