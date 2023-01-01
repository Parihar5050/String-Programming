public class SignOfTheProduct 
{
public static void main(String[] args) 
{
 int[] array = {-1,-2,-3,-4,3,2,1};
 System.out.println(arraySign(array));
}
static int arraySign(int[] nums)  
{
 int ve_Product = 0;
 for (int i = 0; i < nums.length; i++) 
 {
  if(nums[i] == 0 ) return 0;

  if(nums[i]<0) ve_Product++;
 }
 return ve_Product%2==0?1:-1;    
} 

}
