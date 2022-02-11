interface Id   //by default abstract
{             

             // every method/functionality in interface is by default public and abstract
               // you don't have to declare it 

void m1();   //by default abstract and public
void m2();   //by default abstract and public
void m3();
  
} 

/* In interface we only declare methods/functionalities
to write implementation use 'implementation class'
implementation class is nothing but class which writes the 
implementtation of the interface. And implementation class is
nothing but overriding concept
*/


// syntax of implementing class(where implementation were written) be like
// " class class_name implements interface_name"


class Test implements Id
{
 // just override the interface methods here

public void m1()
{
System.out.println("interface functionality/method no.1");
}
public void m2()
{
System.out.println("interface functionality/method no.2");
}
public void m3()
{
System.out.println("interface functionality/method no.3");
}
public static void main (String []args)
{
Test t = new Test();
t.m1();
t.m2();
t.m3();
}
}
 /* intitally we know that method in interface is public and abstract
but the implementation class did'nt know about it
so please declare method as public in implementation class*/ 




/* output:

F:\java by dragon\java programms>java Test
interface functionality/method no.1
interface functionality/method no.2
interface functionality/method no.3
*/
