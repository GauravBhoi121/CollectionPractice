/*Question 5 – First Non-Repeated Character Using Map
Statement:
Given a string containing uppercase, lowercase, spaces and special characters, use a Map to find the first non-repeated alphabetic character. The comparison should be case-insensitive.
Explanation:
•	Convert the string to lowercase. 
•	Ignore spaces and special characters. 
•	Store character frequency using Map<Character, Integer>. 
•	Traverse the original processed characters again. 
•	Find the first character whose frequency is exactly 1. 
Input:
"Swiss Programming"
Output:
First Non-Repeated Character = w    */
import java.util.*;
class MapProg5
{
   public static void main(String args[])
   {
        Scanner sc=new Scanner(System.in);
		String s="Swiss Programming";
		
		String ss[]=s.toLowerCase().split(" ");
		Map<Character,Integer> map=new LinkedHashMap<Character,Integer>();
		for(String j:ss)
		{
			for(int i=0;i<j.length();i++)
			{
				int count =1;
				if(map.containsKey(j.charAt(i)))
				{
					count =map.get(j.charAt(i));
					count ++;
				}
				map.put(j.charAt(i),count);
			}
		}
		
		//Set<Map.Entry<Character,Integer>> set=map.entrySet();
		map.forEach((k,v)->System.out.println(k+"\t"+v));
		System.out.println("the first count is the ");
		for(Map.Entry<Character,Integer> set:map.entrySet())
		{
			if(set.getValue()==1)
			{
				System.out.println(set.getKey()+"\t"+set.getValue());
				break;
			}
		}
	}
}