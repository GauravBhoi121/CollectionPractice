//using the Comperable Interface with comperto Methode 
import java.util.*;
class Student implements Comparable<Student>
{      
     private int id;
     private String name;
     private int fee;
  
    public Student()
    {}
    public Student(int id,String name, int fee)
    {
        this.fee=fee;
        this.name=name;
        this.id=id;
     
    }
    
    public int getId()
    {
        return id;
    }
    public String getName()
    {
        return name;
    }
    public int getFee()
    {
        return fee;
    }
    @Override
    public int compareTo(Student t)
    {
         if(this.fee>t.fee)
         {
           return 1;
         }
         else if(this.fee<t.fee)
         {
               return -1;
         }
         else{return 0;}
     
    }
           
}
class StudentComparebleApp
{
     public static void main(String args[])
     {
           Scanner sc=new Scanner(System.in);
           ArrayList<Student> list=new ArrayList<Student>();
           list.add(new Student(1,"ABC",40000));
           list.add(new Student(2,"BCA",50000));
           list.add(new Student(4,"MCA",10000));
           list.add(new Student(5,"MAB",5000));
           list.add(new Student(6,"MBA",60000));
         
           System.out.println("befor sorting the Student data ");
           for(Student t: list)
           {
                System.out.println(t.getId()+"\t"+t.getName()+"\t"+t.getFee());     
           }
           Collections.sort(list);
           System.out.println("After sorting the Student data ");
           for(Student t: list)
           {
                System.out.println(t.getId()+"\t"+t.getName()+"\t"+t.getFee());     
           }
        
   
           Collections.sort(list,(Student s,Student s1)->s.getId()>s1.getId() ? 1 : s.getId()<s1.getId() ? -1:0);
            System.out.println("After sorting Using Comparator the Student data ");
           for(Student t: list)
           {
                System.out.println(t.getId()+"\t"+t.getName()+"\t"+t.getFee());     
           }
        
          
     }
}