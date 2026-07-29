//69. Convert camelCase into a normal sentence
import java.util.*;
class CamelToNormal
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s="javaIsAProgrammingLanguage";
        String s2="";
        for(int i=0;i<s.length();i++)
        {
            if(Character.isUpperCase(s.charAt(i)))
            {
              s2+=" "+s.charAt(i);
            }
            else
            {
               s2+=s.charAt(i);
            }
        }
        System.out.println(s2);
   }
}