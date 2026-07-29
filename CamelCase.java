import java.util.*;
class CamelCase
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s="Java is programing language to users ";
        String s2[]=s.split(" ");
        
        String s3="";
        s3=s2[0].toLowerCase();
        System.out.println(""+s3); 
        for(int i=1;i<s2.length;i++)
        {
             
            for(int j=0;j<s2[i].length();j++)
            {
                if(j==0)
                {
                    s3+=Character.toUpperCase(s2[i].charAt(j));
                }
                else{
                s3+=Character.toLowerCase(s2[i].charAt(j)); }
            }
        }
        System.out.println(""+s3);
     }
}
                
