// About exception: three type of exception
// checked , unchecked and error (these are three type of execption acc. to sunmicrosoft standard)
// excepiton handling is consist of  try, catch ,finally , throw and throws keywords
// exception is handled using try-catch block or by throws keyword

// exception which compiler unable to catch and jvm catch them during runtime are called unchecked exception

class Uncheck
{
public static void main (String []args)
{
System.out.println("st1");
System.out.println("st2");
System.out.println(10/0);  // airthmetic exception

              // rest of code is not executed due to unchecked exception

System.out.println("st3");
System.out.println("st4");
}
}

/*output:

F:\java by dragon\java programms\java exception handling>javac Uncheck.java
                                                                           // here compiler is unable to check for the exception  
F:\java by dragon\java programms\java exception handling>java Uncheck
st1
st2

Exception in thread "main" java.lang.ArithmeticException: / by zero
        at Uncheck.main(Uncheck.java:14)

*/