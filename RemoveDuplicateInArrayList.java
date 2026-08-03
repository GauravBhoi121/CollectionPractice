/*1. Remove Duplicates from an ArrayList
Difficulty: Easy
Problem Statement
Given an ArrayList<Integer> containing duplicate elements, remove all duplicate values while preserving the order of their first occurrence.
Example
Input:
[10, 20, 10, 30, 20, 40]

Output:
[10, 20, 30, 40]
                     */
import java.util.*;
class RemoveDuplicateInArrayList
{
     public static void main(String args[])
     {
          Scanner sc=new Scanner(System.in);
          ArrayList li=new ArrayList();
          li.add(10);
          li.add(20);
          li.add(10);
          li.add(30);
          li.add(20);
          li.add(30);
          li.add(10);
          li.add(20);
          li.add(10);
          li.add(30);
          li.add(20);
          li.add(30);
         
         for(int i=0;i<li.size();i++)
         {
             for(int j=i+1;j<li.size();j++)
             {
                if(li.get(i)==li.get(j))
                {
                     li.remove(j);
                     --j;
                }
             }
                 
         }     
         System.out.println(li); 
        
     }
}  