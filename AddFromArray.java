import java.util.ArrayList;
import java.util.List;

public class AddFromArray 
{
public static void main(String[] args) 
{
int[] arr = {1,2,0,0};
System.out.println(fxn(arr,34));
}
static List<Integer> fxn(int[] num, int K)
{
ArrayList<Integer> ans = new ArrayList<Integer>();

int end = num.length-1;
while (end>=0 || K!=0) 
{
if(num[end]>=0) 
{
K+=num[end];
end--;
}
ans.add(0, K%10);
K/=10;
}

return ans;
}    
}
/*for (int i = A.length - 1; i >= 0; --i) {
            res.add(0, (A[i] + K) % 10);
            K = (A[i] + K) / 10;
        }
        while (K > 0) {
            res.add(0, K % 10);
            K /= 10;
        }
        return res; 
         List res = new LinkedList<>();
        for (int i = A.length - 1; i >= 0 || K > 0; --i) {
            res.add(0, (i >= 0 ? A[i] + K : K) % 10);
            K = (i >= 0 ? A[i] + K : K) / 10;
        }
        return res;
        */
