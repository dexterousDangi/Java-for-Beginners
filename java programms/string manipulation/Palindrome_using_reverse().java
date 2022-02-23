// my first application devloped

//Palindrome is this

import java.util.*;
class Palindrome
{
public static void main(String []args)
{
System.out.println("Enter a no. or a String to if there is a Palindrome relation exit ");

Scanner s = new Scanner(System.in);


  		// conversion of string to stringbuffer

String str = s.nextLine();
System.out.println("Enter data is   :"+str);

StringBuffer sb= new StringBuffer(str);  // here instead of string data pass the str
//System.out.println(sb.reverse());


 		// conversion of Stringbuffer to string

StringBuffer sb1 = sb.reverse();  // store the reversed value in a stingbuffer
String ss=sb1.toString();    	// now by calling tostring() method we get a string return type 
				// stroe that string return type value in a string class object


System.out.println("Reversal of the entered data   :"+ss);

boolean f =ss.equals(str);

//System.out.println(ss.equals(str));

if (f== true)    // to see whether they are Palindrome or not
{
System.out.println(" this is a Palindrome ");
}
else
{System.out.println("not a Palindrome");}


}
}
