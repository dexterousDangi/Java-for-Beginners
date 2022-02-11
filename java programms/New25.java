// Interface: we can also declare interface inside the class .

class A
{
interface Id
{ 
void m1();
}
}

class B implements A.Id
{
public void m1()   // always declare interface overriding method as public
{ 
System.out.println("method inside interface which is inside a class");
}
public static void main(String []args)
{
B b=  new B();
b.m1();
A.Id i= new B();   // subtype polymorphism calling
i.m1();
}
}

/*output:

F:\java by dragon\java programms>javac New25.java

F:\java by dragon\java programms>java B
method inside interface which is inside a class
method inside interface which is inside a class

*/