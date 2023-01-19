/*output should be index where needle is present 
 * "sad" occurs at index 0 and 6.
The first occurrence is at index 0, so we return 0.
*/
public class FindOccurrence 
{
public static void main(String[] args) 
{
System.out.println(strStr("hello", "ll"));
}
static int strStr(String haystack, String needle) 
{
// String[] check = haystack.split(" ");

// for (int i = 0; i < check.length; i++) 
// {
//  if (check[i].contains(needle)) 
//  {
//   return i;   
//  }    
// } 
 return haystack.indexOf(needle);
}    
}
