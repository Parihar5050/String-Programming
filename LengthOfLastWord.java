public class LengthOfLastWord
{
public static void main(String[] args) 
{
    System.out.println(lengthOf("Aditya Parihar"));
}
static int lengthOf(String s) 
{
s.trim();

String[] str = s.split(" ");

String lastWord = str[str.length-1];

return lastWord.length();
}    
}