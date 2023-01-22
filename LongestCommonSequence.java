/*Input: strs = ["flower","flow","flight"]
Output: "fl" 

Working:
1)Take the first(index=0) string in the array as prefix.
2)Iterate from second(index=1) string till the end.
3)Use the indexOf() function to check if the prefix is there in the strs[i] or not.
If the prefix is there the function returns 0 else -1.
4)Use the substring function to chop the last letter from prefix each time the function return -1.

*/
public class LongestCommonSequence 
{
public static void main(String[] args) 
{
 String[] string = {"flower","flow","flight"};
//  String[] string = {"dog","racecar","car"};
 System.out.println(sequence(string));
}
static String sequence(String[] strs) 
{
 String prefix = strs[0];
 for (int i = 1; i < strs.length; i++) 
 {
  while (strs[i].indexOf(prefix)!=0)  // flower.flower != 0
  {
    // chopping of string and updating it flower -> flowe -> flow -> flo -> fl
    prefix=prefix.substring(0, prefix.length()-1);
  }  
 }
 return prefix;    
}    
}
