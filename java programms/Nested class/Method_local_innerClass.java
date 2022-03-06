// Method local inner classes:- this is sub part of the non-static nested classes
// these classes are declared with in the method only and scope of such classes are with in the method.
// we can also declare multiple inner classes inside the methods

// modifier accepted by outer classes: public, default, final, abstract, strictfp
// modifiers accepted by inner classes: public, default, final, abstract, strictfp, private, protected and static 

// Use a non-static nested class (or inner class) if you require access to 
// an enclosing instance's non-public fields and methods. Use a static nested class if you don't require this access.


// we can also declare the class inside a outer class mehtods forloop

class Outer
{ 
void m1()
{System.out.println("method m1() of outer class");
 
class Inner 
{
 void disp()
{
System.out.println("method local inner class");
}
}

class Inner1 
{
void disp1()
{
System.out.println("method local inner1 class");
}
}

class Inner2 extends Inner
{
void disp2()
{
System.out.println("method local inner2 class" );
Inner i= new Inner();
i.disp();
}
}


Inner1 i1= new Inner1();
i1.disp1();


Inner2 i2= new Inner2();
i2.disp2();

Inner i= new Inner();
i.disp();
}

public static void main(String [] args)
{
Outer o= new Outer();
o.m1();
}
}

/*output


F:\java by dragon\java programms\Nested class>javac Method_local_innerClass.java


F:\java by dragon\java programms\Nested class>java Outer

method m1() of outer class
method local inner1 class
method local inner2 class
method local inner class
method local inner class
*/