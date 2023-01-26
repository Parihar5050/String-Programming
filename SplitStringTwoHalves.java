public class SplitStringTwoHalves
{
public static void main(String[] args) 
{
// String s = "x",b = "y";
// String s = "ulacfd"; b = "jizalu";
String s = "abdef", b = "fecab";

System.out.println(checkPalindromeFormation(s,b));
}
//
static boolean checkPalindromeFormation(String s, String b) 
{
 return check(s,b) || check(b,s);
}
//
static boolean check(String s, String b) 
{
int start = 0;
int end = s.length()-1;

while (start<end) 
{
if (s.charAt(start)==s.charAt(end)) 
{
start++;
end--;    
}    
}
if (start>end) return true;
return ispalindrome(s, start, end) || ispalindrome(b, start, end);
}
//
static boolean ispalindrome(String s,int start,int end) 
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

/*static boolean checkPalindromeFormation(String a, String b) 
{
if (a.length()==1) return true;

String ans = a.substring(0, a.length()/2) + b.substring(b.length()/2, b.length());

return ispalindrome(ans);        
} */