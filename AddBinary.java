public class AddBinary 
{
public static void main(String[] args) 
{
System.out.println(binary("11", "1"));    
}
static String binary(String a, String b)
{
StringBuffer ans = new StringBuffer();

int endA = a.length()-1;
int endB = b.length()-1;
int carry = 0;

while (endA>=0 || endB>=0 || carry == 1) 
{
if(endA>=0) carry+=a.charAt(endA--)-'0';
if(endB>=0) carry+=b.charAt(endB--)-'0';

ans.append((char)(carry%2+'0'));
carry/=2;
}

return ans.reverse().toString();
}    
}
