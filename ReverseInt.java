public class ReverseInt 
{
public static void main(String[] args) 
{
System.out.println(revese(-320));
}
static int revese(int x)
{
int number = 0;
while (Math.abs(x)>0) 
{
int lastDigit = x%10;
number=number*10+lastDigit;
x/=10;
}
if (number>Integer.MAX_VALUE) return 0;    
return number;
}    
}
