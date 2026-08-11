/* Q3. Question Statement
Write a Java program to store array elements into an ArrayList and display them in reverse order.
Description
Store array in ArrayList
Traverse in reverse
Input
Array: 10 20 30 40
Output
Reversed List: [40, 30, 20, 10]   */
import java.util.*;
class ArrayOpretion3
{
    public static void main(String args[])
    {
       Scanner sc=new Scanner(System.in);
       Integer a[]=new Integer[]{1,2,3,4,5,6,7};
       ArrayList<Integer> al=new ArrayList<Integer>();
       Collections.addAll(al,a);
       int first=0;
       int last=al.size()-1;
       while(first<=last)
       {
          int temp=al.get(first);
          al.set(first,al.get(last));
          al.set(last,temp);
          first++;
          last --;
       }
       System.out.println(al);
    }
}