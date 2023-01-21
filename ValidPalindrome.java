public class ValidPalindrome 
{
public static void main(String[] args) 
{
 System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
}
static boolean isPalindrome(String s)
{
 s = s.toLowerCase().replace("[^a-z0-9]", "");

 int start = 0; 
 int end = s.length()-1;

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
// s = s.toLowerCase().replaceAll("[^a-z0-9]", "");
// int i = 0;
// int j = s.length() - 1;
// while(i <= j) {
//     if (s.charAt(i) != s.charAt(j)) {
//         return false;
//     }
//     i++;
//     j--;
// }
// return true;
// }
