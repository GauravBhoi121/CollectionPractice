/*
Q22.Problem Statement 
Create a Java program to manage employee salary details using Vector and POJO class 
Employee. The program must perform logical operations related to employee salary 
analysis. 
Description 
Employee fields: 
● int empId 
● String name 
● double salary 
● String department 
Store objects in Vector. 
Operations 
1. Add employees 
2. Display employees 
3. Find employee with lowest salary 
4. Calculate total salary of all employees 
5. Display employees of a specific department 
Input 
Enter number of employees: 
3 
Enter details: 
1 Raj 45000 IT 
2 Simran 52000 HR 
3 Kunal 39000 IT 
Enter department: 
IT 
Output 
Employee List: 
1 Raj 45000 IT 
2 Simran 52000 HR 
3 Kunal 39000 IT 
Lowest Salary: 
3 Kunal 39000 IT 
Total Salary = 136000 
IT Department Employees: 
Raj 
Kunal 
*/import java.util.*;
class Employee
{
     private int Id;
     private double Salary;
     private String Name;
     private String Department;
     
     public Employee(){}
    
     public Employee(int Id,String Name,String Department,double Salary)
     {
          this.Id=Id;
          this.Name=Name;
          this.Department=Department;
          this.Salary=Salary; 
     }
    
     public int getId()
     {
       return Id;
     }
     public double getSalary()
     {
       return Salary;
     }
     public String getName()
     {
       return Name;
     }
     public String getDepartment()
     {
       return Department;
     }
}
class EmployeeVectorApp
{
    public static void main(String args[])
    {
         Scanner sc=new Scanner(System.in);

        Vector v=new Vector();
        Employee e=new Employee();
        
        do{
           System.out.println("1. Add employees"); 
           System.out.println("2. Display employees"); 
           System.out.println("3. Find employee with lowest salary");
           System.out.println("4. Calculate total salary of all employees");
           System.out.println("5. Display employees of a specific department ");
          
          int choice =sc.nextInt();
          switch(choice)
          {
              case 1:
                       System.out.println(" Id  NAME  SALARY  DEPARTMENT");
                       int id=sc.nextInt();
                       sc.nextLine();
                       String name=sc.nextLine();
                       double salary=sc.nextDouble();
                       sc.nextLine();
                       String department=sc.nextLine();
                       v.add(new Employee(id,name,department,salary));           
                       break;
              case 2:
                       for(Object ob: v)
                       {    
                            e=(Employee)ob;
                            System.out.println(e.getName()+"\t"+e.getId()+"\t "+e.getDepartment()+"\t "+e.getSalary());
                       }
                       break;
              case 3:
                       System.out.println("Lowest Salary Employee is ");
                       double min=Integer.MAX_VALUE; 
                       int i=0;
                       for(Object ob: v )
                       {    
                            e=(Employee)ob;
                           if(e.getSalary()>min)
                           {
                             min=e.getSalary();
                           }
                           if(i==v.size()-1)
                           {
                                System.out.println(e.getName()+"\t"+e.getId()+"\t "+e.getDepartment()+"\t "+e.getSalary());
                           }
                            i++;
                       }
                       break;
              case 4:
                       System.out.println("Lowest Salary Employee is ");
                       double sum=0;
                       for(Object ob: v)
                       {    
                             e=(Employee)ob;
                             sum+=e.getSalary();
                            
                       }
                       System.out.println("total Salary = "+sum);
                       break;
              case 5:
                       System.out.println("Enter the Name Department ");
                       sc.nextLine();
                       String dname=sc.nextLine();
                       for(Object ob: v)
                       {
                           e=(Employee)ob;
                        if(e.getDepartment().equals(dname))
                        {
                                System.out.println(e.getName()+"\t"+e.getId()+"\t "+e.getDepartment()+"\t "+e.getSalary());                          
 
                        }
                       }
                       break;
              default:
                       System.out.println("wrong choice ");
          }
          }while(true);

    }
}
  
     