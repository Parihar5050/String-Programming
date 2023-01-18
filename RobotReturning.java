// Visualize using Graph moves count should match.
public class RobotReturning 
{
public static void main(String[] args) 
{
 System.out.println(check("UD"));
}
static boolean check(String moves) 
{
 moves.toUpperCase();
 int x = 0 , y = 0;  
 for (char movement : moves.toCharArray()) 
 {
  if(movement == 'U') y++; 
  if(movement == 'D') y--; 
  if(movement == 'L') x++; 
  if(movement == 'R') x--; 
 }
 return x== 0 & y==0;
}    
}
