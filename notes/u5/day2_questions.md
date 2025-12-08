Perfect — here are Day 2 AP-CS-A–style review questions based directly on your notes.

I kept the structure parallel to the College Board style:
	•	Multiple-choice
	•	Short-answer
	•	Code-analysis
	•	FRQ-mini problems

⸻

🧠 Unit 5 — Day 2 Review Questions

Part A — Multiple-Choice

Q1. Instance vs Local Variables

Which statement is true?

A. Local variables are automatically initialized to default values.
B. Instance variables cannot be private.
C. Local variables exist only inside their method/block scope.
D. Instance variables are destroyed when the method that uses them ends.

⸻

Q2. Overloaded Methods

Which of the following pairs represent valid overloaded methods?

A.

public void print(int x)
public int print(int x)

B.

public void print(int x)
public void print(double x)

C.

public String print()
public String print()

D.

public void print(int x)
public void print(int y)


⸻

Q3. Default values of instance variables

Which variable will have a default value of null if not initialized?

A. int count;
B. double weight;
C. boolean active;
D. String name;

⸻

Q4. equals() method

What does the default implementation of equals() (from Object) do?

A. Compares content of objects field-by-field.
B. Compares whether two references refer to the same object.
C. Always returns false for objects of different types.
D. Compares hash codes for equality of values.

⸻

Q5. Overloading constructors

Which statement is true about constructor overloading?

A. Two constructors may differ only in return type.
B. Overloaded constructors must differ in number or types of parameters.
C. Overloaded constructors must have different names.
D. Overloaded constructors must all call each other using this().

⸻

Q6. Copy constructor

What is the purpose of a copy constructor?

A. Convert primitive values to objects.
B. Create a new object whose fields are copies of another object.
C. Compare two objects for equality.
D. Destroy an existing object.

⸻

Q7. Which statement about toString() is correct?

A. You must always call object.toString() explicitly.
B. System.out.println(object) automatically calls toString().
C. Java prints objects by calling equals() first.
D. The default toString() prints the values of all data fields.

⸻

Q8. Overloading vs overriding

Which statement is true?

A. Overloading changes method behavior without changing parameters.
B. Overriding means same name + same parameters + different class.
C. Overloading means two methods in different classes have same name.
D. Overriding requires different parameter types.

⸻

Part B — Short Answer (AP free-response style)

Q9.

Explain the difference between:
	•	A local variable
	•	An instance variable

Address:
	•	where they are declared
	•	when they are created
	•	when they are destroyed
	•	whether they have default values

⸻

Q10.

Why should a class NOT automatically generate getter/setter methods for every private instance variable?

Give two reasons related to good class design.

⸻

Q11.

Why does this method fail to override equals() correctly?

public boolean equals(Object obj)
{
    return
      this.lastName.equals(other.lastName) &&
      this.firstName.equals(other.firstName) &&
      this.gpa == other.gpa &&
      this.gender == other.gender;
}

List two specific problems.

⸻

Q12.

Write a valid example of two overloaded methods in the same class.
(They must have the same name but differ in parameters.)

⸻

Part C — Code Analysis

Q13. What does this print?

String s1 = new String("hi");
String s2 = new String("hi");

System.out.println(s1 == s2);
System.out.println(s1.equals(s2));

Explain why for each line.

⸻

Q14. Determine if this constructor is valid.

public Student(String name, double gpa)

Is it an overloaded constructor? Why or why not?

⸻

Q15. Identify all errors in this version of equals():

public boolean equals(Object obj)
{
    if (obj instanceof Student)
    {
        Student other = (Student) obj;
        return this.lastName.equals(other.name) &&
               this.firstName.equals(other.firstName) &&
               this.gpa == other.gpa &&
               this.gender == other.gender;
    }
}

(Hint: missing returns? undeclared variable names? etc.)

⸻

Part D — Mini FRQ (AP-style)

Q16. Write a copy constructor

Write a correct copy constructor for:

public class Fraction
{
    private int num;
    private int denom;
}

that properly copies both fields from another Fraction.

⸻

Q17. Design an overloaded method

Inside a class Printer, write two overloaded methods named printData:
	1.	One takes a single int
	2.	One takes a String and an int

You do not need a full class—just the two method headers + bodies.

⸻

Q18. Determine whether this is valid overloading

public void save(int x)
public int save(int y)

Explain why this is or is not valid overloading.

⸻

If you’d like, I can now produce a full answer key, a printable worksheet, or convert these into a Markdown file for your AP CS workspace.