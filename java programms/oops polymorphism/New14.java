// subtype polymorphism
 
class Parent 
{
void m1() //overriden method
{
System.out.println("parent class method");
}
}
 class Child extends Parent 
{
void m1()  // overriding method 
{
System.out.println("first child  class method");
}
void m2() //direct method
{
System.out.println("child class direct  method");
}
public static void main(String []args)
{
Parent p = new Child();
p.m1();  //compile time check: parent class referenc variable (that method is present in parent class yes, green light)
         // runtime check: object is created of child class that class method will be executed

//p.m2();         this statement will produce error becuse at compile time p.m1(), complier will check for the m2() method in 
                    // parent class because that class reference variable we provide during compiler time, it does'nt find that method
                    // as a result, error msg will be produced.
Child c= (Child) p;  // this process is called type casting(converitng parent class reference variable into the child type using (Child) p)
                     // and store the converted variable into reference variable of the child class using (child c=)


// now call the direct method m2() using object of child class
c.m2();

}
}

/*output:
F:\java by dragon\java programms>javac New14.java

F:\java by dragon\java programms>java Child
first child  class method
child class direct  method
*/