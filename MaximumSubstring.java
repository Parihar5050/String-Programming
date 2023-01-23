/*sequence = "ababc", word = "ab" */
public class MaximumSubstring 
{
public static void main(String[] args) 
{
 System.out.println(maxRepeating("ababac", "ac"));
}
static int maxRepeating(String sequence, String word) 
{
int count = 0;
String temp = word;
while (sequence.contains(word)) 
{
 count++;
 word+=temp;
}
return count;        
}    
}
