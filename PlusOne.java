import java.util.Arrays;

public class PlusOne 
{
public static void main(String[] args) 
{
int[] arr = {9};
System.out.println(Arrays.toString(one(arr)));
// System.out.println(one(arr));
}
static int[] one(int[] digit)
{
for (int i = digit.length-1; i >= 0; i--) 
{
if (digit[i]<9) 
{
digit[i]++;
return digit;
}
digit[i] = 0;
}
int[] ans = new int[digit.length+1];
ans[0] = 1; 
return ans;
}    
}
