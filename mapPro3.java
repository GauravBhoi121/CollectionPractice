/*Q3. Count Character Frequency
Question
Write a Java program to count how many times each character occurs in a String using a HashMap.
Explanation
Store each character as a key and its occurrence count as the value.
Input  banana  
Output
b = 1
a = 3
n = 2      */
import java.util.*;
class mapPro3
{
     public static void main(String arsg[])
     {
         Scanner sc=new Scanner(System.in);
          HashMap<Character,Integer> map=new HashMap<Character,Integer>();
		  String s="banana";
		 
		  for(int i=0;i<s.length();i++)
		  {
			    int count =1;
			 if(map.containsKey(s.charAt(i)))
             {
                count =map.get(s.charAt(i));
                count ++;
			 }	
             map.put(s.charAt(i),count);			 
		  }
		  System.out.println(map);
     }
}