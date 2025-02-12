public class Crewbie
{
    private int studentId;
    private String firstName;
    private String crewTeacher;
    private double totalCredits;
    private double currentGPA;

    public Crewbie (int initId, String initFirstName, String initCrewTeacher,
                    double initCredits, double initGPA)
    {
        studentId = initId;
        firstName = initFirstName;
        crewTeacher = initCrewTeacher;
        totalCredits = initCredits;
        currentGPA = initGPA;       
    }

    public void introduceSelf()
    {
        System.out.println("Hi, my name is " + firstName + ".");
        System.out.println("I am in " + crewTeacher + " Crew.");
    }

    public void orderLunch() {
        System.out.println("Thanks for the pizza! My id is " + studentId + ".");
    }

    public void updateGPA(double grade, double credits)
    {
        double totalGradePoints = (currentGPA * totalCredits) + (grade * credits);
        currentGPA = totalGradePoints / (totalCredits + credits);
    }

    public void reportGPA() {
        System.out.println(currentGPA);
    }
}

