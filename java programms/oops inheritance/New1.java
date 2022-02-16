/* Simple INHERITANCE: there are five types of inheritance
1) simple inheritance:- one child class , one parent class.
2) multi level inheritance
3) hierarchical inheritance: one parent class having multiple child class.
4) multiple inheritance : two parent class, one child class (not supported by java)
5) hybrid inheritance: combination of type of inheritance (not supported by java)
*/
// in java we can extends one class at a time.
// in java every class have parent class except "object class"
 
class A  // contains 2 methods
{
void m1(){System.out.println("m1 method");}
void m2(){System.out.println("m2 method");}
}
 
class B extends A  // three methods
{
void m3(){System.out.println("m3 method");}
}

 final class C  extends B //contains five methods
{
void m4(){System.out.println("m4 method");}
void m5(){System.out.println("m5 method");}
 
public static void main(String []arga)
{
A a = new A();
a.m2();
B b= new B();
b.m1();
C c = new C();
c.m3();c.m4();c.m1();



}
}
// to avoid inheritance of a particular class use "final" keyword.
// when you use the final keyword with a particular class then that class will not be able to child classes.

// it is recommended to create the object of child class

//after compilation three dot class files were created, call the class which contains main method.
