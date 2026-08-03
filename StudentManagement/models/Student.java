package models;

public class Student
{
    public  String stId;
    public  String stName;

    public Student(String stId, String stName)
    {
        this.stId = stId;
        this.stName = stName;
    }

    public String getName()
    {
        return stName;
    }    

    public String getId()
    {
        return stId;
    }
    
}