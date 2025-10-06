package ie.atu.week4;

public class Student
{
    private String studentName;
    private String studentEmail;
    private String studentCourse;

    public Student(String name, String email, String course)
    {
        this.studentName = name;
        this.studentEmail = email;
        this.studentCourse = course;
    }

    //TODO Add getters and setters

    public void getInfo()
    {
        System.out.println("Student info, Name: " + studentName + " Email: " + studentEmail + " Course: " + studentCourse);
    }


}
