// assignment no.3

//Ratna5256@gmail.com
 class Test
{
 int a = 12;
int b = 21;
static int c = 23;
static boolean d= true;
void m1()
{Test t = new Test();
System.out.println("this is isntance area "+ t.a);
System.out.println(t.b);
System.out.println(Test.c);
System.out.println(Test.d);
}
static void m2()
{Test t = new Test();
System.out.println("this is static area"+ t.a);
System.out.println(t.b);
System.out.println(Test.c);
System.out.println(Test.d);
}
public static void main(String []args)
{Test t = new Test();
t.m1();
Test.m2();
}
}

