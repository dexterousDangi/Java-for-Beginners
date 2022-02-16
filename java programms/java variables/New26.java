// variable inside the interface: are by default public, static and final(can't re-assign the values)


interface Id
{ 
int a=12;   // by default public, static and final
void m1();  // by default  public, abstract 
}

// while overriding a method you always take care of the level of permission inside the parent class as well as in the child class
// you can increase the level of permission or you can maintain the same level of permission
// but you can't decrease the level of permission.
  

class Test implements Id
{

 void m1()  // assign this method as public
{
a = a+124;  // here you can't re-assign value to a final variable or 
            // say you can't assign value to a interface variable into implementing class (as they are "final")

System.out.println(" final variable of the interface id"+ a);
}
 public static void main(String []args)
{
Test t= new Test();
t.m1();
}
}


/*

F:\java by dragon\java programms>javac New26.java
New26.java:18: error: m1() in Test cannot implement m1() in Id
 void m1()
      ^
  attempting to assign weaker access privileges; was public
New26.java:20: error: cannot assign a value to final variable a
a = a+124;
^
2 errors
*/