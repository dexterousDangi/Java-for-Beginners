/* example containing all the elements of the class
i.e., variables, methods, constructors, instance block, static block.
*/
 
class Total
{
int a = 12;  //instance variable

static int b=3;  //static variable

void m1(int a)  //instance method
{
System.out.println("this is instance method..."+a);
} 

static void m2(String str) //static method
{ 
System.out.println("this is static method..."+str);
} 

Total()// a constructor
{
System.out.println("o-arg const.");
}

Total(int a) // one argu. constructor
{
System.out.println("one agru. const.");
}


// instance block
 {
System.out.println("instance block");
}
 // static block
static
{
System.out.println("static block");
}

public static void main(String []args)
{
Total t = new Total();
new Total(5);
t.m1(4);
Total.m2("dan go");
}
}
 // note: each time we create a object instance block is executed
// static blocks can only be run once at the .class loading time.
//static method were called using class name
// instance method were called using object refernce variable.
//each time we create a object constructor is also executed with instance blocks
