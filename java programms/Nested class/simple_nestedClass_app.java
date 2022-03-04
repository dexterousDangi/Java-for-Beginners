// Nested classes: are of two type 
// static Nested class and non-static Nested class

// Non-static Nested class:  also known as inner class
// A) normal inner class / regular inner class / concrete inner class
// B) Method-Local inner class
// C) Anonymous inner class


// A.) Normal Inner class: which is a non-static inner class


class Outer
{
int a =9, b=89;
void m1()
{
System.out.println("outclass--->" + (a+b));
}

class Inner
{
int x=99, y=34;
void m2()    		// Inner class methods can access outer class methods
{
System.out.println("Inner class--->"+ (x+y));
}
}
public static void main(String [] args)
{ 
Outer o = new Outer();
o.m1();
Outer.Inner i = o.new Inner();
i.m2();
}
}





/*
class Topclass
{
public static void main(String [] args)
{ 
Outer o = new Outer();
o.m1();
Outer.Inner i = o.new Inner();
i.m2();
}
}
*/ 


/*output:


F:\java by dragon\java programms\Nested class>javac simple_nestedClass_app.java

F:\java by dragon\java programms\Nested class>java Topclass

outclass--->98

Inner class--->133


F:\java by dragon\java programms\Nested class>java Outer

outclass--->98

Inner class--->133

*/