/*Default constructor generation:
 constructor basic:-
 Test t = new Test ();
 Test = class name
 t = object name or reference variable
 = assignment operator
new = keyword used to create the object 
Test() = constructor
if do not declare atleat one constructor in the class 
it will automatically declare and call the default constructor.
jvm did not create the default constructor instead it execute it during runtime.
compiler will create the default constructor with zero parameter.
*there are two types of constructors- default and user defined.

*/
 
class Test
{
void m1()
{
System.out.println("m1------method");
}
/* default constructor
Test ()
{ 
 // empty impl
}
*/
public static void main(String []args)
{
 Test t= new Test();
t.m1();
}
}