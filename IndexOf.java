//Implement your own version of `String.indexOf()`.
import java.util.*;
class IndexOf
{
    public static int ofIndex(String s,char c)
    { 
       for(int i=0;i<s.length();i++)
       {
          if(c==s.charAt(i))
               return i;
       }
       return -1;
    }
          
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println(ofIndex("gauravbhoi",'a'));
    }
}