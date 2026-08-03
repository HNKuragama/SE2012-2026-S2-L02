package mainapp;

import java.util.Scanner;
import models.Student;
import models.Course;
import services.EnrollmentManager;

public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
	EnrollmentManager manager = new EnrollmentManager();
        Student[] students = new Student[50];
        int count = 0;
        String stSearchId;

        //int option;
        while(true)
        {
            System.out.println("------MENU------\n");
            System.out.println("1 : Add student");
            System.out.println("2 : List All Students");
            System.out.println("3 : Search Student by ID");
            System.out.println("4 : Sort Students by Name");
            System.out.println("5 : Quit");

            String stuId;
            String stuName;
            int option = input.nextInt();  
            input.nextLine();            

            switch (option)
            {
                case 1:
                    System.out.println("Enter student id :");
                    stuId = input.nextLine();                                     

                    System.out.println("Enter student name :");
                    stuName = input.nextLine();                                    

                    students[count] = new Student(stuId, stuName);
                    System.out.println(students[count].getName());
                    System.out.println(students[count].getId());
                    count++;

                    break;

                case 2:
                    for(int i = 0; i < count; i++)                      //Listing students
                    {
                        System.out.println(students[i].getId() + " - " + students[i].getName());                       
                    }
                    break;

                case 3:
                    System.out.println("Enter student id :");           //Searching students
                    stSearchId = input.nextLine();
                     
                    manager.SearchStudent(students, count, stSearchId);    
                    break;

                case 4:
                    manager.SortStudents(count, students);
                    break;

                case 5:
                    return;

                default:
                    System.out.println("Enter a valid option!\n");
                    break;
                    
            }
            
        }        
    }
}