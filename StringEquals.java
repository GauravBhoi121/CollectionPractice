/*71. Implement your own version of `String.equals()`.
72. Implement your own version of `String.compareTo()`.
73. Implement your own version of `String.indexOf()`.
74. Implement your own version of `String.substring()`.
75. Implement string compression (Example: aaabbcc → a3b2c2).
76. Decompress a compressed string.
77. Implement Run Length Encoding (RLE).
78. Find all permutations of a string.
79. Find all combinations of characters in a string.
80. Find all subsequences of a string.   */
import java.util.*;
class StringEquals
{
    static boolean toEqual(String s,String s2)
    {       
          if(s.length()==s2.length())
          {
             for(int i=0;i<s.length();i++)
             {
                 if(s.charAt(i)==s2.charAt(i))
                  {
                      continue;
                  }
                  else
                   {
                          return false;
                   }
              }
              return true;
             
          }
          return false;
      }
      public static void main(String args[])
      {
           String s1="GauravBhoi";
           String s2="GauravBhoi";
           Boolean r=toEqual(s1,s2);
           System.out.println(r);
      }
}    
