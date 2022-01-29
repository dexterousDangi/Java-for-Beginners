/*
example no.7- regarding method or functionality
concatenation operation
*/

class Top
{ 
public static void main(String[]args)
{
Over o = new Over();
o.m1();
System.out.println("b");
}
}

class Over
{
int a =45, b=46,c=56;
void m1()  // in this method a single operator is performing two different task at same time.
             // operator perform concatenation and additon this is called operator overloading
          // operator having more than one behaviour that is called operator overloading concept in java.
      //java didn't support operator overloading yet it only accept '+'(addition) operators overloading only.
          // c++/c support operator overloading
{
System.out.println(a+"_____"+b+"_____"+c);// instead of three line of code use single line
System.out.println("Pardeep"+"Dangi");
System.out.println(12+65);
System.out.println(10+ "you" +07+"dangi");
}
}