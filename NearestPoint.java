/*
 * 4|      
 * 3|    
 * 2|   
 * 1| 
 * 0|____________
 *   1  2  3  4
 */

public class NearestPoint 
{
public static void main(String[] args) 
{
 int[][] array = {{1,2},
                  {3,1},
                  {2,4},
                  {2,3},
                  {4,4}};
System.out.println(searchForDistance(3,4, array));
}

static int searchForDistance(int x, int y,int[][] points) 
{
 int min = Integer.MAX_VALUE;
 int distance = -1;

 for (int i = 0; i < points.length; i++) 
 {
  if (points[i][0]==x || points[i][1]==y) 
  {
    int PointDistance = Math.abs(x - points[i][0]) + Math.abs(y - points[i][1]);
    if(PointDistance < min)
    {
     min = PointDistance;
     distance = i;
    }
  }   
 }
 return distance;
}
}
