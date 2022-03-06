// Static Nested classes:- 
//-------------------------    such classes can only access static members of the 
// outer class only, but normal inner classes can access both static and instance 
// variables of the outer class.

// we can also declare the "main method" and static blocks inside the static nested classes
// object creation syntax: no new key word required just tell the comipler about inner class

// outer.inner i = new outer().new inner(); (for normal inner classes)

// outer.inner i= new outer.inner(); (for static nested classes)


class Outer
{
static int a=10;
static int b=34;
int c=345;

static class Inner1
{
void disp()
{
System.out.println(a);
System.out.println(b);
}
public static void main(String [] args)
{
System.out.println("static nested class main method");
new Outer.Inner1().disp();
}
}
public static void main(String [] args)
{
System.out.println("outer class main method");
System.out.println(a);
System.out.println(Outer.b);
System.out.println(new Outer().c);
new Outer.Inner1().disp();
}
}

/*output:


F:\java by dragon\java programms\Nested class>javac Static_Nested_class.java

F:\java by dragon\java programms\Nested class>java Outer

outer class main method
10
34
345
10
34

F:\java by dragon\java programms\Nested class>java Outer$Inner1

static nested class main method
10
34
*/