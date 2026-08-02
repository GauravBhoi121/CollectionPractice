import java.util.*;
class Book
{
     private int Id;
     private String Name;
     private int Price;
     public Book()
     {}
     public Book(String Name,int Id,int Price)
     {
       this.Price=Price;
       this.Name=Name;
       this.Id=Id;
     }
     public String getName()
     {
        return Name;
     }
     public int getId()
     {
         return Id;
     }   
     public int getPrice()
     { 
        return Price;
     }
}
public class BookApp
{
       public static void main(String args[])
      {
           Scanner sc=new Scanner(System.in);
           Book b=new Book();
           Vector v=new Vector();
           v.add(new Book("java",1,200));
           v.add(new Book("python",2,300));
           v.add(new Book(".Net",3,300));
         
           int sum=0;
           for(Object ob: v)
           {
               b=(Book)ob;
               sum=sum+b.getPrice();
               System.out.println(b.getId()+" "+b.getName()+" "+b.getPrice());
           }   
          System.out.println("the same is the total price"+sum);
      }
}