// palendrom of a string or a number check!

import java.util.Scanner;

class Palindrome_check
{
public static void main(String []args)
{
String str="";
String org;

Scanner scan=  new Scanner (System.in);
System.out.println("Enter a string/number to check if it is a plaindrome or not");


org = scan.nextLine();
 org = org.trim();
int length = org.length();

for (int i=length-1; i>=0; i--)
{
str = str+org.charAt(i);
}
System.out.println(str);
if(org.equals(str))
System.out.println("yes it's a plaindrome");
else
System.out.println("no it's not a plaindrome");





}
}
/*output:

F:\java by dragon\Java-for-Beginners\java programms\01 Exercises>javac Palindrome_check.java

F:\java by dragon\Java-for-Beginners\java programms\01 Exercises>java Palindrome_check

Enter a string/number to check if it is a plaindrome or not

pardeepdangi
ignadpeedrap
no it's not a plaindrome

F:\java by dragon\Java-for-Beginners\java programms\01 Exercises>java Palindrome_check

Enter a string/number to check if it is a plaindrome or not
443344
443344
yes it's a plaindrome

*/

