Here is the full answer key for your Day 3 review questions, aligned exactly with the content in your day3_questions.md.

⸻

✅ Unit 5 — Day 3 Answer Key (Static vs Instance)

⸻

Part A — Multiple Choice

Q1 — Static Variables

Correct answer: B

A static variable belongs to the class, not to any individual object.

⸻

Q2 — Instance Variables

Correct answer: C

Each object has its own separate copy of instance variables.

⸻

Q3 — Static Methods

Correct answer: C

public static int doubleIt(int x)
A static method must include the keyword static.

⸻

Q4 — Allowed Inside a Static Method

Correct answer: C

A static method can access static variables, but cannot access instance variables or use this.

⸻

Q5 — Valid Call

Correct answer: B

Bicycle.getNumberOfBicycles();
Static methods should be called using the class name.

⸻

Q6 — Counter Pattern

Correct answer: C

id receives a unique increasing number (1, 2, 3, …) based on the static counter.

⸻

Q7 — Class Constant

Correct answer: C

static final int SIZE = 100;
A class constant must be static + final.

⸻

Part B — Code Analysis

Q8 — Why does this fail?

public static void main(String[] args) {
    int j = i;   // error
    ml();        // error
}

	•	int j = i; → ❌ Because i is an instance variable, and static methods cannot access instance variables.
	•	ml(); → ❌ Because ml is an instance method, and static methods cannot call instance methods without an object.

⸻

Q9 — Trace the Corrected Version

A a = new A();
int j = a.i;
a.ml();

Given:

i = 5
k = 2
m2(i, k) = 25

If ml() does:

i = m2(i, k);  // i = 25

Then:

New value of a.i = 25

⸻

Q10 — Illegal Access in factorial()

return n * count;  // illegal

Why illegal?
count is an instance variable, and static methods cannot access instance variables because no object exists when a static method is called.

⸻

Part C — Short Answer

Q11 — Differences between static and instance variables

Any two points earn full credit.

Static Variables	Instance Variables
Belong to the class	Belong to each object
Only one copy exists	Each object has its own copy
Exist when program loads	Exist when an object is created
Accessed via class name	Accessed via object reference


⸻

Q12 — Rule of Access

Class (static) methods cannot access instance variables,
but instance methods can access static variables.

⸻

Q13 — Why use static methods?

Example: a utility function such as:

public static int factorial(int n)

Reason:
Static methods are used when the behavior does not depend on any object’s instance variables.

⸻

Q14 — Why instance methods can access static variables, but not vice versa?

Because:
	•	Static methods run before any objects exist, so instance variables do not exist yet.
	•	Instance methods run on an actual object, so they have access to both the object’s instance variables and the class’s static variables.

⸻

Part D — FRQ-Style

Q15 — Book class with counter

public class Book
{
    private String title;
    private int id;

    private static int count = 0;

    public Book(String t)
    {
        title = t;
        count++;
        id = count;    // unique ID
    }

    public static int getCount()
    {
        return count;
    }
}


⸻

Q16 — cube() static method

public class MathTools
{
    public static int cube(int x)
    {
        return x * x * x;
    }
}


⸻

Q17 — Which should be static vs instance?
	1.	getTotalAccounts() → static
Because the total number of accounts belongs to the class, not any single account.
	2.	deposit(double amount) → instance
Because depositing changes the balance of a specific BankAccount object, not the class.

⸻

🎉 All answers complete!

If you’d like, I can also generate:
	•	A Day 3 printable worksheet
	•	A Day 4 lesson plan (AP-style)
	•	A combined Unit 5 master quiz with 50–70 questions

Just tell me!