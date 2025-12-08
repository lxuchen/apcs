## Basic Concepts

- Don't simply write getter and setter methods for every private instance variable. Think about whether if they make sense, don't create them just because you have the option to do so
- Instance variables vs local variables
    - local variables: declared in methods / blocks
        - created when declared
        - scope limited to the block, destroyed when exit
        - must be initialized
        - access can't be modified with private / public
        - can only be modified within scope
    - instance variables: declared in class
        - created when object is instantiated
        - destroyed with object is destroyed
        - have default values
            - int: 0
            - double: 0.0
            - Boolean: false
            - Object (String): null
            - char: null character `\u0000`
        - (APCS case) access should be private
        - value can be modified anywhere inside class
        - value can be modified outside class with setter methods
- method/constructor overloading
    - multiple constructors
    - overloaded methods: methods **within** the same class that have the **same name** but differ in the number and/or types of ***parameters**
    - when call overloaded methods, base on the parameters, Java will find matching

- "Copy" constructor
    - allow you to create a object that is a copy of another
    - `other`

- "Equals" method
    - to check if 2 object of the same type are the same or not
    - `this` and `other`

- Even though every class inherits a default `toString()`, students must not rely on it because college board expects that:
	- Classes that are printed should override `toString()`.
	- The output should be meaningful.
	- `System.out.println(object)` automatically calls `object.toString()`.

- every class has `equals()` method too. Checks whether two references point to the exact same object.
    - equivalent to: `obj1 == obj2`
    - If you want value-based equality, you must override equals()

example:
```
Rock a = new Rock("grey", 2.9);
Rock b = new Rock("grey", 2.9);

System.out.println(a.equals(b));  // false because they are two different objects in memory.
System.out.println(a == b);  // also false
```

```
String s1 = new String("hi");
String s2 = new String("hi");

//which returns true?
s1 == s2          // false
s1.equals(s2)     // true
```

- Object class: is the ultimate parent of every class in Java
    - `public class Rock { }` == `public class Rock extends Object { }`
    - Every class inherits certain methods from Object
    - Every object in Java is guaranteed to have behaviors defined in Object


## Questions

- How to tell a valid overloaded method?
    - Pay attention to the same name
    - but different number / type of parameters
    - that's it! different return types don't count!

## Examples

```
public class Fraction
{
    private int num;
    private int denom;

    public Fraction (Fraction other)
    {
        num = other.num;
        denom = other.denom;
    }
}
```

```
public class Student
{
    private String lastName, firstName;
    private double gpa;
    private char gender;

    public boolean equals (Object obj)
    {
        return
            this.lastName.equals (other.lastName) &&
            this.firstName.equals (other.firstName) &&
            this.gpa == other.gpa &&
            this.gender == other.gender;
    }

}
```

```
public class Student
{
    private String lastName, firstName;
    private double gpa;
    private char gender;

    public boolean equals (Object obj)
    {
        if (obj instanceof Student)
        {
            Student other = (Student) obj;
            return this.lastName.equals (other.name) %%
                this.firstName.equals (other.firstName) &&
                this.gpa == other.gpa &&
                this.gender == other.gender;
        }
    }

}