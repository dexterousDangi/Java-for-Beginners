//Inner class can access methods of outer class 

//when we decalre any method private, in entire java it means that only one class can access it but, we
// can also access private properties of outer class



class Outer
{
private int a =9, b=89;
void m1()
{
System.out.println("outclass--->" + (a+b));
}

class Inner      // inner class
{
int x=99, y=34;
void m2()    		// Inner class methods can access outer class methods
{
System.out.println("Inner class--->"+ (x+y));

m1(); 	// calling outer class method inside the inner class

System.out.println("sum of private properties of outer class"+(a+b));
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


// we can also use third class to call the outer class and inner class objects
/*Class Test
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



/* 
output:

F:\java by dragon\java programms\Nested class>javac "Inner_using_private().java"


F:\java by dragon\java programms\Nested class>java Outer

outclass--->98
Inner class--->133
outclass--->98
sum of private properties of outer class98
