import java.util.ArrayList;
import java.util.List;

public class FindAnagram 
{
public static void main(String[] args) 
{
 String s = "cbaebabacd", p = "abc";
//  StringBuffer ds = new StringBuffer(p);
//  System.out.println(ds.reverse());
System.out.println(findAnagrams(s, p));
}
static List<Integer> findAnagrams(String s, String p)
{
List<Integer> indx = new ArrayList<Integer>();

StringBuffer newS = new StringBuffer(s);
StringBuffer rvs = newS.reverse();

int start= 0;
int end = s.length()-1;

while (start<end) 
{
 if(s.contentEquals(rvs))
 {
  indx.add(start);
 }    
 start++;
 end--;
}
return indx;
}    
}
