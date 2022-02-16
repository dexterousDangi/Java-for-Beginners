// object creation for abstract class is not possible
// in abstract class we only declare the abstract methods 
// and write the implementation in the child classes
// we create the object of child class to implement the logic behind the abstract methods



abstract class Parent
{
abstract void m1();  // only declaration in the abstract class implementation in child class
abstract void m2();
abstract void m3();
void m4()
{
System.out.println("Abstract class normal method");
}
}
class Child extends Parent
{
void m1()
{System.out.println("m1 method");}

void m2()
{System.out.println("m2 method");}

void m3()
{System.out.println("m3 method");}

public static void main(String []args)
{
System.out.println("main method of child class ");
Child c = new Child();
c.m1();
c.m2();
c.m3();
c.m4();
Parent p= new Child();  // subtype polymorphism concept( previous topic)
p.m1();
p.m4();
}
}