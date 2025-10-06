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
        while(0 < count)
        {
            System.out.println("Please enter your name: ");
            String nameTemp = scan1.nextLine();
            System.out.println("Please enter your email: ");
            String emailTemp = scan1.nextLine();
            System.out.println("Please enter your course: ");
            String courseTemp = scan1.nextLine();

            Student studentTemp = new Student(nameTemp,emailTemp,courseTemp);

            studentTemp.getInfo();
            System.out.println("Name: " + nameTemp + ", Email: " + emailTemp + ", Course: " + courseTemp);

            count--;
        }


    }
}


