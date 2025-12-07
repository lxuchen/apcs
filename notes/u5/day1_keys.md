Here are the complete answer keys, written in clear AP-CS-A style.
They correspond directly to the questions in my previous message.

⸻

✅ Answer Key — AP CS A Unit 5: Classes (Based on Day 1 Notes)

⸻

Part A — Multiple-Choice Answers

Q1

B — A class is a blueprint used to create objects.

⸻

Q2

A — Private instance variables can only be accessed inside the class.

⸻

Q3

B — public Rock(String c, double w)
Constructor name must match class name and cannot have a return type.

⸻

Q4

C — The no-argument constructor is the default constructor.

⸻

Q5

D — Mutators are not required to begin with “get”.

⸻

Q6

B — An accessor (get) method.

⸻

Q7

C — It prints:
grey, 2.9 lbs

Because toString is called automatically.

⸻

Q8

B — AP CS A style requires private instance variables + public getters/setters.

⸻

Q9

A — To match the constructor name, the class must be named Cookie.

⸻

Q10

C — toString returns a String and is called automatically by println.

⸻

⸻

Part B — Code Analysis / Error Spotting

Q11 — Two errors in breakInTwo

Original code:

public void breakInTwo()
{
    weight /=2;
    system.out.println("CRACK!")
}

Error 1: system should be System
Java is case-sensitive.

Fix:

System.out.println("CRACK!");

Error 2: Missing semicolon and/or missing brace
There must be a semicolon:

System.out.println("CRACK!");

Additionally, there may be a missing } depending on formatting.

⸻

Q12

C — It adds the three weights and stores the result in total.

⸻

Q13

A —
All rocks will weigh 8.9 lbs

The variable total is converted to a string and concatenated.

⸻

⸻

Part C — Short Answer

Q14 — Difference between accessor and mutator
	•	An accessor (get method):
	•	Returns the value of a private instance variable.
	•	Does not modify the object.
Example:

public String getFlavor() { return flavor; }


	•	A mutator (set method):
	•	Modifies the value of a private instance variable.
	•	Usually has a void return type.
Example:

public void setWeight(double w) { weight = w; }



⸻

Q15 — Why private instance variables?

Any two of the following earn full credit:
	1.	Prevents accidental modification from outside the class (encapsulation).
	2.	Ensures changes happen only through methods that enforce rules (validation).
	3.	Makes debugging easier because changes to state are controlled.
	4.	Hides internal implementation — only behavior matters.

⸻

Q16 — Why AP discourages static on object methods?
	•	A static method does not belong to an object — it belongs to the class.
	•	Instance methods must operate on instance variables, which static methods cannot access directly.
	•	If all methods in Rock were static, they could not use color or weight, because those belong to an object.

So object behavior must be non-static.

⸻

⸻

Part D — Mini FRQ-Style Answers

Q17 — Book Class

public class Book
{
    private String title;
    private String author;
    private int numPages;

    public Book()
    {
        title = "";
        author = "";
        numPages = 0;
    }

    public Book(String t, String a, int n)
    {
        title = t;
        author = a;
        numPages = n;
    }

    public String toString()
    {
        return title + " by " + author + ", " + numPages + " pages";
    }
}


⸻

Q18 — Fixing Bad Constructor

Original student code:

public void Cookie(String f, double w, int c)
{
    flavor = f;
    weight = w;
    numCalories = c;
}

1. Why this is NOT a constructor?
Because it has a return type (void).
Constructors must not specify any return type.

This line makes it a regular method, not a constructor.

2. Correct version:

public Cookie(String f, double w, int c)
{
    flavor = f;
    weight = w;
    numCalories = c;
}


⸻

Q19 — Tracing Object Creation

Given:

Rock a = new Rock("grey", 2.9);
Rock b = new Rock();
Rock c = new Rock("brown", 6.0);

c.breakInTwo();
double total = a.getWeight() + b.getWeight() + c.getWeight();

Assume default constructor sets:

color = ""
weight = 0

Assume breakInTwo() halves the weight.

1. Final weights:
	•	a → 2.9
	•	b → 0
	•	c → 6.0 / 2 = 3.0

2. Total:
Total = 2.9 + 0 + 3.0 = 5.9

Output:

5.9


⸻

🎉 All answers complete!

If you want, I can now:
	•	Generate another batch of AP-style questions (Unit 5 Day 2?),
	•	Create an AP CS A practice worksheet in Markdown to place in your workspace, or
	•	Build you a Unit 5 → Unit 6 → Unit 7 progression plan.

What would you like next?