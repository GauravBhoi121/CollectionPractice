/*
Comparator
7.	Sort Employees Using Comparator
Create an Employee class and use Comparator to sort employees based on name alphabetically, without modifying the Employee class. 
8.	Multiple Comparators
Create an Employee class containing id, name, age, and salary. Write separate Comparators to sort employees by: 
o	Salary 
o	Age 
o	Name 
9.	Comparator with Tie-Breaking
Given a list of employees, sort them by salary in descending order. If two employees have the same salary, sort them by name alphabetically.   */
import java.util.*;
class Employee
{
   private String name;
   private int id;
   private int salary;
   
   public Employee()
   {
   }
    public Employee(int id,String name,int salary)
    {
        this.name=name;
        this.id=id;
        this.salary=salary;
    }
    public String getName()
    {
         return name;
    }
    public int getId() 
    {
       return id;
    }
    public int getSalary()
    {
        return salary;
    } 
}
class SortById implements Comparator<Employee>
{
    @Override
    public int compare(Employee e1,Employee e2)
    {
        if(e1.getId()>e2.getId())
        {
           return 1;
        }
        else if(e1.getId()>e2.getId())
        {
           return -1;
        }
        else
        {return 0;
        }
    }
}
class SortByName implements Comparator<Employee>
{
     //@Override
    public int compare(Employee e1,Employee e2)
    {
        if(e1.getName().compareTo(e2.getName())>0)
        {
           return 1;
        }
        else if(e1.getName().compareTo(e2.getName())<0)
        {
           return -1;
        }
        else
        {return 0;
        }
    }
}
class EComparableApp
{
      public static void main(String args[])
      {
          Employee ee=new Employee();
          ArrayList<Employee> al=new ArrayList<Employee>();
          al.add(new Employee(1,"A",50000));
          al.add(new Employee(5,"B",30000));
          al.add(new Employee(41,"C",202100));
          al.add(new Employee(2,"D",203400));
          al.add(new Employee(42,"FA",340000));
       
          System.out.println("befor sorting ");
          for(Employee e: al)
          {
                System.out.println(e.getId()+"\t"+e.getName()+"\t"+e.getSalary());
          } 
          SortById id=new SortById();
          Collections.sort(al,id);

          System.out.println("After sorting ");
          for(Employee e: al)
          {
                System.out.println(e.getId()+"\t"+e.getName()+"\t"+e.getSalary());
          }
      }
}
                         