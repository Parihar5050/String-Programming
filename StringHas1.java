public class StringHas1 
{
public static void main(String[] args) 
{
System.out.println(checkOnesSegment("101101"));
}    
static boolean checkOnesSegment(String s) 
{
 return !s.contains("01");
}
}
