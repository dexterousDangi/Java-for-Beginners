class Parent 
{//instancd block
{
System.out.println("parent class instance block");
}
// parent class constructor
Parent()
{
System.out.println(" Parent class o - arg cons");
}
}

class Child extends Parent
{

// child class instance block

{
System.out.println("child class instance block");
}

// declare a child constructor here

Child()
{
// super(); compiler generated code super of

System.out.println(" child class o - arg cons");
}
public static void main(String []args)
{
new Child();  
new Child();

}
} 
// as we know the application contains Parent and Child relationship
// so parent class members are executed first
 /*
output:F:\java by dragon\java programms>java Child
parent class instance block
 Parent class o - arg cons
child class instance block
 child class o - arg cons
 
parent class instance block
 Parent class o - arg cons
child class instance block
 child class o - arg cons
*/