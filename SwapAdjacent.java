public class SwapAdjacent 
{
public static void main(String[] args) 
{
System.out.println(canTransform("RXXLRXRXL", "XRLXXRRLX"));
// System.out.println(canTransform("X", "L"));
// String start = "RXXLRXRXL";
// String end = "XRLXXRRLX";
// char[] arr = s.toCharArray(); 
// System.out.println(Arrays.toString(arr));
// String st = start.replace("X", "");
// String ed = end.replace("X", "");
// System.out.println(st+"\n"+ed);
}
static boolean canTransform(String start, String end)
{
 int l = 0;
 int r = 0;

 for (int i = 0; i < start.length(); i++) 
 {
 if (start.charAt(i)=='L') l++; 
 if (start.charAt(i)=='R') r++; 
 if (end.charAt(i)=='L') l--; 
 if (end.charAt(i)=='R') r--; 
 }
 return l==r;
}
}    
