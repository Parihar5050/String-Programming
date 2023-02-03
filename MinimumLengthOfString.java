public class MinimumLengthOfString 
{
public static void main(String[] args) 
{
 System.out.println(calculate("cabaabac"));  
}
static int calculate(String s)
{
int start=0,end=s.length()-1;

while (start<end && s.charAt(start) == s.charAt(end)) 
{
    char unknown = s.charAt(end);
if(start<=end && s.charAt(start) == unknown)start++;

if(start<=end && s.charAt(end) == unknown)end--;
}
return end-start+1;
}    
}
