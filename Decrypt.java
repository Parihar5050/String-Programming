public class Decrypt 
{
public static void main(String[] args) 
{
  System.out.println(decrypted("10#11#12"));  
}
static String decrypted(String s) 
{
    // we're using stringBuilder. Since, String are immutable
 StringBuilder charAns = new StringBuilder();
 
 //string from end as it'll be easy to transverse 
 //we would encounter '#' not digit 1st.
 for (int i = charAns.length()-1; i >= 0; i--) 
 {
  if(s.charAt(i) == '#') 
  {
   int num = Integer.parseInt(s.substring(i-2, i))-1;
   char storing = (char)('a'+num);
   charAns.append(storing);
   i-=2;
  } 
  else 
  {
   int num = s.charAt(i) - '0';
   char storing = (char)('a'+(num-1));
   charAns.append(storing);
  }   
 }
 
 StringBuilder finalAns = new StringBuilder();
 
 for (int i = charAns.length()-1; i >= 0; i--) 
 {
    finalAns.append(charAns.charAt(i));
 }
 return finalAns.toString();
} 
static String decrypted2(String s)
{
    StringBuilder ans = new StringBuilder();
    for (int i = s.length() - 1; i >=0 ; i--) { // transversing from the last index
        if(s.charAt(i) == '#'){ // if the element in index is '#', the two elements it is converted to int and added to 'a' create the character need
            int num = Integer.parseInt(s.substring(i-2,i)) - 1;
            char ansCh = (char)('a' + num);
            ans.append(ansCh); // they are then appended
            i -= 2; // skipping the processed numbers
        }
        else {
            int num = s.charAt(i) - '0'; // if there's no '#' then only the i is converted to num
            char ansCh = (char)('a' + (num - 1));
            ans.append(ansCh);
        }
    }
    StringBuilder fin = new StringBuilder();  // as we traversed from the last, the string we got will  be in reversed order,hence a new string is made and returned
    for (int i = ans.length() - 1; i >= 0 ; i--) {
        fin.append(ans.charAt(i));
    }
    return fin.toString();
}   
}
