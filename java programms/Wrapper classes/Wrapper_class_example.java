//wrapper class concept: there are 8 wrapper classes for 8 premitive data types
// beacaus as we know java is a object oriented language everything in java is presented
// in form of objects, but these 8 premitives have no objects.
// so to satisfy the java's objects need , we uses these 8 wrapper class to 
//provide objects of these 8 premitive data types



/* 
data type	wrapper-class  		 constructors (parameter expecting)
 
byte		Byte class		 byte, string
short		Short class		 short, string	
int 		Interger class		 int, string	
double		Double class		 double, string 
long		Long class   		 long, string
Float		Float class		 doulble, float, string	
char		Character class		 char

*/


class Wrapper_example
{
public static void main(String []args) 

{
Integer i = new Integer(644);   // constructor expecting int value

Integer a= new Integer("687");   // constructor expecting string value

System.out.println("called by using constructor expecting int "+i);

System.out.println("called by using constructor expecting string "+a);

}
}



/*output:


F:\java by dragon\java programms\Wrapper classes>javac Wrapper_class_example.java

Wrapper_class_example.java:29: warning: [removal] Integer(int) in Integer has been deprecated and marked for removal

Integer i = new Integer(644);   // constructor expecting int value
            ^
Wrapper_class_example.java:31: warning: [removal] Integer(String) in Integer hasbeen deprecated and marked for removal

Integer a= new Integer("687");   // constructor expecting string value
           ^
2 warnings (because not a great choice of code or could have used other code statments to declare the intergers)

F:\java by dragon\java programms\Wrapper classes>java Wrapper_example

called by using constructor expecting int 644
called by using constructor expecting string 687
*/