// try_catch block
// one catch block for arithmetic exceptions and 
// one catch block for every other kind of exception

 // as we know arithmetic exception class is child class of exception class 
// so, to correctly implement all the catch block order of catch block is very important
// it has to be from child class -----> parent class 


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
          
               // catch block order is important
               // it has to be from child exception class----> parent exception class

catch (ArithmeticException ae)
{
System.out.println("enter correct value of divisor");
}

//catch(Throwable th)  // you can use either catch block
catch (Exception ex)
{
System.out.println("other excepiton occured ");
System.out.println("provide correct index no.");
}
}
}


/* output: arithmetic exception (arithmetic catch block is executed)

F:\java by dragon\java programms\java exception handling>java Ultimate_catchbloc
k
Enter a no. which will divide 1056
0
enter correct value of divisor

*/


/*output: for other exception

F:\java by dragon\java programms\java exception handling>java Ultimate_catchblock

Enter a no. which will divide 1056
16
result only provide quosent...66
other excepiton occured
provide correct index no.

*/

// case 2 : if we change the order (from Parent class ---->child class)

/*
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
          
               // catch block order is important
               // it has to be from child exception class----> parent exception class


//catch(Throwable th)  // you can use either catch block
catch (Exception ex)
{
System.out.println("other excepiton occured ");
System.out.println("provide correct index no.");
}


catch (ArithmeticException ae)
{
System.out.println("enter correct value of divisor");
}

}
}
*/

/* output: means to say that the exception class already have arithmetic exception class in him.

F:\java by dragon\java programms\java exception handling>javac Specific_for_one.
java
Specific_for_one.java:100: error: exception ArithmeticException has already been
 caught
catch (ArithmeticException ae)
^
1 error
*/




































