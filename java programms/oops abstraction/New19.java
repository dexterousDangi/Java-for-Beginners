//abstract method(method without implementation)
// if a class contains abstract method or inherit the abstract method then 
// that class object can't be created because it automatically became a abstract class



abstract class Test
{
abstract void m1();  // only declaration in the abstract class implementation in child class
abstract void m2();
abstract void m3();
}
abstract class Test1 extends Test // contains 3 methods must provide three implementation "{}" of the methods
{
void m1()
{
System.out.println("not all method implemented, so this must be abstract class");
}
}
    // out of three, only one method is implemented, 
      // so class Test1 contains 2 abstract ( unimplemented) method so we have to declare
         // class Test1 as abstact class and finish the implementation in new class or you
      // have to declare another class as abstract also if implementation of all the method is not completed.

abstract class Test2 extends Test1  // contain 3 methods
{
void m2()
{
System.out.println("not all method implemented, so this class must be abstract class");
}
}
         // out of three only two were implemented here, so one abstract method(method without implementation)
           //still remains umimplemented, so class test2 have one abstract method
             // so we have to declare class Test2 as abstract class

class Test3 extends Test2 // contain 3 methods
{
void m3()
{
System.out.println("all methods were implemented");
}
public static void main(String []args)
{
Test3 t= new Test3();
t.m1();
t.m2();
t.m3();            // in this class test3 all methods have been implemented, no need to declare this class as abstract class
}
}  