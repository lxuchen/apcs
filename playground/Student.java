public class Student {
    private String lastName, firstName;
    private double gpa;
    private char gender;

    // default constructor
    public Student() {
        gender = 'x';
    }

    // 4-arg constructor
    public Student(String initialLastNm, String initialFirstNm, char initialGender, double initialGPA) {
        lastName = initialLastNm;
        firstName = initialFirstNm;
        gender = initialGender;
        gpa = initialGPA;
    }

    // 3-arg constructor
    public Student(String initialLastNm, String initialFirstNm, char initialGender) {
        lastName = initialLastNm;
        firstName = initialFirstNm;
        gpa = 0.0;
        gender = initialGender;
    }

    // copy constructor
    public Student(Student otherStudent) {
        this.lastName = otherStudent.lastName;
        this.firstName = otherStudent.firstName;
        this.gpa = otherStudent.gpa;
        this.gender = otherStudent.gender;
    }

    // accessor methods
    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public char getGender() {
        return gender;
    }

    // mutator method for GPA
    public void setGPA(double newGPA) {
        gpa = newGPA;
    }

    // overriding the toString method
    public String toString() {
        String genderWord;
        if (this.gender == 'm' || this.gender == 'M') {
            genderWord = "male";
        } else if (this.gender == 'f' || this.gender == 'f') {
            genderWord = "female";
        } else {
            genderWord = "other";
        }
        return firstName + " " + lastName + " has a GPA of " + gpa + " and a gender of " + genderWord;
    }

    // overriding the equals method
    public boolean equals(Object obj) {
        if (obj instanceof Student) {
            Student other = (Student) obj;
            return this.lastName.equals(other.lastName) &&
                    this.firstName.equals(other.firstName) &&
                    this.gpa == other.gpa &&
                    this.gender == other.gender;
        } else
            return false;
    }

    public static void main(String[] args) {
        Student blank = new Student();
        Student good = new Student("Lau", "David", 'm', 4.75);
        Student anotherGood = new Student("Lee", "David", 'm', 4.5);
        Student best = new Student("London", "Marisa", 'f');
        Student londonCopy = new Student(best);
        System.out.println(good);
        System.out.println(blank);
        System.out.println(anotherGood);
        System.out.println(best);
        System.out.println(londonCopy);
        System.out.println(good.equals(anotherGood));
        System.out.println(best.equals(londonCopy));
        good.toString();
    }

}