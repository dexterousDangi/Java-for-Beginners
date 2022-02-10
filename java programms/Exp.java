class Parent 
{
private void m1()
{
System.out.println("first private members  of parent class");
}/*
final void m2()
{
System.out.println("non-private members ");
}*/
}

 class Child extends Parent
{
private void m1()
{
System.out.println("first private members of child class ");
}
/*final void m2()  // overriding method 
{
System.out.println("second child  class method");
}*/
public static void main(String []args)
{
Parent p = new Child();
//p.m2();
p.m1();
}
}

// final methods can be overloaded but can't be overriden
// and private member are only accessible in the containing class only

/* output:

F:\java by dragon\java programms>javac Exp.java
Exp.java:15: error: m2() in Child cannot override m2() in Parent
void m2()  // overriding method
     ^
  overridden method is final
Exp.java:24: error: m1() has private access in Parent
c.m1();
 ^
2 errors
*/