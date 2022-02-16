// about main method
// if the main method is declared in the parent class only 
// child class is able to access parent  class main method (no problem).



class Parent 
{
final public static void main (String... args)
{
System.out.println("Parent class main method which is also accessible to child class also");
}
}
class Child extends Parent
{
// will call the parent class main method(static method overriding is not possible)
)
}

/*output:

F:\java by dragon\java programms>javac New33.java

F:\java by dragon\java programms>java Child
Parent class main method which is also accessible to child class also

F:\java by dragon\java programms>java Parent
Parent class main method which is also accessible to child class also

*/