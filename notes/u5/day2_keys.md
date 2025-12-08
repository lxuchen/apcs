Here is the complete answer key for your Day 2 review questions, written clearly and AP-CS-A–style.

⸻

✅ Unit 5 Day 2 — Answer Key

⸻

Part A – Multiple Choice

Q1. Instance vs Local Variables

Correct answer: C
Local variables exist only within their method/block scope.

⸻

Q2. Overloaded Methods

Correct answer: B
These differ by parameter type (int vs double).
Return type alone does not make a method overloaded.

⸻

Q3. Default values

Correct answer: D — String name
String is a reference type → default value is null.

⸻

Q4. Default equals()

Correct answer: B
Default equals checks reference equality, identical to ==.

⸻

Q5. Constructor overloading

Correct answer: B
Constructors must differ in the number or types of parameters.
Return type is irrelevant because constructors do not have return types.

⸻

Q6. Copy constructor

Correct answer: B
Its purpose is to make a new object that copies the fields of another.

⸻

Q7. toString() behavior

Correct answer: B
println(object) automatically calls object.toString().

⸻

Q8. Overloading vs Overriding

Correct answer: B
Overriding = same name + same parameters, but in a subclass.

⸻

Part B – Short Answer

Q9. Local vs Instance Variables

Aspect	Local Variable	Instance Variable
Declared in	a method or block	inside the class, outside methods
Created when	the method is invoked	when the object is constructed
Destroyed when	method ends	object is garbage collected
Default values	none → must initialize	automatic defaults (0, 0.0, false, null)


⸻

Q10. Why not create getters/setters for everything?

Any two of these earn full credit:
	•	Breaks encapsulation by exposing internal state unnecessarily
	•	Allows external code to modify fields that should be protected
	•	Violates abstraction (class should hide details)
	•	Makes it easier to misuse the class
	•	Not all fields should be changeable (e.g., student ID, birth year)

⸻

Q11. Problems with the incorrect equals()

Errors include:
	1.	other is not defined → must cast obj to Student.
	2.	Method does not check for obj instanceof Student.
	3.	No return false; at the end.
	4.	Might cause NullPointerException if names are null.

Any two correct problems earn full credit.

⸻

Q12. Valid overloaded methods example

public void send(int x) { }

public void send(String msg, int times) { }

They differ in parameter list → valid overload.

⸻

Part C – Code Analysis

Q13. Output

false
true

Explanation:
	•	s1 == s2 → false because these are two different objects in memory
	•	s1.equals(s2) → true because String overrides equals to compare values

⸻

Q14. Is this a valid overloaded constructor?

public Student(String name, double gpa)

Answer:
It is an overloaded constructor only if the class already has another constructor with a different parameter list.
Constructor overloading depends solely on parameter differences, not return type.

⸻

Q15. Errors in this equals()

return this.lastName.equals(other.name) &&

Errors:
	1.	other.name → incorrect variable name (name doesn’t exist). Should be other.lastName.
	2.	Method may not return anything if obj is not instance of Student (missing final return false;).
	3.	No null-checks (optional but common to mention).

⸻

Part D – Mini FRQs

Q16. Copy constructor

public Fraction(Fraction other)
{
    this.num = other.num;
    this.denom = other.denom;
}


⸻

Q17. Overloaded methods in Printer class

public void printData(int x) {
    System.out.println("Number: " + x);
}

public void printData(String label, int x) {
    System.out.println(label + ": " + x);
}

Methods have same name → different parameters → valid overload.

⸻

Q18. Is this valid overloading?

public void save(int x)
public int save(int y)

Answer: NOT valid overloading.

Why?
	•	They have the same parameter list (one int).
	•	Overloading requires different parameter counts or types.
	•	Different return types do not create overloads.

⸻

🎉 All answers completed!

If you’d like, I can now generate:
	•	A Day 2 worksheet (Markdown) to drop into your notes folder
	•	A Day 3 lesson plan (AP style)
	•	More code debugging practice, similar to AP FRQ questions

Just tell me!