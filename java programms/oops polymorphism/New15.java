// rule no.5, case 2: static method overriding
// concept also known as method hiding concept

class Parent 
{
static void m1() //overriden method
{
System.out.println("parent class method");
}
}
 class Child extends Parent 
{
static void m1()  // overriding method 
{
System.out.println("first child  class method");
}

public static void main(String []args)
{
Parent p = new Child();
p.m1();
}
} 

// what is desireable result : first child class method
// output is different here because "static method are specific to class
// but not specific to object. here in this application object is created for class child
// and in p.m1(), p is parent class reference type variable so m1() method of parent class will be printed.

/*output:
F:\java by dragon\java programms>javac New15.java

F:\java by dragon\java programms>java Child

parent class method
*/

//Parent p = new Child(); we are using this statement to show that overriding is not permitted for static method
// it is called method hiding for static methods.

// now we can say that the "overriding of the "static method" in java is not permitted".
