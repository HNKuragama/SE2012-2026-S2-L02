public class Student
{
    private  int stId;
    private  String stName;

    public Student(int stId, String stName)
    {
        this.stId = stId;
        this.stName = stName;
    }

    public String getName()
    {
        return stName;
    }
}