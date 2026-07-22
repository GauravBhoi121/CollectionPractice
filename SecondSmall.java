import java.util.*;
class SecondSmall
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
 
         List<Integer> li=new ArrayList<>();


         li.add(19);
         li.add(20);
         li.add(19);
         li.add(20);
         int min=Integer.MAX_VALUE;
         int min2=0;
         for(int i: li)
         {
             if(i<min)
             {
                min2=min;
                min=i;
             }
             else if(i<min2 && i!=min)
             {    min2=i;
             }
         }
        System.out.println(min+""+min2);
    }
}