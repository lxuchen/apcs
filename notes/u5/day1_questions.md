Nice, this Day 1 note is exactly AP-CS style already.
Here are AP CS A–style questions based directly on your notes and the Rock/Cookie examples.

I’ll give you questions only (no answers) so you can use them as practice or with your kid. If you later want answer keys, I can add them.

⸻

Part A – Multiple-Choice (Concept & Code Reading)

Q1

Which of the following best describes the relationship between a class and an object?

A. A class is an object that stores many variables.
B. A class is a blueprint used to create objects.
C. A class is a method inside an object.
D. A class is a driver that tests objects.

⸻

Q2

Consider the following partial class:

public class Rock
{
    private String color;
    private double weight;

    // missing constructor(s) and methods
}

Which statement about color and weight is true?

A. They can only be accessed directly inside the Rock class.
B. They are public instance variables.
C. They can never be changed once initialized.
D. They must be declared inside a method to be valid.

⸻

Q3

Which of the following is a valid constructor header for the Rock class?

A. public void Rock(String c, double w)
B. public Rock(String c, double w)
C. private Rock(String c, double w)
D. public static Rock(String c, double w)

(Assume we want a public constructor that initializes the fields.)

⸻

Q4

Consider the Rock class from your notes:

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

Which statement is true?

A. The class has no default constructor.
B. The class has exactly one constructor.
C. The class has two constructors; the no-argument constructor is the default constructor.
D. The class has two constructors, but the one with parameters is the default constructor.

⸻

Q5

Which of the following is not a correct description of a mutator method?

A. It is also called a “setter”.
B. It usually has a void return type.
C. It changes the state of a private instance variable.
D. It is required to be named with the prefix get.

⸻

Q6

Consider this method from the Rock class:

public String getColor()
{
    return color;
}

What kind of method is this?

A. Constructor
B. Accessor
C. Mutator
D. Static helper method

⸻

Q7

Assume the Rock class defines toString as in your notes:

public String toString()
{
    return color + ", " + weight + " lbs";
}

What is the effect of the following code?

Rock r = new Rock("grey", 2.9);
System.out.println(r);

A. It causes a compile-time error because r is not a String.
B. It prints the memory address of r.
C. It prints: grey, 2.9 lbs
D. It prints nothing.

⸻

Q8

Consider the Cookie class header:

public class Cookie
{
    private String flavor;
    private double weight;
    private int numCalories;

    // constructors and methods not shown
}

Which of the following best follows the AP CS A recommended encapsulation style?

A. Make all instance variables public so they are easier to access.
B. Make all instance variables private and provide accessor/mutator methods.
C. Make all methods private to prevent outside access.
D. Use the static keyword on all instance variables.

⸻

Q9

Look at this constructor from your notes (assume it’s inside Cookie):

public Cookie(String f, double w, int c)
{
    flavor = f;
    weight = w;
    numCalories = c;
}

Which of the following must be true for this constructor to compile?

A. The class name must be Cookie.
B. The instance variables must be named f, w, and c.
C. The constructor must have a void return type.
D. The constructor must be declared static.

⸻

Q10

Which statement about the toString method is correct?

A. A class can only have a toString method if it also has a constructor.
B. toString must be declared static.
C. toString must return a String and is called automatically when an object is passed to println.
D. toString must print the data fields using System.out.println.

⸻

Part B – Code Analysis & Error Spotting

Use the Rock and RockTester code from your note (with a few typos preserved):

public void breakInTwo()
{
    weight /= 2;
    system.out.println("CRACK!")
}

Q11

There are two compile-time errors in the breakInTwo method above.
Describe both errors and how to fix each one.

⸻

Q12

The RockTester class contains the following line:

double total = x.getWeight() + y.getWeight() + z.getWeight();

Assuming x, y, and z are all Rock objects and have been properly initialized, which of the following best describes what this line does?

A. It concatenates the weights into a single String.
B. It calls the constructor three times.
C. It adds the three weight values and stores the result in total.
D. It causes a run-time error because you cannot add doubles.

⸻

Q13

Consider this line from your notes (slightly modified):

System.out.println("All rocks will weigh " + total + " lbs");

If total is 8.9, what is the exact output?

A. All rocks will weigh 8.9 lbs
B. All rocks will weigh total lbs
C. All rocks will weigh 8.900000 lbs
D. It depends on how toString is written in Rock.

⸻

Part C – Short Answer / Free-Response Style (Conceptual)

Q14

Explain the difference between:
	•	An accessor (get) method, and
	•	A mutator (set) method

Use the Cookie class as an example in your explanation.

⸻

Q15

Why does AP CS A insist that all instance variables in resource classes be declared private?
Give at least two reasons related to program design or error prevention.

⸻

Q16

In your notes, it says:

Object methods do NOT use static.

Explain why AP CS A discourages using static on methods that operate on instance data.
What would be the problem if all your methods in Rock were declared static?

⸻

Part D – Mini FRQ-Style Questions (Based on Your Notes)

Q17 – Class Design (Constructor & toString)

Write a simple public class Book that:
	•	Has three private instance variables: title (String), author (String), numPages (int)
	•	Has a default constructor that sets:
	•	title to ""
	•	author to ""
	•	numPages to 0
	•	Has a non-default constructor that takes three parameters and initializes all fields
	•	Has a toString method that returns a single string in this format:

title by author, numPages pages

You do not need a tester class; just write the Book class.

⸻

Q18 – Fixing a Bad Constructor

A student writes the following constructor for Cookie:

public void Cookie(String f, double w, int c)
{
    flavor = f;
    weight = w;
    numCalories = c;
}

This code compiles but does not behave as the student expects.
	1.	Explain why this is not actually a constructor.
	2.	Rewrite it correctly as a proper constructor.

⸻

Q19 – Tracing Object Creation

Given the Rock class and this main method:

public static void main(String[] args)
{
    Rock a = new Rock("grey", 2.9);
    Rock b = new Rock();
    Rock c = new Rock("brown", 6.0);

    c.breakInTwo();

    double total = a.getWeight() + b.getWeight() + c.getWeight();
    System.out.println(total);
}

Assuming the Rock class’s default constructor sets color to "" and weight to 0, and breakInTwo halves the weight, answer the following:
	1.	What are the final weights of a, b, and c right before total is computed?
	2.	What is the value of total that gets printed?

(Don’t worry if you’re not 100% sure—this is the kind of thing AP expects students to be able to trace.)

⸻

If you’d like, next step we can:
	•	Turn these into a Markdown quiz file to drop straight into your notes/ folder, or
	•	I can give you a full answer key with explanations, AP-grader style, for each question.