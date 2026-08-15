import java.util.*;
class Myjava
{
    public native int display(int a,int b);
    public static void main(String args[])
   { 
          Myjava obj=new Myjava();
           
          System.out.println(" "+obj.display(10,20));
        
   }
}