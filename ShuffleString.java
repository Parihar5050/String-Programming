public class ShuffleString 
{
public static void main(String[] args) 
{
 String x = "codeleet";
//  String x = "abc";
 int[] array = {4,5,6,7,0,2,1,3};
//  int[] array = {1,2,3};

 System.out.println(converter(x, array));
 System.out.println(usingCyclicSort(x, array));
}    
static String converter(String s, int[] indices) 
{
  char[] storingS = s.toCharArray();

  for (int i = 0; i < indices.length; i++) 
  {
   storingS[indices[i]] = s.charAt(i);
  }
  return String.valueOf(storingS);
}

static String usingCyclicSort(String s, int[] indices)
{
 int i = 0;
 char[] storing = s.toCharArray();

 while (i<indices.length) 
 {
  int correct = indices[i];
  if (i!=correct) 
  {
    swapChar(storing, i, correct);
    swapInt(indices, i, correct);
  } 
  else{i++;}
 }
 return String.valueOf(storing);
}
static void swapInt(int[] array,int i,int j) 
{
    int temp = array[i];
    array[i]=array[j];
    array[j]=temp;
}
static void swapChar(char[] array,int i,int j) 
{
    char temp = array[i];
    array[i]=array[j];
    array[j]=temp;
}
}
