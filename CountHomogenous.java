public class CountHomogenous 
{
public static void main(String[] args) 
{
System.out.println(countOccurence("abbcccaa"));
}
static int countOccurence(String s)
{
long mod = (int)1e9+7;
int result = 0;
int count = 0;

for (int i = 0; i < s.length(); i++) 
{
if(i<s.length()-1 && s.charAt(i) == s.charAt(i+1))
{
count++;
} 
else
count=1;

result = (int)((result+count)%mod);
}
return result;
}    
}
