//75. Implement string compression (Example: aaabbcc → a3b2c2).
import java.util.*;
class Compression
{
     public static String Comp(String s)
     {
         if(s.equals(""))
         {   return s;
         }
         String result="";
         
         char c[]=s.toCharArray();
         for(int i=0;i<c.length;i++)
         {
             int count =1;
           for(int j=i+1;j<c.length;j++)
           {
               if(c[i]==c[j])
               {
                     count++; 
                     c[j]='-';}
            }
            if(c[i]!='-'){result=result+c[i]+count;}
         }
         return result;
                     
                     
     }
     public static void main(String args[])
     {
         Scanner sc=new Scanner(System.in);
         String s="aaabbbccc";
         System.out.println(Comp(s));
     }
}