// creation of user defined checked exception by using parameterized constructor approach:
// using parameterized constructor approach:
// about thorw keyword also

//step no.1 : create user defined exception
//step no.2 : use this in your application


class InvalidAgeException extends Exception
{
InvalidAgeException(String str)   // parameterized constructor
{
super(str);   // here we are calling super class constructor using super keyword.
               // to pass our values (str) to Exception class(super class)
}
}