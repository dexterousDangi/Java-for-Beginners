// String Manipulation: think of reversing a string, but our string class don't have
// any reverse() method, to perform the reverse operation but stringBuffer class
// have the reverse() method, so we just convert the string into stringbuffer 
// and perform our reverse operation and convert back stringbuffer into string.

// conversion of string ----> StringBuffer
// conversion of stringBuffer ----> string

import java.util.*;
class Conversion_of_string
{
public static void main(String []args)
{
System.out.println("Enter a String");

Scanner s = new Scanner(System.in);

 		// conversion of string to stringbuffer

String str = s.nextLine();
StringBuffer sb= new StringBuffer(str);  // here instead of string data pass the str
System.out.println("this is stringbuffer..."+sb);

 		// conversion of Stringbuffer to string

StringBuffer sb1 = sb.reverse();  // store the reversed value in a stingbuffer
String ss=sb1.toString();    	// now by calling tostring() method we get a string return type 
				// stroe that string return type value in a string class object

System.out.println("this is a reverse of the string and of string type  "+ss);


StringBuffer sb2= new StringBuffer ("dangi");
String sss= sb2.toString();
System.out.println("we have enter a StringBuffer...:"+sb2+"   now conversing it into a String....:"+sss);
}
}

/*
output:

F:\java by dragon\java programms\string manipulation>javac Reverse_of_string.java

F:\java by dragon\java programms\string manipulation>java Conversion_of_string

Enter a String

we are crazy

this is stringbuffer...we are crazy

this is a reverse of the string and of string type  yzarc era ew

we have enter a StringBuffer...:dangi   now conversing it into a String....:dangi
*/