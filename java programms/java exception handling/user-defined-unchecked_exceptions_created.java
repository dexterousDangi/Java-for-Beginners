
//2) -a) creation of user defined un-checked exception by using parameterized constructor approach:



import java.util.Scanner;
class  About_throw
{
static void status(int age)
{ 
if (age>20)
{
 System.out.println("Allowed for marriage ");

}
else   
{
throw new InvalidAgeException("not the time has come- we are using unchecked exception of user defined type");}  
               
		// here when compiler call the constructor it get to know that this is a unchecked type of exception and didnot raise any exception during compile time
              // this is one argument constructor(InvalidAgeException(parameter_list))
}
public static void main(String []args) 
{
Scanner s = new Scanner(System.in );
System.out.println(" Enter your age");

int age= s.nextInt();
About_throw.status(age);
}
}
 
/*output: userdefined unchecked exception created using parameterized constructor


F:\java by dragon\java programms\java exception handling>java About_throw
 Enter your age
10
Exception in thread "main" InvalidAgeException: not the time has come- we are using unchecked exception of user defined type  // this is user defined
        at About_throw.status(user-defined-unchecked_exceptions_created.java:18
	 at About_throw.main(user-defined-unchecked_exceptions_created.java:27)
*/