public class StudentProfile {
    String firstName;
    String lastName;
    int ExpectedYearToGraduate;
    double gpa;
    String declaredMajor;

    public StudentProfile (String firstName, String lastName,int expectedYearToGraduate, double gpa, String declaredMajor)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.ExpectedYearToGraduate = expectedYearToGraduate;
        this.gpa = gpa;
        this.declaredMajor = declaredMajor;
    }

    public int IncrementExpectedGraduationYear()
    {
        int incrementYear = this.ExpectedYearToGraduate + 1;
        return  incrementYear;
    }
}
