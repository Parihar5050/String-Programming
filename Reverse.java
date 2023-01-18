public class Reverse 
{
public static void main(String[] args) 
{
 System.out.println(reversing("Let's take LeetCode contest"));   
}
static String reversing(String s) 
{
 String finalAns = "";
 String[] charArr = s.split(" ");

 for (int i = 0; i < charArr.length; i++) 
 {
  StringBuilder foo = new StringBuilder(charArr[i]);
  finalAns+=(foo.reverse()).toString()+" ";  
 }
 return finalAns.trim();

}    
}