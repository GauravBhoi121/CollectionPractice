//74. Implement your own version of `String.substring()`.
import java.util.*;
class SubString
{

    public static String SubString(String s,int n)
    {
         if(s.length()<n)
         {
             return "Your String is small";
         }
         String result="";
         for(int i=n;i<s.length();i++)
         {
             result+=s.charAt(i);
         }
         return result;
    }
        
    public static void main(String args[])
    { 
         Scanner sc=new Scanner(System.in);
         
          String s="Hello Gaurav Bhoi";
         System.out.println(SubString(s,2));
    }
}