// Paul Daly
// OOP Week 4
// Student class to store student details using arrayList
package ie.atu.week4;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentApp {
    public static void main(String[] args) {

        ArrayList<String> students = new ArrayList<>(); //Creates the arrayList 'students'
        Scanner scan1 = new Scanner(System.in);

        System.out.println("Please enter the number of students: ");
        int count = scan1.nextInt(); //Saves number of students as an int for later

        scan1.nextLine(); //Fixes nextInt issue of skipping next scanner method call

        //Student details section
        while(0 < count)
        {
            System.out.print("Please enter your name: ");
            String nameTemp = scan1.nextLine();
            System.out.print("Please enter your email: ");
            String emailTemp = scan1.nextLine();
            System.out.print("Please enter your course: ");
            String courseTemp = scan1.nextLine();

            System.out.println("Name: " + nameTemp + ", Email: " + emailTemp + ", Course: " + courseTemp);
            count--;
        }


    }
}


