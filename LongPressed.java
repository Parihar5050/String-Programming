/*Input: name = "alex", typed = "aaleex"
Output: true
'a' and 'e' in 'alex' were long pressed.
 */
public class LongPressed 
{
public static void main(String[] args) 
{
 System.out.println(isLongPressedName("saeed", "ssaaedd"));
}
static boolean isLongPressedName(String name, String typed) 
{
 int count = 0,stringName = name.length(), stringTyped = typed.length();

 for(int i = 0; i < stringTyped; i++) 
 {
  if(name.charAt(count) == typed.charAt(i)) 
  {
   count++;
  }
  else if (typed.charAt(i) != typed.charAt(i-1)) 
  {
   return false;  
  }
 }
 return count==stringName; 
}    
}
