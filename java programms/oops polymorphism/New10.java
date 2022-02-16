// Method overloading in java
// method overloading means having same method names but have different method signatures.
  

class Method
{
void m1(int a)
{
System.out.println("int m1 method");
}
void m1(int a, int b)
{
System.out.println("int ,int m1 method");
}
void m1(char ch)
{
System.out.println("ch m1 method");
}
public static void main(String []args)
{
Method m = new Method();
m.m1(5);
m.m1(3,5);
m.m1('f');    // all three methods were overloaded.
}
}

/*output:
F:\java by dragon\java programms>java Method
int m1 method
int ,int m1 method
ch m1 method
*/