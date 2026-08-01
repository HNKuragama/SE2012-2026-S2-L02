import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        Student[] students = new Student[50];
        int count = 0;

        //int option;
        while(true)
        {
            System.out.println("------MENU------\n");
            System.out.println("1 : Add student");
            System.out.println("2 : List All Students");
            System.out.println("3 : Search Student by IDt");
            System.out.println("4 : Sort Students by Name");
            System.out.println("5 : Quit");

            int stuId;
            String stuName;
            int option = input.nextInt();

            switch (option)
            {
                case 1:
                    System.out.println("Enter student id :");
                    stuId = input.nextInt();  
                    input.nextLine();                 

                    System.out.println("Enter student name :");
                    stuName = input.nextLine();

                    students[count] = new Student(stuId, stuName);
                    System.out.println(students[count].getName());
                    count++;

                    break;

                case 2:
                    for(int i = 0; i < count; i++)
                    {
                            System.out.println(students[i].stId + "-" + students[i].stName + "\n");                       
                    }
                    break;

                case 3:

                    break;

                case 4:

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