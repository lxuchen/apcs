Great — now that I can see your Unit 5 Day 3 notes (Class Variables and Methods: static vs instance), here are AP-CS-A style review questions based directly on your content.

As usual, I’ll separate into:
	•	Multiple-choice
	•	Code-analysis
	•	Short-answer
	•	FRQ-style
	•	(If you want) I can generate the answer key next.

⸻

🧠 Unit 5 — Day 3 Review Questions (Static vs Instance)

⸻

Part A — Multiple Choice

Q1 — Static Variables

Which statement about static (class) variables is true?

A. Each object gets its own copy of a static variable.
B. A static variable belongs to the class, not to any object.
C. Static variables can only be read, never changed.
D. Static variables must be declared final.

⸻

Q2 — Instance Variables

Which statement is correct?

A. Instance variables are created when the program starts and remain forever.
B. Instance variables can be accessed inside static methods.
C. Instance variables exist separately inside each object.
D. Instance variables must always be initialized inside constructors.

⸻

Q3 — Static Methods

Which method header correctly defines a static method?

A. public int grow(int amount)
B. public void update()
C. public static int doubleIt(int x)
D. private instance int method(int x)

⸻

Q4 — Which is allowed?

Inside a static method, which of the following is valid?

A. Accessing instance variable speed
B. Calling an instance method applyBrake(5)
C. Accessing static variable numberOfBicycles
D. Using this to refer to an object

⸻

Q5 — Calling Static vs Instance Methods

Given:

public class Bicycle {
    private int speed;
    private static int numberOfBicycles;

    public static int getNumberOfBicycles() { ... }
    public void speedUp(int inc) { speed += inc; }
}

Which call is valid?

A. Bicycle.speedUp(5);
B. Bicycle.getNumberOfBicycles();
C. myBike.getNumberOfBicycles();
D. myBike.numberOfBicycles();

⸻

Q6 — Understanding the Counter Pattern

What value does id receive in this constructor?

public Bicycle(int startSpeed, int startGear) {
    gear = startGear;
    speed = startSpeed;
    numberOfBicycles++;
    id = numberOfBicycles;
}

A. 1 for every object
B. 0 for every object
C. A unique increasing number (1, 2, 3, …)
D. A random number

⸻

Q7 — Class Constants

Which is a class constant?

A. static int x;
B. final int x = 5;
C. static final int SIZE = 100;
D. private int id;

⸻

Part B — Code Analysis

Q8 — Why does this fail?

public static void main(String[] args) {
    int j = i;   // error
    ml();        // error
}

Explain why each line is invalid based on static vs instance rules.

⸻

Q9 — Trace the Corrected Version

Correct code:

public static void main(String[] args){
    A a = new A();
    int j = a.i;
    a.ml();
}

Assume:

int i = 5;
static int k = 2;

and m2(i, k) returns i^k = 5^2 = 25.

Compute the new value of a.i after calling a.ml().

⸻

Q10 — Identify Illegal Access

Which lines are illegal in the following?

public class Test {
    int count;

    public int getCount() {
        return count;
    }

    public static int factorial(int n) {
        return n * count;     // illegal?
    }
}

Explain why.

⸻

Part C — Short-Answer

Q11 — Compare static vs instance variables

Give two differences between:
	•	static (class) variables
	•	instance variables

⸻

Q12 — Rule of Access

Finish the AP rule (in your notes):

Class (static) methods cannot access ________________________,
but instance methods can access ___________________________.

⸻

Q13 — Why use static methods?

Give one example of a method that should be static and explain why.

(Hint: the factorial example)

⸻

Q14 — Why can instance methods access static variables, but static methods cannot access instance variables?

Explain in 1–2 sentences.

⸻

Part D — FRQ-Style Questions

Q15 — Add a Class Counter

Write a class Book that:
	•	has instance fields: title (String), id (int)
	•	has a static field count that increments each time a Book is constructed
	•	assigns each book a unique ID based on count
	•	includes a static method getCount()

You do not need getters/setters except getCount().

⸻

Q16 — Write a Valid Static Utility Method

Inside a class MathTools, write a static method:

public static int cube(int x)

that returns the cube of x.

⸻

Q17 — Static vs Instance Method Choice

Suppose you have a class BankAccount.

Which method should be static, which should be instance, and why?
	1.	getTotalAccounts() — returns how many accounts exist
	2.	deposit(double amount) — adds money to this account

Explain your choices.

⸻

If you’d like, I can now produce a full answer key, or a print-ready Markdown worksheet for your notes folder.