// various ways of printing exception informations
// there are 3 ways to do so
// using 'printStackTrace()', using 'getmessage()' and by using 'toString()'.


class Tap
{
void m1()
{
m2();
}
void m2() 
{
m3();
}
void m3()
{
try
{
System.out.println(10/0);
}
catch (ArithmeticException ae)
{
System.out.println(ae.toString());
System.out.println(ae);
                       // both are same


System.out.println(ae.getMessage());  // just to tell you the exception message


ae.printStackTrace();     // most recommended approach 
                          // tell you about all the stack information and exception as well
}
} 
public static void main(String []arg)
{
new Tap().m1();
} 
}

/*output:

F:\java by dragon\java programms\java exception handling>javac Print_exception.j
ava

F:\java by dragon\java programms\java exception handling>java Tap
java.lang.ArithmeticException: / by zero
java.lang.ArithmeticException: / by zero
/ by zero
java.lang.ArithmeticException: / by zero
        at Tap.m3(Print_exception.java:20)
        at Tap.m2(Print_exception.java:14)
        at Tap.m1(Print_exception.java:10)
        at Tap.main(Print_exception.java:32)
*/