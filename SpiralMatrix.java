import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix 
{
public static void main(String[] args)
{
int[][] matrix = {{1,2,3},
                  {4,5,6},
                  {7,8,9}};

// System.out.println(spiralOrder(matrix));
spiralOrder(matrix);
}
static List<Integer> spiralOrder(int[][] matrix)
{
List<Integer> ans = new ArrayList<>();
int up = 0;
int down =matrix.length-1;
int left = 0;
int right = matrix[0].length-1;
//loop while still in the matrix boundries 
while(up <= down && left <= right)
{

//move right
for(int i = left; i<= right; i++)
{
 ans.add(matrix[up][i]);
}
//Set the top row pointer down to the next row
up++;
//

//Move down
for(int i = up; i<= down; i++)
{
    ans.add(matrix[i][right]);
}
//Move column pointer to left
right--;

//Move left
if(up <= down)
{ 
for(int i = right; i>= left; i--)
{
 ans.add(matrix[down][i]);
}
}

//Set bottom row pointer to next row up
down--;
//move up
if(left <= right)
{
    for(int i = down; i>= up; i--){
        ans.add(matrix[i][left]);
    }
}
//set left coulmn pointer to next column to the right
left++;
}
return ans;
}    
}
