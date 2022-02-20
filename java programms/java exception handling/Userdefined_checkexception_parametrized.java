// creation of user defined checked exception by using parameterized constructor approach:
// using parameterized constructor approach:
// about thorw keyword also

//step no.1 : create user defined exception
//step no.2 : use this in your application


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
throw new InvalidAgeException("not eligible please wait for some time ");}
             
             // this is parameterized constructor(InvalidAgeException(parameter_list))
}
public static void main(String []args) throws InvalidAgeException
{
Scanner s = new Scanner(System.in );
System.out.println(" Enter your age");

int age= s.nextInt();
About_throw.status(age);
}
}

/*output:
F:\java by dragon\java programms\java exception handling>javac "InvalidAgeExcept
ion(parametrized).java"

F:\java by dragon\java programms\java exception handling>javac Userdefined_check
exception_parametrized.java

F:\java by dragon\java programms\java exception handling>java About_throw
 Enter your age
56
Allowed for marriage

F:\java by dragon\java programms\java exception handling>java About_throw
 Enter your age
01
Exception in thread "main" InvalidAgeException: not eligible please wait for some time
      
	at About_throw.status(Userdefined_checkexception_parametrized.java:21)
        at About_throw.main(Userdefined_checkexception_parametrized.java:31)
*/
