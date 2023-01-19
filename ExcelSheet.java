public class ExcelSheet 
{
public static void main(String[] args) 
{
 System.out.println(finder(701));
}
static String finder(int columnNumber) 
{
 String ans = "";
 while (columnNumber>0) 
 {
  columnNumber--;
  ans = (char)('A' + (columnNumber%26))+ans;
  columnNumber/=26;               
 }
 return ans;     
}    
}
