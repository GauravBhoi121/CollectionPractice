import java.util.*;
class ajjapp
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s="gffg";
        int count =0;
        for(int i=0;i<s.length();i++)
        {
              String ss="";
             for(int j=i;j<s.length();j++)
             {
                  ss+=s.charAt(j);
                  if(ss.length()>1)
                   {
                        count ++;
                        System.out.println("count "+ss);
                   }
              }
         }
        System.out.println(s.length()+"count "+count);
                 
    } 
}