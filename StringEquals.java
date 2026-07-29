//71. Implement your own version of `String.equals()`.
import java.util.*;
class StringEquals
{
     public static boolean equalsOf(String s,String s2)
     { 
         if(s.length()!=s2.length())
          {
             return false;
          }
          for(int i=0;i<s.length();i++)
          {
            if(s.charAt(i)!=s2.charAt(i))
            {
              return false;
            }
          }
         return true;
     }
     public static void main (String arsg[])
     {
            Scanner sc=new Scanner(System.in);
            String s="java";
            String s2="java";
            if(equalsOf(s,s2))
            {
                 System.out.println("Equals");
            }
            else
            {
              System.out.println("Not Equals");
            }
     }
}