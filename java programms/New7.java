class Parent 
{//instancd block
{
System.out.println("parent class instance block");
}
}
class Child extends Parent
{
// child class instance block
{
System.out.println("child class instance block");
}
public static void main(String []args)
{
new Child();  

}
}
// during object creation first parent class instance block executed then 
// child class constructor is executed.



/*output:

F:\java by dragon\java programms>java Child
parent class instance block
child class instance block
*/