/*
3. Find the Second Largest Element
Difficulty: Medium
Problem Statement
Given an ArrayList<Integer>, find the second largest unique element. If it does not exist, print an appropriate message.
Example
Input:
[12, 45, 67, 45, 89, 89]
Output:
67
                    */
import java.util.*;
class FindSecondlastInArrayList
{
     public static void main(String args[])
     {
         Scanner sc=new Scanner(System.in);
         ArrayList<Integer> li=new ArrayList<Integer>();
         int Max=0;
         int secMax=0;
         li.add(10);
         li.add(20);
         li.add(20);
         li.add(40);
         for(int i=0;i<li.size();i++)
         {
             if(li.get(i)>Max)
             {
                secMax=Max;
                Max=li.get(i);
             }
             else if(li.get(i)>secMax)
             {
                 secMax=li.get(i);
             }
         }     
         System.out.println(secMax);
         //System.out.println();

     }
}