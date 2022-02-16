// basic programme about the overriding concept

/* Method overriding concept :- it simply means that the implimentation of the parent class 
  were over ridden by the method present in the child class 
* for using overriding principle the has to be a inheritance relation between two classes
* for method overriding we need two class, a parent and a child class
* having same signature fro the method present in both the classes
*/


class Parent
{
int  marry ()   // overridden method
{
System.out.println("wrong girl");
return 66;
}

public static void main(String []args)
{
new Parent().marry();
}
}
class Child extends Parent
{
int marry ()   // overriding method
{
System.out.println("right girl");
return 5;
}
public static void main(String []args)
{
new Child().marry();
}
}

// both method return type statement is int here
//primitive type return type statement also has to same for the methods