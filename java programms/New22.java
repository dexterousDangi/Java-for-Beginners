/*when we implements the interface in some class, then  in that class you have
to write implementation of all the methods(which are public as well as abstract)
otherwise we have to decalre that class as "abstract class" because that class 
contains method of interface without implementation and which are abstract as well.\
*/


interface Id  // abstract in nature
{
void m1();   // public and abstract 
void m2();
void m3();
}



abstract class Test implements Id
{
public void m1()
{System.out.println("m1 method");}
   
     // if you didn't write  implementation  ({}) of all public and abstract method 
     // error will occur 



public static void main(String []args)
{
 System.out.println("abstract class main method");

//Test t = new Test();
//t.m1();
}
}
 
// we can't create object of a abstract class

/* 
output:

F:\java by dragon\java programms>javac New22.java
New22.java:2: error: class, interface, enum, or record expected
to write implementation of all the methods(which are public as well as abstract)
*/
 

// to overcome the above error you may implements all the methods or declare the above
// class as abstract


class Test1 extends Test
{

public void m2()
{System.out.println("m2 method");}

public void m3()
{System.out.println("m3 method");}

public static void main (String []args)

{

Test1  r = new Test1();

r.m1();

// we can also call methods using reference variable of interface(like subtype polymorphism)
  
Id i= new Test1();
i.m2();
i.m3();

}
}
// dont have to declare this class as abstract because all the methods were being implemented

/*output:

F:\java by dragon\java programms>javac New22.java

F:\java by dragon\java programms>java Test1
m1 method
m2 method
m3 method
*/

