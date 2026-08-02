/*
Q21.Design a Java program to manage student records using a Vector collection and a 
POJO class Student. The program should allow the user to store and manage student 
details and perform multiple logical operations on the stored data. 
Description 
Create a POJO class Student with fields: 
 int id 
 String name 
 double marks 
 String course 
Use a Vector<Student> to store student objects. 
Operations to Perform (5 operations) 
1. Add Student records 
2. Display all students 
3. Search student by ID 
4. Find student with highest marks 
5. Count students enrolled in a particular course 
Input Example 
Enter number of students: 
3 
 
Enter Student Details: 
101 Amit 78 Java 
102 Neha 88 Python 
103 Rahul 92 Java 
 
Enter ID to search: 
102 
 
Enter course name: 
Java 
Output Example 
Student List: 
101 Amit 78 Java 
102 Neha 88 Python 
103 Rahul 92 Java 
Search Result: 
102 Neha 88 Python 
Highest Marks Student: 
103 Rahul 92 Java 
Total students in Java course: 2 
                                 */
import java.util.*;
class StudentRecord
{
  private int id; ;
  private String name ;
  private double marks ;
  private String course;
 
       public StudentRecord()
       {}
      public StudentRecord(int id,String name,double marks,String course)
      {
          this.marks=marks;
          this.name=name;
          this.id=id;
          this.course=course;
      }
      public String getName()
      {
          return name;
      }
      public int getId()
      {
            return id;
      }
      public double getMarks()
      {
          return marks;
      }
      public String getCourse()
      {
         return course;
      }
         
}
class StudentApp
{
   public static void main(String args[])
   {
         Scanner sc=new Scanner(System.in);
         StudentRecord sr=new StudentRecord();
         Vector v=new Vector();
      
       do{
                System.out.println("1. Add Student records ");
                System.out.println("2. Display all students ");
                System.out.println("3. Search student by ID");
                System.out.println("4. Find student with highest marks");
                System.out.println("5. Count students enrolled in a particular course");
                System.out.println("");

         }while(true);
         
   }
}