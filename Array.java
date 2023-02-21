public class Array 
{
public static void main(String[] args) 
{

}

static String revs(String s, int k) 
{
char[] str = s.toCharArray();
for (int i = 0; i < s.length()-1; i+=(2*k)) 
{
int start = 0;
int end = Math.min(i+k-1, s.length()-1);

while (start<end) 
{
char temp = str[start];
str[start++] = str[end];
str[end--] = temp;    
}    
}
return new String(str);
}
}
