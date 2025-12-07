public class Student {
    private String lastName, firstName;
    private double gpa;
    private char gender;

    public Student() {

    }

    public Student(String initialLastNm, String initialFirstNm, char initialGender, double initialGPA) {
        lastName = initialFirstNm;
        firstName = initialFirstNm;
        gender = initialGender;
        gpa = initialGPA;
    }

    public Student(String initialLastNm, String initialFirstNm, char initialGender) {
        lastName = initialFirstNm;
        firstName = initialFirstNm;
        gpa = 0.0;
        gender = initialGender;
    }

    public boolean equals(Object obj) {
        return this.lastName.equals(other.lastName) &&
                this.firstName.equals(other.firstName) &&
                this.gpa == other.gpa &&
                this.gender == other.gender;
    }

}