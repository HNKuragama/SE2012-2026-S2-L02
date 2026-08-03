package services;

import models.Student;

public class EnrollmentManager
{
	public void SearchStudent(Student[] students, int count, String stSearchId)
	{
		for(int i = 0; i < count; i++)
                {                        
                        if(students[i].getId().equalsIgnoreCase(stSearchId))
                        {
                            System.out.println(stSearchId + " - " + students[i].getName() + "\n");
                            break;
                        }
                        else
                        {
                            if(i == count-1)
                            {
                                System.out.println("Student not found with id " + stSearchId);
                            }                            
                        }                            
                }               
	}
	
	public void SortStudents(int count, Student[] students)
	{
		for(int i = 0; i < count-1; i++)                      //Sorting students
                    {
                        if(students[i].getName().compareToIgnoreCase(students[i+1].getName()) > 0)
                        {
                            Student temp = students[i];
                            students[i] = students[i+1];
                            students[i+1] = temp;
                            if((i-1) >= 0)
                            {
                                if(students[i-1].getName().compareToIgnoreCase(students[i].getName()) > 0)
                                {
                                    temp = students[i-1];
                                    students[i-1] = students[i];
                                    students[i] = temp;
                                }
                            }
                        }
                        
                    }
                    for(int i = 0; i < count; i++)
                    {
                        System.out.println(students[i].getId() + " - " + students[i].getName());                       
                    }
	}
}