public class SpiralMatrixTwo 
{
public static void main(String[] args) 
{
    
}
static int[][] generateMatrix(int n)
{
int[][] matrix = new int[n][n];
int Nstart = 1;
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
matrix[up][i] = Nstart++;
}
//Set the top row pointer down to the next row
up++;
//

//Move down
for(int i = up; i<= down; i++)
{
matrix[i][right] = Nstart++;
}
//Move column pointer to left
right--;

//Move left

for(int i = right; i>= left; i--)
{
 matrix[down][i] = Nstart++;
}
//Set bottom row pointer to next row up
down--;
//move up
for(int i = down; i>= up; i--)
{
matrix[i][left] = Nstart++;
}
//set left coulmn pointer to next column to the right
left++;
}
return matrix;
}    
}
