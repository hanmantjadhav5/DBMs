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

    public void DisplaySpecific(int Value)
    {
        for (Student sref : lobj) 
        {
            if(sref.Rollno == Value)
            {
                sref.Display();
                break;
            }  
        }
    }

    public void DisplaySpecific(String str)
    {
        for (Student sref : lobj) 
        {
            if(str.equals(sref.Sname))
            {
                sref.Display();
                break;
            }
        }
    }

    public void Delete(int no)
    {
        if(sref.Rollno == no)
        {
            lobj.remove(index);
            break;
        }
        index++;
    }

    public void DeleteByName(int no)
    {
        if(sref.equals(sref,Sname))
        {
            lobj.remove(index);
            break;
        }
        index++;
    }

    public void Sum()
    {
        int iSum = 0;

        for(Student sref : lobj)
        {
            iSum = iSum + (sref.Marks);
        }
        System.out.println("Summation of marks : "+ iSum);
    }

    public void Max()
    {
        int iMax = 0;

        for(Student sref : lobj)
        {
            if(iMax < sref : lobj)
            {
                iMax = sref.Marks;
            }
        }
        System.out.println("Maximum marks are : "+ iSum);
    }

    public void Avg()
    {
        int iMax = 0;

        for(Student sref : lobj)
        {
            if(iMax < sref : lobj)
            {
                iMax = sref.Marks;
            }
        }
        System.out.println("Maximum marks are : "+ iSum);
    }
}

class Program497
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

        dobj.Delete(3);

        dobj.Sum();

        dobj.DisplayAll();
    }
}