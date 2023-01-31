public class MaxNumberOfRemovable 
{
public static void main(String[] args) 
{
System.out.println(maximumRemovals("abcacb", "ab", new int[]{3,1,0}));
}
static int maximumRemovals(String s, String p, int[] removable)
{
int start = 0;
int end = removable.length-1;

while (start<=end) 
{
int mid = start+(end-start)/2;

StringBuffer buffer = new StringBuffer(s);
for (int i = 0; i <= mid; i++) 
{
 buffer.setCharAt(removable[i], ' ');
}
if (!isSubsequence(buffer.toString(), p)) end = mid-1;
 
else start = mid+1;
}
return end+1;
}
static boolean isSubsequence(String mainString, String pattern)
{
int pointerForMainString = 0;
int pointerForPattern = 0;

while (pointerForMainString<pattern.length() && pointerForPattern<mainString.length()) 
{
if(mainString.charAt(pointerForPattern) == pattern.charAt(pointerForMainString)) 
{
pointerForMainString++;    
}
pointerForPattern++;
}
return pointerForMainString == pattern.length();
}    
}
/*
 * int n = p.length();
        int m = s.length();
        int i = 0;
        int j = 0;
        while (i < n && j < m) {
            if (p.charAt(i) == s.charAt(j)) {
                i++;
            }
            j++;
        }
        return i == n;
 */