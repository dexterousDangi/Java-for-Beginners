/* for each object creation, the corresponding constructor is going 
be executed. this is not the case for the "instance blocks". instance blocks
remain common for every object created. and instance block get executed 
every time when ever oject is created.*/
 
class Hush
{
Hush()
{
System.out.println("0- argument const.");
}
Hush(int a)
{
System.out.println("1-argument constru.");
}
Hush (int a, int b)
{
System.out.println("2-argument constr.");
}

// declare 2 instance blocks here 
 
{
System.out.println("first block");
}


{ 
System.out.println("second block");
}

public static void main(String []args)
{
new Hush();
new Hush(9);
new Hush(7,33);
}
}
// here each constructor get executed for once 
// while instance blocks get executed every time object is created 
// instance blocks were executed for all the three times