public class RepeatedStringMatch 
{
public static void main(String[] args) 
{
// System.out.println(repeatCount("abcd","cdabcdab"));
System.out.println(repeatCount("abcd","cdabcdab"));
}
static int repeatCount(String a, String b)
{
int length = b.length()/a.length();
int count = 0;
StringBuilder ans = new StringBuilder();

for (int i = 0; i <= length+2; i++) 
{
if (ans.toString().contains(b)) 
{
return count;    
}    
else
{
ans.append(a);
count++;
}
}
return -1;
}    
}
