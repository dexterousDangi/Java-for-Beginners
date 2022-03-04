// it is possible to declare the constructors, instance blocks and static blocks 
// inside the outer class

// it is possible to declare the constructors, instance blocks only inside the inner classes

// at first static block , then instance block, then constructor are executed alwyas

// static declerations are not allowed inside the inner class (that's why we don't use main method inside the inner classes)
// only variables can be declared as static with the final modifier only 
// bcz inner class can accept constant variables with static modifiers


class Outer
{
Outer()  // constructors
{
System.out.println(" outer class constructors");
}
{  // instance block inside outer class
System.out.println("outer instance block");
}
static{   // static block inside the outer class
System.out.println("static block inside the outer class");
}

class Inner
{
Inner()
{
System.out.println("inner class constructor");
}
{ // instance block inside the inner classes
System.out.println(" instance block inside the inner class");
}
}

public static void main(String []args)
{

//Outer o= new Outer();
// Inner i = new Inner();

new Outer().new Inner();
}
}

/* output:

F:\java by dragon\java programms\Nested class>javac "various _aspect_of_inner&outer_class.java"

F:\java by dragon\java programms\Nested class>java Outer

static block inside the outer class
outer instance block
outer class constructors
instance block inside the inner class
inner class constructor
