public class Example 
{
public static void main(String[] args) 
{
    System.out.println(check("ADITYA"));
}
static boolean check(String s)
{
 return count(s.substring(0,s.length()/2))==count(s.substring(s.length()/2));
}
static int count(String s) 
{
 int cnt = 0;
 for (int i = 0; i < s.length(); i++) 
 {
  if(("aeiouAEIOU".indexOf(s)>=0))   
  {
   cnt++;
  }   
 }
 return cnt;   
}    
}