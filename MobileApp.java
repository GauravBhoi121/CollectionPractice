import java.util.*;
class Mobile
{
     private int Id;
     private String Brand;
     private int Quantity;
     public Mobile()
     {
     }
     public Mobile(String Brand,int Id,int Quantity)
     {
       this.Quantity=Quantity;
       this. Id=Id;
       this. Brand=Brand;
     }
     public String getBrand()
     {
          return Brand;
     }
     public int getId()
     {
          return Id;
     }
     public int getQuantity ()
     {
          return Quantity;
     }
}    
class MobileApp
{
    public static void main(String args[]) 
    {
         Scanner sc=new Scanner(System.in);
         Vector v=new Vector();
         Mobile m=new Mobile();
         v.add(new Mobile("Samsung",1,8));
         v.add(new Mobile("Realme",3,8));
         v.add(new Mobile("jio",4,29));
         v.add(new Mobile("Infinix",5,43));
        
       System.out.println("Less Quantity Mbile List ");
         for(Object ob: v) 
         {
            m=(Mobile)ob;
            if(m.getQuantity()<10)
            {
               System.out.println(m.getBrand()+"  "+m.getId()+"  "+m.getQuantity());
            }
        }
    }
}