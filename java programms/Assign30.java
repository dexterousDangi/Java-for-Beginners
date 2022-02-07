/* multiple classes (class D, class B, class C)
class B and C were present  in same folder  
multiple static blocks
one main method present*/


class D
{
static 
{
System.out.println(" class D static block");
}
public static void main(String []args) throws ClassNotFoundException
{
Class.forName("B");
Class.forName("C");
}
}
// when we use forName() method , then main method is not required by the corresponding classes
