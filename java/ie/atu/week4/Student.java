package ie.atu.week4;

public class Student
{
    private String studentName;
    private String studentEmail;
    private String studentCourse;

    public Student(String name, String email, String course)
    {
        //Constructor to add info to object
        this.studentName = name;
        this.studentEmail = email;
        this.studentCourse = course;
    }

    //Getter for student info
    public void getInfo()
    {
        System.out.println("Student info, Name: " + studentName + " Email: " + studentEmail + " Course: " + studentCourse);
    }

    public String getEmail()
    {
        return studentEmail;
    }
}
