/*class Parent 
{
 void m1()
{
System.out.println("parent class method");
}
}
class Child extends Parent
{
 void m2()
{
System.out.println("child class method");
}
 void m3()
{
m1();
m2();
}
public static void main (String []args)
{
new Child().m3();
}
}
output:
F:\java by dragon\java programms>java Child

parent class method
child class method
*/


// problem arises when both the class  methods have same name.
/*
class Parent 
{
 void m1()
{
System.out.println("parent class method");
}
}
class Child extends Parent
{
 void m1()
{
System.out.println("child class method");
}
 void m2()
{
m1();
m1();
}
public static void main (String []args)
{
new Child().m2();
}
} 
// complier will not be able to distingush between the methods
output:
child class method
child class method
*/


//to over come such problem we use this and super keyword to compiler let know about the methods


class Parent 
{
 void m1()
{
System.out.println("parent class method");
}
}
class Child extends Parent
{
 void m1()
{
System.out.println("child class method");
}
 void m2()
{
this.m1();
super.m1();
}
public static void main (String []args)
{
new Child().m2();
}
} 
  

/*output
child class method
parent class method


to specify the parent class method use 'super' keyword
to specify the child class method use 'this' keyword
*/


































