public class GetEqualSubstring 
{
public static void main(String[] args) 
{
// System.out.println(equalSubstring("abcd", "bcdf",3)); 
System.out.println(equalSubstring("abcd", "cdef",3)); 
}
static int equalSubstring(String s, String t, int maxCost)
{
int[] difference = new int[s.length()];
for (int i = 0; i < s.length(); i++) 
{
 difference[i] = Math.abs(s.charAt(i)-t.charAt(i));
}
return sum(difference, maxCost);
}
static int sum(int[] difference, int maxCost)
{
int maxLen = 0;
int curCost = 0;
int start = 0;

for (int end = 0; end < difference.length; end++) 
{
curCost+=difference[end];
while (curCost>maxCost) 
{
curCost-=difference[start];
start++;    
}
maxLen = Math.max(maxLen, end-start+1);
}
return maxLen;
}
}
