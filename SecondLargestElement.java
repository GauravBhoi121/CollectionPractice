import java.util.*;
class SecondLargestElement
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        List<Integer>l=new ArrayList<>();
        int max=0;
        int secmax=0;
       
        l.add(50);
        l.add(10);
        l.add(50);
        l.add(50);
        l.add(50);
        l.add(50);
       
        for(int obj: l)
        {
             if(obj>max)
             {
                 secmax=max;
                 max=obj;
             }
             else if(obj >secmax && obj< max)
             {
                      secmax=obj;
              }
        }
          System.out.println(secmax+" Max "+max );
    }
}