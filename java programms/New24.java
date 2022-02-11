// Nested Interface : declaring interface inside interface is knwon as nested interface
 
interface Id1
{
interface Id2  // this is nested interface(Id2)
{
void m1();
void m2();
}
}

class Nest implements Id1.Id2
{
public void m1()    
{
 System.out.println("m1 method of nested interface");
}
public void m2()
{
 System.out.println("m2 method of nested interface");
}
 // overrided two interface methods

public static void main(String []args)
{
Nest n = new Nest();
n.m1();
n.m2();
 Id1.Id2 i= new Nest();
i.m1();
}
} 

// note:- you can call nested interface overrided method using subtype ploymorphism
// syntax " Id1.Id2 i= new Nest();" call the respective method using "i" object.