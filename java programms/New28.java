/* Interface with Adaptor class(adaptor class are used when you want to write 
implmentations of required methods only but not all methods implementations)
Adaptor class: class which contains empty implementation of all interface methods
is knwon as adapter class.

*first declare all methods in interface
*then write the empty implementations({}) of all the interface methods into adaptor class
*now extends this adaptor class into a normal class 
*now you by using concept of overriding you can write the implementations of 
 required method only in this normal class and call the overriding methods using
 using the normal class objects
*/
 
interface Id
{
void m1(); 
void m2();
void m3();
void m4();
}
 
class X implements Id    // adaptor class 
{  
                       // write interfaces all methods implementations here
                       // have to maintain level of permissions
public void m1 () {}
public void m2 () {}
public void m3 () {}
public void m4 () {}


public static void main(String []args)
{
System.out.println("adaptor class");
}
}
         // have to maintain level of permissions

class T extends X      // now you able to write only required methods implementations here, not all methods implementations
{
public void m1()
{
System.out.println("interface method m1--> adaptor class -->normal class");
}
public void m2()
{
System.out.println("interface method m2--> adaptor class -->normal class");
}
public static void main(String []args)
{
T t= new T();
t.m1();
t.m2();
X x = new T();  // subtype polymorphism
x.m1();
x.m2();
}
}


/*output:

F:\java by dragon\java programms>javac New28.java

F:\java by dragon\java programms>java T
interface method m1--> adaptor class -->normal class
interface method m2--> adaptor class -->normal class
interface method m1--> adaptor class -->normal class
interface method m2--> adaptor class -->normal class
*/