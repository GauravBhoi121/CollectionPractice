import java.util.*;
class Customer
{
     private int Id;
     private String Name;
     private int Age;
     public Customer()
     {
     }
     public Customer(String Name,int Id,int Age)
     {
       this.Id=Id;
       this. Age=Age;
       this. Name=Name;
     }
     public String getName()
     {
          return Name;
     }
     public int getId()
     {
          return Id;
     }
     public int getAge()
     {
          return Age;
     }
}    
class CostomerApp
{
    public static void main(String args[]) 
    {
         Scanner sc=new Scanner(System.in);
         Vector v=new Vector();
         Customer c=new Customer();
         v.add(new Customer("abc",1,15));
         v.add(new Customer("bac",3,18));
         v.add(new Customer("hgds",4,29));
         v.add(new Customer("sjdk",5,43));
        
         for(Object ob: v) 
         {
            c=(Customer)ob;
            if(c.getAge()>=18)
            {
               System.out.println(c.getName()+"  "+c.getId()+"  "+c.getAge());
            }
        }
    }
}