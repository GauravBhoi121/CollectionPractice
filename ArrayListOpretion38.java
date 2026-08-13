/*
Q38.Problem Statement
 Write a Java program to replace spaces from all strings in ArrayList with '-'.
Input:
 ["Java Program","Array List"]
Output:
 ["Java-Program","Array-List"]     */
import java.util.*;
class ArrayListOpretion38
{
     public static void main(String args[])
     {
         Scanner sc=new Scanner(System.in);
         
         String a[]=new String[]{"Java Program","Array List"};
         ArrayList<String> al=new ArrayList<String>();
       
         for(String s:a)
         {
            String ss="";
            for(int i=0;i<s.length();i++)
            {
               if(s.charAt(i)==' ')
               {
                  ss+='-';
               }else
               {
                 ss+=s.charAt(i);
               }
            }
            al.add(ss);
         }
         al.forEach((k)->System.out.println(""+k));
     }
}