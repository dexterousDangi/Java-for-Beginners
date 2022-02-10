//rule no.7 of overriding: case 1:-same level of modifier and same level of  permission
// we primarly use public,protected,private and default modifer in our application
/*
case 1: maintaining same level of permission


class Parent
{
void m1()
{
System.out.println("parent m1");
}
}
class Child extends Parent
{
void m1()
{
System.out.println("child m1");
}
public static void main (String []args)
{ System.out.println("child main method");
 new Child().m1();
}
}
*/

//case 2: you can't reduce the permission level in java though you can increase the level of 
//permission while going to parent to child class.

class Parent
{
protected void m1()  // protected modifiers can be accessed in same package and in the child class
{
System.out.println("parent m1");
}
}
class Child extends Parent
{
void m1()   // default modifier can be accessed in the same package only

{
System.out.println("child m1");
}
public static void main (String []args)
{ System.out.println("child main method");
 new Child().m1();
}
}


// here we are reducing the level of permission by going "protected" to "default"
/* output:
F:\java by dragon\java programms>Javac New16.java
New16.java:14: error: m1() in Child cannot override m1() in Parent
void m1()
     ^
  attempting to assign weaker access privileges; was protected
1 error
*/


// imp_*  increasing order of permission: private-> default->protected-> public modifier.
