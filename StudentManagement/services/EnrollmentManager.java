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
}