// Assignment no.1

class Term
{
int a = 12;
int b = 14;


static void m1()
{Term t = new Term();
System.out.println("another static method "+ t.b);
System.out.println("static method  " + t.a);
}
static void m2()
{Term t = new Term();
System.out.println("static method  " + t.a);
System.out.println("another static method "+ t.b);
}

public static void main(String [] args)
{ 

 Term.m2();
Term.m1();
}
}