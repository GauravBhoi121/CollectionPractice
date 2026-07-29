//Convert a sentence into snake_case.
import java.util.*;
class ConvertToSnakeCase
{
     public static void main(String args[])
     {
          Scanner sc=new Scanner(System.in);
          String s="java Programming language";
          
          String s2="";
          for(int i=0;i<s.length();i++)
          {
               if(s.charAt(i)==' ')
               {
                  s2+='_';
               }
               else
               {
                 s2+=Character.toLowerCase(s.charAt(i));
               }
          }
          System.out.println(s2);
     }
}