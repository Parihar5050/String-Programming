public class NumberOfWaysToSplit 
{
public static void main(String[] args) 
{
System.out.println(numWays("10101")); 
}
static int numWays(String s)
{
long m = 1_000_000_007;
long n = s.length();

/*Count number one*/ 
long oneCount = 0;
for (int i = 0; i < n; i++) 
{
if(s.charAt(i)=='1') oneCount++;    
}

// string doesn't have 1 
if (oneCount==0) return (int)((((n-2)*(n-1))/2)%m);

// in string 1's count != or !multiple of 3 
if (oneCount%3!=0) return 0;

//Actual Split and it'll give no. of combination posbl
long count = 0; 
long oncCountInBlock = oneCount/3;
long frstCut = 0, scndCut = 0;

for (int i = 0; i < n; i++) 
{
if(s.charAt(i)=='1') count++; 

if (count==oncCountInBlock) frstCut++;

if (count== (2*oncCountInBlock)) scndCut++;
}
return (int)((frstCut*scndCut)%m);
}    
}
