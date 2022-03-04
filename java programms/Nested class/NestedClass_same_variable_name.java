// if all the variables have same names, then priority always goes to local variables


// local variables can be used directly
// current class variables used with "this" keyword
// and outer class variables used "class_name.this.variable_name"

/*
class Outer
{
private int a =9, b=89;
void m1()
{
System.out.println("outclass--->" + (a+b));
}

class Inner      // inner class
{
int a=99, b=34;
void m2(int a,int b)    		// Inner class methods can access outer class methods
{
System.out.println("Inner class--->"+ (a+b));
System.out.println(a+b);  // inner class variables
System.out.println(a+b);   // outer class variables
}
}
public static void main(String [] args)
{ 
new Outer().new Inner().m2(3,32);
}
}*/
/*output:

F:\java by dragon\java programms\Nested class>javac NestedClass_same_variable_name.java

F:\java by dragon\java programms\Nested class>java Outer
Inner class--->35
35
35
*/

// then how to distinguish whose variable we have print 


// local variables can be used directly
// current class variables used with "this" keyword
// and outer class variables used "class_name.this.variable_name"

class Outer
{
private int a =9, b=89;
void m1()
{
System.out.println("outclass--->" + (a+b));
}

class Inner      // inner class
{
int a=99, b=34;
void m2(int a,int b)    		// Inner class methods can access outer class methods
{
System.out.println("Inner class--->"+ (a+b));
System.out.println(this.a+this.b);  // inner class variables
System.out.println(Outer.this.a + Outer.this.b);   // outer class variables
}
}
public static void main(String [] args)
{ 
new Outer().new Inner().m2(3,32);
}
}

/*
output:


F:\java by dragon\java programms\Nested class>javac NestedClass_same_variable_name.java

F:\java by dragon\java programms\Nested class>java Outer

Inner class--->35
133
98

*/
