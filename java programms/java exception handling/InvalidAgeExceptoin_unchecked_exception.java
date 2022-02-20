/*2) user defined un-checked exception- there is also two approach to create such exceptions

a) default constructor approach

b) parameterized constructor approach
*/

// parameterized constructor approach is here:

// create a user defined un-checked exception using "extends RuntimeException" class.
  

class InvalidAgeException extends RuntimeException
        // now it become unchecked exception class (by extending RuntimeException class)

{
InvalidAgeException(String str)
{
super(str); 
}
}

/*output: having no error

F:\java by dragon\java programms\java exception handling>javac User-defined-unch
ecked_exception.java

*/