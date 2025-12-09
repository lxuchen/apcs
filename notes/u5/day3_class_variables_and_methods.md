## Basic Concept

 - static/class variable
    - class variable with `static` keyword
    - does not belong to any object
    - stored in a special location in memory
    - shared by all objects in a class
    - can be accessed / modified in a static method
    - can be accessed / modified by an object through an instance method but will apply to all objects
    - class constants are static variables with final keyword

 - instance variables (data fields)
    - with `private` keyword
    - tied to a specific object
    - value stored in an object's reference location in memory
    - can't be accessed / modified in a static method
    - can be accessed / modified through an instance method

 - static/class method
    - class method, not depend on the state of an object
    - do not alter a specific instance's data
    - belong to a class, not an object from the class
    - can access static variables and invoke other static methods
    - can't access instance variables nor invoke instance methods
    - called using Class name and `.` operator

**Rule**: Class methods can't access instance variables, but instance methods can access class variables


- instance methods
    - belong to an object from the class
    - can access static variables and invoke other static methods
    - can access instance variables and invoke instance methods
    - called using object name and `.` operator

## Example

public class Bicycle
{
    private int gear;
    private int speed;

    private int id;
    private static int numberOfBicycles = 0; // use the static variable as a counter, does not belong to any object

    public Bicycle(int startSpeed, int startGear)
    {
        gear = startGear;
        speed = startSpeed;
        numberOfBicycles++;
        id=numberOfBicycles;
    }

    public static int getNumberOfBicycles() // static method only **constructors** has not static
    {
        return numberOfBicycles;
    }

    public void applyBrake(int decrement)
    {
        speed -= decrement;
    }

    public void speedUp(int increment)
    {
        speed += increment;
    }
}

## Tricky example:

```
public class A {
    int i = 5;
    static int k = 2;

    public static void main(String[] args) {
        int j = i;
        ml();
    }

    public void ml() {
        i = i + k + m2(i, k);
    }

    public static int m2(int i, int j){
        return (int)(Math.pow(i, j));
    }
}
```

**correct version**

public Class A {
    int i = 5;
    static int k = 2;

    public void ml() {
        i = i + k + m2(i,k);
    }

    public static int m2(int i, int j) {
        return (int)(Math.pow(i, j));
    }

    public static void main(String[] args){
        A a = new A();
        int j = a.i;
        a.ml();
    }
}

## Questions

public class Test {
    int count;

    public int getCount() {
        return count;
    }

    public static int factorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++)
            result *= i;
        return result;
    }

    public static void main(String[] args) {
        ...
    }
}


