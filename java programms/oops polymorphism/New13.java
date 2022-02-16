// java overriding concept
// rule no.2 : both method should have same return statement
// this problem is solved with the help of rule no.3: which says that 
// return statement must be same at primitive level
// but we can change the return type at the class level

/*
class Parent
{
S marry ()   // overridden method
{
System.out.println("wrong girl");
 return new S();
}
}
class Child extends Parent
{
T marry ()   // overriding method
{
System.out.println("right girl");
return new T();
}
public static void main(String []args)
{
new Child().marry();
}
}
class S{}
class T{}
*/


/*output:
F:\java by dragon\java programms>javac New13.java
New13.java:16: error: marry() in Child cannot override marry() in Parent
T marry ()   // overriding method
  ^
  return type T is not compatible with S
1 error
*/

 // the problem could be resolved just by extending S class into T class
//this concept is known as the co-varient return type concept

class Parent
{
S marry ()   // overridden method
{
System.out.println("wrong girl");
 return new S();
}
}
class Child extends Parent
{
T marry ()   // overriding method
{
System.out.println("right girl");
return new T();
}
public static void main(String []args)
{
new Child().marry();
}
}
class S{}
class T extends S
{}

/* output:
F:\java by dragon\java programms>javac New13.java

F:\java by dragon\java programms>java Child

right girl

*/