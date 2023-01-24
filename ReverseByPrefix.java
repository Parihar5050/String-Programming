public class ReverseByPrefix 
{
public static void main(String[] args) 
{
// System.out.println(reversePrefix("abcdefd", 'd'));
}
static String reversePrefix(String word, char ch) 
{
// String ans = "";

// String target = word.substring(0, word.charAt(ch)+1);
// String remaining = word.substring(word.charAt(ch)+1,word.length());

// for (int i = target.length()-1; i > 0; i--)
// {
// ans+=target.charAt(i);    
// }

// return ans+remaining;

StringBuffer ans = new StringBuffer(word.substring(0, word.charAt(ch)+1));
ans.reverse();
return ans.toString().concat(word.substring(ch+1));
}    
}
/*make a substring from 0 to ch 
 * 
 */