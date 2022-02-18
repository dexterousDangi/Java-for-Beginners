// there is a way in which using only one catch block is sufficient 
// for every exception, that way is by using 
// "exception class " root class of every exception in java

// this application contains multiple exceptional code.

import java.util.Scanner;
class Ultimate_catchblock
{
public static void main (String []args)
{

System.out.println("Enter a no. which will divide 1056");
Scanner s= new Scanner(System.in);
int q=s.nextInt();

try
{
System.out.println(("result only provide quosent...") +1056/q);    // exceptional code

System.out.println("hi durga".charAt(43));  // exceptional code
}
catch(Exception aw)  // this one catch block will handle every exception using exception class
{
System.out.println("You have entered incorrect no. or incorrect index no.");
}
}
}