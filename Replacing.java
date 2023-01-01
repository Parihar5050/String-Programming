public class Replacing 
{
public static void main(String[] args) 
{
 String s = "G()(al)";
 System.out.println(interpreter(s));
}
static String interpreter(String command) 
{
 command=command.replace("()","o");
 command=command.replace("(al)","al");
 return command;
}    
}
