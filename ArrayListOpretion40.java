/*
Q39.Problem Statement
 Write a Java program to store strings in ArrayList and count total characters of all strings.
Input:
 ["Java","Code","Hi"]
Output:
 Total Characters: 10       */
import java.util.*;
class ArrayListOpretion40
{
   public static void main(String args[])
   {
      Scanner sc=new Scanner(System.in);
       
        List<String> al=new ArrayList<String>(List.of("Java","Code","Hi"));
        int sum=0;
        for(String s:al)
        {
            sum+=s.length();
        }
       System.out.println(sum);
     
   }
}