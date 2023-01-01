public class HappyNumber 
{
public static void main(String[] args) 
{
 int n = 19;
 System.out.println(isHappy(n));
}    
static boolean isHappy(int n) 
{
 int store = 0;
 while (n>0) 
 {
  int rem = n%10;
  store+=rem*rem;
  n/=10;   
 }
 if(store == 1) return true;

 if(store == 4) return false;

 return isHappy(store);    
}
}
