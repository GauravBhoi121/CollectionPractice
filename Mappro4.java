/*Question 4 – Group Strings by Length
Statement:
Given a List<String>, use a Map<Integer, List<String>> to group all strings according to their length. Strings having the same length must be stored together.
Explanation:
•	Traverse the list. 
•	Find the length of every string. 
•	Use string length as the Map key. 
•	Store all strings having that length inside a List. 
•	Display the groups in ascending order of length. 
Input:
["Java", "Python", "SQL", "Spring", "C", "HTML", "React", "Go", "Oracle"]
Output:
1 = [C]
2 = [Go]
3 = [SQL]
4 = [Java, HTML]
5 = [React]
6 = [Python, Spring, Oracle]*/
import java.util.*;
class MapPro4
{
   public static void main(String args[])
   {
       Scanner sc=new Scanner(System.in);
	   List<String> li=new ArrayList<String>();
	   li.add("Java");
	   li.add("Python");
	   li.add("SQL");
	   li.add("Spring");
	   li.add("C");
	   li.add("HTML");
	   li.add("React");
	   li.add("Go");
	   li.add("Oracle");
	   Map<Integer,List<String>>  map=new HashMap<Integer,List<String>>();
	   for(String i:li)
	   {
	        List<String> list=new ArrayList<String>();
	        for(String j:li)
			{
			     if(i.length()==j.length())
				 {
				    list.add(j);
				 }
			}
			map.put(i.length(),list);
		}
	   map.forEach((k,v)->System.out.println(k+""+v));
	}
}
							   