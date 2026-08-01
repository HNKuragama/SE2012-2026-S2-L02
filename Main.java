import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        //int option;
        while(true)
        {
            System.out.println("------MENU------\n");
            System.out.println("1 : Add student");
            System.out.println("2 : List All Students");
            System.out.println("3 : Search Student by IDt");
            System.out.println("4 : Sort Students by Name");
            System.out.println("5 : Quit");

            int stId;
            String stName;
            int option = input.nextInt();

            switch (option)
            {
                case 1:
                    System.out.println("Enter student id :");
                    stId = input.nextInt();  
                    input.nextLine();                 

                    System.out.println("Enter student name :");
                    stName = input.nextLine();

                    Student student1 = new Student(stId, stName);
                    System.out.println(student1.getName());

                    break;

                case 2:

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