/*Q5. Question Statement
Write a Java program to store string array elements into an ArrayList and display only names starting with a vowel.
Description
Check first character
Store vowel-based strings
Input
["Anil", "Sunil", "Om", "Ravi", "Umesh"]
Output
[Vowel Names]: [Anil, Om, Umesh]    */
import java.util.*;
class ArrayListOpretion5
{
     public static void main(String args[])
     {
           Scanner sc=new Scanner(System.in);
           String a[]=new String []{"Anil", "Sunil", "Om", "Ravi", "Umesh"};
       
           ArrayList<String> al=new ArrayList<String>();
           for(String s: a)
           {
               if(s.charAt(0)=='A'|| s.charAt(0)=='U' || s.charAt(0)=='O'||s.charAt(0)=='I'||s.charAt(0)=='E')
               {
                  al.add(s);
               }
           }
           al.forEach((x)->System.out.println(x));
     }
}