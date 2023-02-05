import java.util.Arrays;

public class ShiftingLetters 
{
public static void main(String[] args) 
{
int[] shft = {3,5,9};
System.out.println(shiftingLetters("abc", shft));
}
static String shiftingLetters(String s, int[] shifts)
{
char[] array = s.toCharArray();
int total = 0;
for (int i = s.length()-1; i>=0; i--) 
{
total+=shifts[i]%26;
array[i] = (char)((array[i]-97+total)%26+97);
}
return String.valueOf(array);
}    
}
