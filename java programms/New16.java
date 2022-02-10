//rule no.7 of overriding: case 1:-same level of modifier and same level of  permission
// we primarly use public,protected,private and default modifer in our application


class Parent
{
 protected void m1()
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