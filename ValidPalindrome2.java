/*Input: s = "abca"
Output: true
Explanation: You could delete the character 'c'. */
public class ValidPalindrome2 
{
public static void main(String[] args) 
{
 System.out.println(actualPalindrome("abca"));
}
static boolean actualPalindrome(String s)
{
 int start = 0; 
 int end = s.length()-1;

 while (start<=end) 
 {
  if (s.charAt(start) != s.charAt(end))
  {
    return actualPalindrome(s, start + 1, end) || actualPalindrome(s, start, end - 1);
  }     
  start++;
  end--;
 }
return true;
}

static boolean actualPalindrome(String s, int start, int end) 
{
 while (start<=end) 
 {
  if (s.charAt(start) != s.charAt(end)) 
  {
   return false;
  } 
  start++;
  end--;
 } 
 return true;  
}    
}
