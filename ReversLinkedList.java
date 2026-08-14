/*
4. Reverse a LinkedList
Difficulty: Easy
Problem Statement
Given a LinkedList<Integer>, reverse the order of all elements without creating another LinkedList.
Example
Input: [10, 20, 30, 40]
Output: [40, 30, 20, 10]     */
import java.util.*;
class ReversLinkedList
{
    public static void main(String args[])
    {
          Scanner sc=new Scanner(System.in);
          
          LinkedList<Integer> li=new LinkedList<Integer>();
          li.add(10);
          li.add(20);
          li.add(30);
          li.add(40); 
          int first=0;
          int last=li.size()-1;
          while(first<last)
          {
              int temp=li.get(first);
              li.set(first,li.get(last));
              li.set(last,temp);
              first++;
              last--;
          }
          System.out.println(li);
          
    }
}