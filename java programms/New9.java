// parent class or super class static block and 

class Parent 
{
static  // static block
{
System.out.println("parent class static block");
}

{ // instance block 
System.out.println("instance block of parent class");
}

Parent()  // parent class constructor
{
System.out.println(" Parent class o - arg cons");
}
}


class Child extends Parent
{
// child class static block
static
{
System.out.println("child class static block");
}

{
// instance block
System.out.println("instance block of child class");
}
// child class consturctor
Child() 
{
System.out.println(" child class o - arg cons");
}
public static void main(String []args)
{
new Child();
new Child();  

}
}
//first static block are executed preference goes to parent class static block
// then instance blocks are executed
// and then comes the turn of constructors

/*
output:
F:\java by dragon\java programms>java Child
parent class static block
child class static block
Parent class o - arg cons
child class o - arg cons
*/

// when you added parent class instance block and child class instance block
/* output:
F:\java by dragon\java programms>java Child
parent class static block
child class static block
instance block of parent class
 Parent class o - arg cons  // this constructor is called by compiler's automatically generated super() keyword in the child class
instance block of child class
 child class o - arg cons
*/