// application using user defined exception (InvalidAgeException i.e., created by user)
// complier don't know about this exception but jvm do
// so, by using throws keyword we can delegate the exception to main method
// main method then delegate the exception to the caller which is jvm
// jvm know about the InvalidAgeException and it will handle it.

import java.util.Scanner;
class  About_throw
{
static void status(int age) throws InvalidAgeException
{ 
if (age>20)
{
 System.out.println("Allowed for marriage");

}
else   
{
throw new InvalidAgeException();}
              // this is zero argument constructor(InvalidAgeException(empty))
}
public static void main(String []args)  throws InvalidAgeException
{
Scanner s = new Scanner(System.in );
System.out.println(" Enter your age");

int age= s.nextInt();
About_throw.status(age);
}
}

/*output:
F:\java by dragon\java programms\java exception handling>javac User-defined-exception.java

F:\java by dragon\java programms\java exception handling>java About_throw
 
Enter your age
12

Exception in thread "main" InvalidAgeException   // this is userdefined exception
        
	at About_throw.status(User-defined-exception.java:14)
        at About_throw.main(User-defined-exception.java:23)

F:\java by dragon\java programms\java exception handling>java About_throw

Enter your age
25

Allowed for marriage

*/

// if we don't delegate the exception to the jvm then complier will generate the exception
 
/*

// deal with this by using throws keyword

import java.util.Scanner;
class  About_throw
{
static void status(int age)
{ 
if (age>20)
{
 System.out.println("Allowed for marriage");

}
else   
{
throw new InvalidAgeException();}
              // this is zero argument constructor(InvalidAgeException(empty))
}
public static void main(String []args)  
{
Scanner s = new Scanner(System.in );
System.out.println(" Enter your age");

int age= s.nextInt();
About_throw.status(age);
}
}

output:
F:\java by dragon\java programms\java exception handling>javac User-defined-exce
ption.java
User-defined-exception.java:14: error: unreported exception InvalidAgeException;
 must be caught or declared to be thrown
throw new InvalidAgeException();}
^
1 error
*/






































