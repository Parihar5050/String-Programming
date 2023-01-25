import java.util.HashMap;

public class RomanInteger 
{
public static void main(String[] args) 
{
 System.out.println(converter("MCMXCIV"));
}
static int converter(String s)
{
HashMap<Character,Integer> mapping = new HashMap<>();
mapping.put('I',1);
mapping.put('V',5);
mapping.put('X',10);
mapping.put('L',50);
mapping.put('C',100);
mapping.put('D',500);
mapping.put('M',1000);

int ans = 0;
for (int i = 0; i < s.length()-1; i++) 
{
 char current = s.charAt(i);    
 char nxt = s.charAt(i+1);

 if(mapping.get(current)<mapping.get(nxt)) 
 {
  ans = ans - mapping.get(current);
 }
 else 
 {
 ans = ans + mapping.get(current);
 } 
}
ans+=mapping.get(s.charAt(s.length()-1));
return ans;
}
}
