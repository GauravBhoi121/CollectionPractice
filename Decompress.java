//76. Decompress a compressed string.
class Decompress 
{
      public static void main(String args[])
      {
          String s="a3b4c4";
          String s2="";
          int n=s.charAt(1)-'0';
          for(int i=0;i<s.length();)
          {
             for(int j=0;j<(s.charAt(i+1)-'0');j++)
             {
                   s2+=s.charAt(i);
             }
             i+=2;
          }
          System.out.println(s2);
          
      }
}