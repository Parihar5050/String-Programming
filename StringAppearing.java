public class StringAppearing 
{
public static void main(String[] args) 
{
    
}
static int check(String[] patterns, String word) 
{
 int count = 0;
 for (String string : patterns) 
 {
   if (word.contains(string)) count++ ;   
 } 
 return count;    
}    
}
