/*Q4. Question Statement
Write a Java program to store integer array elements in an ArrayList and find the maximum element.
Description
Store elements
Compare and find max
Input
Array: 5 8 2 10 3
Output
Maximum: 10        */
import java.util.*;
class ArrayOpretion4
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in); 
        Integer a[]=new Integer[]{1,2,3,4,2,3,4,5};
        ArrayList<Integer> al=new ArrayList<>();
        int max=0;
        Collections.addAll(al,a);
        for(Integer i: al)
        {
            if(i> max)
                max=i;
        }
       System.out.println(max);
           
    }
}