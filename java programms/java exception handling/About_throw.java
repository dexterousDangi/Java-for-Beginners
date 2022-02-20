//About throw keyword and its usage: throw keyword is used to handover the object
// of user defined exception to the "jvm". so that jvm can handle those exceptions
// because jvm don't understand user defined exceptions, we have to create the 
// object of the user defined exceptions and using throw keyword we handover these
// objects to the jvm. 

// throw keyword can be used for predefined exception object creation , but it is not a recommended approach
// in this example user is creating the object and handed over to jvm to handle the exception

// not a recommended appraoch because arithmetic exception already have its infromation predefined(don't distrub the predefined data)


import java.util.Scanner;
class  About_throw
{
static void status(int age)
{ 
if (age>20)
{System.out.println("Allowed for marriage");

}
else    // here we are creating object for predefined exception and 
          // printing our own message 
            // not a great approach because we are changing the existing data.

{
throw new ArithmeticException("not eligible underage fellow");}
}

public static void main(String []args) 
{
Scanner s = new Scanner(System.in );
System.out.println(" Enter your age");

int age= s.nextInt();
About_throw.status(age);
}
}
  

/*outPut:

F:\java by dragon\java programms\java exception handling>javac About_throw.java

F:\java by dragon\java programms\java exception handling>java About_throw
 Enter your age
28
Allowed for marriage

F:\java by dragon\java programms\java exception handling>java About_throw
 Enter your age
12
Exception in thread "main" java.lang.ArithmeticException: not eligible underage fellow
        

		at About_throw.status(About_throw.java:22)
        	at About_throw.main(About_throw.java:31)
*/