// there is a way in which using only one catch block is sufficient 
// for every exception, that way is by using 
// "exception class " root class of every exception in java

// we can also use the root class of exception class also which is throwable
// which is not a recommended approach

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

catch(Throwable th)  // you can use either catch block

//catch(Exception aw)  // this one catch block will handle every exception using exception class
{
System.out.println("You have entered incorrect no. or incorrect index no.");
}
}
} 
/* output:


F:\java by dragon\java programms\java exception handling>java Ultimate_catchblock

Enter a no. which will divide 1056
8

result only provide quosent...132

You have entered incorrect no. or incorrect index no. // this line is for second exceptional code

*/