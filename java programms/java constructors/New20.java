// how to access constructor of abstract class.



abstract class Test
{
Test()   // abs class constructor
{
System.out.println("abstract class constructor");

}

abstract void m1();  //abstract method(only declaration allowed),(implementation in child class)
                        // overriden method

public static void main(String []ar) // to call this method use "java Test" during runtime

{

System.out.println(" this is parent class main method");

} 
}

// "to call the abstract class constructor" and 
//"to implement abstract method" we need a child class

class Test1 extends Test
{
Test1()
{
 super();  // we are using this "super();" keyword to call parent class constructor
            // because parent class is abstract class we can't create the object of a abstract class

System.out.println("child class constructor");
}

// override the "abstract void m1()" other wise you have to decalre this class as abstract class.
 
void m1()  // overriding method 
{
 System.out.println(" overriding abstract class method into child class");
}

public static void main(String []ar)
{
new Test1().m1();
 System.out.println(" this is child class main method");
}
}

/* output:

F:\java by dragon\java programms>java Test1
abstract class constructor
child class constructor
overriding abstract class method into child class
this is child class main method
*/