import java.util.Arrays;

public class LargestPerimeter 
{
public static void main(String[] args) 
{
 int[] sides = {1,2,1,10};
 System.out.println(perimeterCalculator(sides));    
}

static int perimeterCalculator(int[] array) 
{
 Arrays.sort(array);
 for (int i = array.length-3; i>=0; i--) 
 {
  if (array[i]+array[i+1] > array[i+2]) 
  {
   return array[i]+array[i+1]+array[i+2];
  }   
 }   
 return 0;
}    
}