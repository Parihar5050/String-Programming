/**
 * NumberOfSubString
 * returning total count of substring possible containing 1
 */
public class NumberOfSubString 
{
public static void main(String[] args) 
{
System.out.println(onesSubstring("0110111"));
}
static int onesSubstring(String s)
{
long mod = (int)1e9+7;
long count = 0, ans = 0;

for (int i = 0; i < s.length(); i++) 
{
if (s.charAt(i) == '1') ans+= ++count;

else count = 0; 
}
return (int)(ans%mod);
}    
}