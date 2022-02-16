/* if method return type is same as the present class
returning same class type, in which we are working
for such solution we use "This" keyword .
"this" keyword also represent current class object.

Way to return the current class object as the return value.

*/
 
// when class name is same as the return type of the methods

class Main
{ 
Main m1() // there are two ways to return the value, first by creating object and then return the value
{
Main m= new Main();
System.out.println("in the m1 method");
return m;

}
Main m2() // other way to return the value is to return the "this" keyword
{
System.out.println("in the m2 method");
return this;
}
public static void main(String []args)
{ 
Main mt=new Main();
mt.m1();
mt.m2();
System.out.println("main method");
}
}
