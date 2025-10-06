// Paul Daly
// OOP Week 4
// Student class to store student details using arrayList
package ie.atu.week4;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentApp {
    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<>(); //Creates the arrayList 'students'
        Scanner scan1 = new Scanner(System.in);



        System.out.println("How many students do you want to enter details for? ");
        int count = scan1.nextInt(); //Saves number of students as an int for later

        scan1.nextLine(); //Fixes nextInt issue of skipping next scanner method call

        //Student details section
        int i = 0; //Counter to compare to student number
        while(i < count)
        {
            System.out.println("Please enter your name: ");
            String nameTemp = scan1.nextLine();
            System.out.println("Please enter your email: ");
            String emailTemp = scan1.nextLine();
            System.out.println("Please enter your course: ");
            String courseTemp = scan1.nextLine();

            //Creates a student object with a constructor, applying the temporary strings
            Student studentTemp = new Student(nameTemp,emailTemp,courseTemp);

            //Test line, gets the entered info
            //studentTemp.getInfo();

            //System.out.println("Name: " + nameTemp + ", Email: " + emailTemp + ", Course: " + courseTemp);
            students.add(studentTemp);

            i++;
        }

        //Print info on all students in array list
        System.out.println("Student List (" + count + " students): ");
        for (Student s : students)
        {
            s.getInfo(); //Runs the getter for each student, displaying info
        }
    }
}


