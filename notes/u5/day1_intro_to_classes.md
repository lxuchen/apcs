## Basic Concepts

- **object**: is a space in memory that has its own data and capabilities
- **class**: is the blueprint / template defines how to build objects
- driver / tester: create object
- objects: instead of isolated variables, collect them into unit
- object templates: 
    - what it has
        - State | data fields | instance variable 
        - **all should be declared as private**, for AP CS, this is the case
        - declared outside of any methods, long life, indeed what it has
        - can only access or change the date field from within the class
        - help keep objects from being unintentionally modified from outside the class
    - what it can do 
        - Behavior | methods
        - **constructor**, special method, a method that creates an instance of an object and assigns initial values to the data fields (initializes the data fields)
            - default constructor, a constructor that does not require arguments are sent
            - Object methods do NOT use **static** keyword
            - constructor name has to **match** the Class name exactly
            - the first method in a resource class
            - can be more than one constructor (it's called **overloaded**)
            - a constructor has no return type
        - **accesssor methods**, a.k.a. **getter** methods, return the values of data fields if they need to be seen in another program
        - **mutator methods**, a.k.a. **setter** (or modifier) methods, allow other program to change the state of a data field
        - **`toString` method**, is called automatically if you were to send an instance of your object to a `println`
            - it has return type
            - can be written as `System.out.println(object)` or `System.out.println(object.toString())`


```
class {
    data
    methods
}
```


## Example Class
```
public class Rock
{
    private String color;
    private double weight;

    public Rock()
    {
        color = "";
        weight = 0;
    }

    public Rock(String c, double w)
    {
        color = c;
        weight = w;
    }

    public String getColor()
    {
        return color;
    }

    public double getWeight()
    {
        return weight;
    }

    public void setWeight(double w)
    {
        weight = w;
    }

    public void breakInTwo()
    {
        weight /=2;
        system.out.println("CRACK!")
    }

    public String toString()
    {
        return color+ ', ' + weight + ' lbs';
    }

}

public class RockTester
{
    public static void main(String[] arg)
    {
        Rock x = new Rock("grey", 2.9);
        Rock y = new Rock();
        Rock z = new Rock("Brown", 6.0);
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        z.breakInTwo();
        double total = x.getWeight() + y.getWeight() + z.getWeight();
        System.out.println("All J will weigh " + total + " lbs");

    }
}
```

## Review Questions
- Video Unit 5 Day 1 Question 4:
    - Check if the constructor name matches (Capital first letter)
    - Check **static** (NO static, no void)
    - Check arguments (type must match)
    - Check which variable assign to which variable
    - No return type

```
public class Cookie
{
    private String flavor;
    private double weight;
    private int numCalories;

    public Cookie()                             -> Empty argument list, even without arg list, still keep in mind what types they have
    {
        flavor = "";                            -> Pay attention to each type
        weight = 0.0;                           -> Pay special attention on how to assign a double
        numCalories = 0;
    }

    public Cookie(String f, double w, int c)    -> Name match
                                                -> Variable type match
                                                -> No static, no void
                                                -> No return type
    {
        flavor = f;
        weight = w;
        numCalories = c;                        -> which ones assign to which

    public String toString()
    {
        return flavor + " " + weight + " " + numCalories;
                                                -> it has return type
                                                -> 
    }

    }
}

Cookie cookie1 = new Cookie("Chocolate", 1.2, 30)   -> Pay attention to the syntax and type match
```