//accessing abstract class instance and static blocks using inheriatnce


abstract class T
{
//instance block
{System.out.println("instance block of parent class");}
//static block
static {System.out.println("static block of parent class");}
T f=new T();
}
class T1 extends T
{
public static void main(String []args)
{
new T1();
}
}