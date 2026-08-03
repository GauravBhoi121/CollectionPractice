/*
Q24.Problem Statement 
Create a library management program using Vector and Book POJO class. 
Description 
Fields: 
 int bookId 
 String title 
 String author 
 double price 
Operations 
1. Add books 
2. Display books 
3. Find costliest book 
4. Search by author 
5. Count total books 
Input 
Enter books: 
3 
 
Enter details: 
1 Java Herbert 650 
2 SQL Korth 550 
3 Python Mark 700 
 
Search author: 
Herbert 
Output 
Book List: 
Java Herbert 650 
SQL Korth 550 
Python Mark 700 
Costliest Book: 
Python 
Books by Herbert: 
Java 
Total books = 3 
                       */
import java.util.*;
class Book
{
     private int bookId;
     private String title;
     private String author;
     private double price;
     
     public Book(){}
     public Book(int bookId,String tital,String author,double price)
     {
          this.bookId=bookId;
          this.title=title;
          this.author=author;
          this.price=price;
     }
   
     public String getAuthor()
     {
           return author ;
     }
     public String getTitle()   
     {
            return title;
     }
     public int getBookId()
     {
         return bookId;
     }
     public double getPrice()
     {
         return price;
     }
}
class BookVectorApp
{
     public static void main(String args[])
     { 
          Scanner sc=new Scanner(System.in);
           Vector v=new Vector();
           Book b=new Book();
       do{
            System.out.println("1. Add Book");
            System.out.println("2. Display Books");
            System.out.println("3. Find costliest book ");
            System.out.println("4. Search by author");
            System.out.println("5. Count total books");
            
            System.out.println("Enter the choice ");
            int choice =sc.nextInt();

            switch (choice )
            {
                 case 1:
                            System.out.println("Id titale author price");
                           
                           
                           String author=sc.nextLine();
                           String title=sc.nextLine();
                           sc.nextLine();
                           int bookId=sc.nextInt();
                           double price=sc.nextDouble();
                       
                           
                           v.add(new Book(bookId,title,author,price));
                            break;
                 case 2:
                           for(Object ob: v)
                           {
                               b=(Book)ob;
                                  
 System.out.println("ID = "+b.getBookId()+"\t Title = "+b.getTitle()+"\t Pric e = "+b.getPrice()+"\t Author = "+b.getAuthor());
                           }
                            break;
                 case 3:
                            double Max=0;
                            int index=0;
                          
                            for(int i=0;i<v.size();i++)
                            {
                               if(b.getPrice()>Max)
                               {
                                   Max=b.getPrice();
                                   index=i;
                               }
                            }
                            System.out.println(v.indexOf(index));
                              
                            break;
                 case 5:
                            System.out.println("search by author ");
                            String auhtor =sc.nextLine();
                            for(Object ob: v)
                             {
                                 b=(Book)ob;
                                 if(auhtor.equals(b.getAuthor())){
                                     System.out.println(b.getBookId()+"\t"+b.getTitle()+"\t"+b.getPrice()+"\t"+b.getAuthor());
                                 }
                             }
                            break;
                 case 6:
                            System.out.println("Total Books is = "+v.size());
                       
                            break;
                 default:
                           System.out.println("Wrong choice ");
            }
            
         }while(true);
     }
}








