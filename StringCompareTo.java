/* 72. Implement your own version of `String.compareTo()`.
73. Implement your own version of `String.indexOf()`.
74. Implement your own version of `String.substring()`.
75. Implement string compression (Example: aaabbcc → a3b2c2).
76. Decompress a compressed string.
77. Implement Run Length Encoding (RLE).
78. Find all permutations of a string.
79. Find all combinations of characters in a string.
80. Find all subsequences of a string.  */
import java.util.*;
class StringCompareTo
{
      static int comperto(String s,String ss)
      {
             for(int i=0;i<s.length();i++)
             {
                  if(s.charAt(i)>ss.charAt(i))
                  {
                      return -1;
                  }
                  else if(s.charAt(i)<ss.charAt(i))
                  {
                     return 1;
                  }
              }
           return 0;
      }
      public static void main(String args[])
      {
          String s1="String";
          String s2="String";
          System.out.println(""+comperto(s1,s2));
      }
}