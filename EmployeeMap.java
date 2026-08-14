import java.util.*;
class Employee
{
    private int id;
    private String name;
    private int salary;
 
   public Employee(int id, String name,int salary)
   {
       this.id=id;
       this.name=name;
       this.salary=salary;
   }
   public Employee(){}
   public int getId()
   {
      return id;
   }
   public String getName()
   {
      return name;
   }
   public int getSalary()
   {
      return salary;
   }

}
class EmployeeMap
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        
        Employee e=new Employee();
        Map<String,HashMap<Integer,Employee>> map=new HashMap<String,HashMap<Integer,Employee>>();
     
        HashMap<Integer,Employee> he=new HashMap<Integer,Employee>();
        he.put(1,new Employee(1,"Gaurav",200000));
        he.put(2,new Employee(1,"Nishant",400000));
        he.put(3,new Employee(1,"Rushab",300000));
        he.put(4,new Employee(1,"Raj",450000));
         
        map.put("IT",he);

        HashMap<Integer,Employee> he1=new HashMap<Integer,Employee>();
        he1.put(1,new Employee(1,"Gaurav",200000));
        he1.put(2,new Employee(1,"Nishant",400000));
        he1.put(3,new Employee(1,"Rushab",300000));
        he1.put(4,new Employee(1,"Raj",450000));

        map.put("CIVIL",he1);

        HashMap<Integer,Employee> he2=new HashMap<Integer,Employee>();
        he2.put(1,new Employee(1,"Gaurav",200000));
        he2.put(2,new Employee(1,"Nishant",400000));
        he2.put(3,new Employee(1,"Rushab",300000));
        he2.put(4,new Employee(1,"Raj",450000));

        map.put("MECHANICAL",he2);
    
       Set<Map.Entry<String,HashMap<Integer,Employee>>>  set=map.entrySet();
       for(Map.Entry<String,HashMap<Integer,Employee>>  data : set)
       { 
            System.out.println("Deparment  = "+data.getKey());
            HashMap<Integer,Employee> edata=data.getValue();
            Set<Map.Entry<Integer,Employee>> ss=edata.entrySet();
            for(Map.Entry<Integer,Employee> s: ss)
            {
                 System.out.println("Employee data Id"+s.getKey());
                 System.out.println(s.getValue().getId()+"\t"+s.getValue().getName()+"\t"+s.getValue().getSalary());
            }
            System.out.println("=========================================================================");
       }
       
    }
}

     