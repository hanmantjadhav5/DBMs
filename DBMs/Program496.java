import java.util.*;

class Student
{
    public String Sname;
    public int Marks;
    public int Rollno;

    public static int Generator;

    static
    {
        Generator = 0;
    }

    public Student(String str, int no)
    {
        this.Sname = str;
        this.Marks = no;
        Generator++;
        this.Rollno = Generator;
    }

    public void Display()
    {
        Student ;
        for()
        {

        }
    } 
}

class DBMS
{
    public LinkedList <Student> lobj;

    public DBMS()
    {
        lobj = new LinkedList();
    }

    public void StartDBMS()
    {
        System.out.println("Marvellous Customised DBMS started succesfully...");
    }

    // All SQL queries should be implemented here

    public void Insert(String str, int no)
    {
        Student sob = new Student(str, no);

        lobj.add(sobj);

    }
}

class Program495
{
    public static void main(String Arg[])
    {
        DBMS dobj = new DBMS();

        dobj.StartDBMS();

        dobj.Insert("Kartik", 90);
        dobj.Insert("Rutuja ",96);
        dobj.Insert("ANKIT " ,47);
        dobj.Insert("Pooja ",45);
        dobj.Insert("Ram ",91);

        dobj.DisplayAll();
    }
}