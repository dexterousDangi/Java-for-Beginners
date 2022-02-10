//Abstraction : for abstracted class it is not possible to create the object of the abstract class



abstract class Parent
{
protected void m1()  // protected modifiers can be accessed in same package and in the child class
{
System.out.println("parent m1");
}
void m2();
public static void main(String []args)
{
System.out.println("main method of abstract class ");
Parent p= new Parent();
}
}

/* output:
F:\java by dragon\java programms>javac New17.java
New17.java:7: error: missing method body, or declare abstract
void m2();
     ^
New17.java:11: error: Parent is abstract; cannot be instantiated
Parent p= new Parent();
          ^
2 errors
*/