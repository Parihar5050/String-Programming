public class StringMultiplier 
{
public static void main(String[] args) 
{
System.out.println(multiply("2", "3"));
System.out.println(multiply("123", "456"));
}
static String multiply(String num1, String num2)
{
int a = num1.length(), b = num2.length();

int[] ans = new int[a+b];

for (int i = a-1; i >= 0; i--) 
{
for (int j = b-1; j >= 0; j--) 
{
 int product = (num2.charAt(i)-'0')*(num1.charAt(j)-'0');
 product += ans[i+j+1];
 ans[i+j+1] = product%10;
 ans[i+j] += product/10;
}    
}
StringBuilder result = new StringBuilder();
for (int i : ans) 
{
 if(result.length()==0  && i==0) continue;

 result.append(i);
}
return result.toString();
}    
}
