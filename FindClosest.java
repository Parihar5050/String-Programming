import java.util.ArrayList;
import java.util.List;

public class FindClosest 
{
public static void main(String[] args) 
{
 int[] arr = {1,2,3,4,5}; 
 int k = 4, x = 3;
 System.out.println(findClosestElements(arr, k, x));
}
static List<Integer> findClosestElements(int[] arr, int k, int x)
{
 int left = 0 , right = arr.length-k;

 while (left<right) 
 {
  int mid = left+(right-left)/2;
  if(x-arr[mid] > arr[mid+k]-x) left = mid+1; 
  else right = mid;
 }

  List<Integer> ans = new ArrayList<Integer>();
  for (int i = left; i < right+k; i++) 
  {
   ans.add(arr[i]);
  }
  return ans;
}  
}
