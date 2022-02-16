// Assignment no.1

class Term
{
int a = 12;
int b = 14;


static void m1()
{
Term t = new Term();
System.out.println("another static method "+ t.b);
System.out.println("static method  " + t.a);
}

// when ever method is completed, object is destroyed.

static void m2()
{Term t1 = new Term();
System.out.println("static method  " + t1.a);
System.out.println("another static method "+ t1.b);
}

public static void main(String [] args)
{ 

 Term.m2();
Term.m1();
}
}