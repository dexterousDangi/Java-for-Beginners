// About try and catch block

// try block can't allowed independently , there has to be a catch block with try block
// catch block contains exception name(correctly spelled) 
// with its reference variable 
// no statement is allowed between try and catch block



class Print_catch_reference 
{
public static void main (String []args)
{
System.out.println(" hi dang");
System.out.println("hi world");
try{                          
System.out.println(10/0);         // if exception present in the try block execute the catch block
}

catch (ArithmeticException ae)
{
float a=(10/7);
System.out.println(ae);
System.out.println(a);
}
}
}
/*output:

F:\java by dragon\java programms\java exception handling>javac Trycatch3.java

F:\java by dragon\java programms\java exception handling>java Print_catch_refere
nce
 hi dang
hi world
java.lang.ArithmeticException: / by zero   // printing the value in reference variable(ae)
1.0
*/
  

/* not statement is allowed between try and catch block otherwise exception will occure
example2:



class Print_catch_reference 
{
public static void main (String []args)
{
System.out.println(" hi dang");
System.out.println("hi world");
try{                          
System.out.println(10/0);         // if exception present in the try block execute the catch block
}

float a=(10/7);

catch (ArithmeticException ae)
{
System.out.println(ae);
System.out.println(a);
}
}
}
*/


/*output  example 2:
^
Trycatch3.java:16: error: 'try' without 'catch', 'finally' or resource declarati
ons
try{
^
Trycatch3.java:22: error: 'catch' without 'try'
*/