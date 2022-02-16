/*example no.3- passing the objects while calling 
a functionality or a method, object may be of another
class that belong to other modules of the application.
In real time methods were expecting objects not the primitive
data type
*/


class Teso
{
void m1(X x, Emp e)
{
System.out.println("m1 method");
}
static void m2( Y y, Student s)
{
System.out.println("m2 method");
}
public static void main(String []args)
{ 
Teso t = new Teso(); // to call the method we must creat a object

X x=new X();  //creating required object by various methods
Emp e1 =new Emp();// objects of different classes


t.m1(x,e1);  // expecting two arguments
         // create the required parameter before calling the method
         //creare the object and pass the reference variable here
         // here class name is important we can pass any variable
         // shortcut for above three lines of code, we can use
        //t.m1(new X(), new Emp());


Y y = new Y();
Student s = new Student();

Teso.m2(y,s);
            //instead of above three lines we can use the following code which we will learn in constructors
            //Teso.m2(new Y(), new Student());
}
}
/* in the real time these classes may belong to different 
modules, but in this basic example we are declaring required 
class here, and in the real time these class present on the 
different  module
*/

class X{}
class Emp{}
class Y{}
class Student{}
