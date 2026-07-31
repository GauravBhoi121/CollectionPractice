import java.util.*;
class Studentp
{
     private String marks;
     private String name;
     private String roll;
public Studentp()
{}
     public Studentp(String name,String marks,String roll)
     {
         this.marks=marks;
         this.name=name;
         this.roll=roll;
     }
     public String getRoll()
     {
        return roll;
     }
     public String getName()
     {
         return name;
     }
     public String getMarks()
     {
         return marks;
     } 
}
class StudentVector
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        Vector v=new Vector();
        Studentp p=new Studentp();
        //sc.nextLine();
        for(int i=0;i<5;i++)
        {

           System.out.println("Name Marks Roll");
           v.add(new Studentp(sc.nextLine(),sc.nextLine(),sc.nextLine()));
        }
           for(Object o:v)
           {
               p=(Studentp)o;
               int marks=Integer.parseInt(p.getMarks());
               if(marks>60)
                   System.out.println(p.getMarks()+" "+p.getName()+"  "+p.getRoll());
           }
     }
}


















      