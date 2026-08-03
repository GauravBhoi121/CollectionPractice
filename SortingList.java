/*
2. Merge Two Sorted ArrayLists
Difficulty: Easy–Medium
Problem Statement
Given two sorted ArrayList<Integer> objects, merge them into a single sorted ArrayList without using any built-in sorting method.
Example
Input:
List1 = [1, 3, 5]
List2 = [2, 4, 6]

Output:
[1, 2, 3, 4, 5, 6]      */
import java.util.*;
class SortingList
{
     public static void main(String args[])
     {
          Scanner sc=new Scanner(System.in);
          ArrayList<Integer> li =new ArrayList<Integer>();
          li.add(1);
          li.add(4);
          li.add(6);
          ArrayList<Integer> li2 =new ArrayList<Integer>();
          li2.add(5);
          li2.add(2);
          li2.add(3);
          
          li.addAll(li2);
          System.out.println(li);
         
          for(int i=0;i<li.size();i++)
          {
             for(int j=0;j<li.size();j++)
             {
                if(li.get(i)<li.get(j))
                {
                   int temp=li.get(i);
                   li.set(i,li.get(j));
                   li.set(j,temp);
                }
             }
          }
          System.out.println(li);
     }
}