//72. Implement your own version of `String.compareTo()`
import java.util.*;
class StringComperTo
{
     public static int toComper(String s,String s2)
     {
         if(s.length()-s2.length()==0)
         {
           for(int i=0;i<s.length();i++)      
           {
              if(s.charAt(i)!=s2.charAt(i))
              {
                  return (s.charAt(i)-s2.charAt(i));
              }
            }
          }
           return s.length()-s2.length();
     }
     public static void main(String asgs[])
     {
         Scanner sc=new Scanner(System.in);
         String s="javaa";
         String s2="javaab";
         System.out.println(toComper(s,s2));
     }
}