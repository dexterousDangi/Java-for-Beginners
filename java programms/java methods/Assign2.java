// Assignment no.2

class Term1
{
int a = 12;
int b = 14;


void m1()
{
System.out.println("another static method "+b);
System.out.println("static method  " +a);
}
 void m2()
{
System.out.println("static method  " +a);
System.out.println("another static method "+b);
}

public static void main(String [] args)
{ 
Term t = new Term();
 t.m2();
t.m1();
}
}