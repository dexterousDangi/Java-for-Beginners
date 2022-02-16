// all three constructor present are overloaded
// java didn't support operator overloading but the is one 
// operator which implicitly perform the operator overloading is "+" operator
// when all the argument present in sop statement is interger type it performs addition operation
// and if there is atleast one string argument present in s.o.p statement "concatination" is performed


class Method
{
Method(int a)
{
System.out.println("int constrctor");
}
Method(int a, int b)
{
System.out.println("int ,int constructor");
}
Method(char ch)
{
System.out.println("ch constructor");
}
public static void main(String []args)
{
 // call them using nameless approach, this is recommended approach
new Method(5);
new Method(3,5);
new Method('f');    // all three methods were overloaded.
System.out.println( 10+20);  // performs addition operation 
System.out.println("Pardeep"+"dangi"); // performs concatination
System.out.println("turiya"+10+3); // again performs concatination.

//how to avoid concatination by using parentheses or curved brackets " ()"
 System.out.println("mein"+2+"gya"+"bhai"+(10+65));

}
}


/* output:
F:\java by dragon\java programms>java Method
int constrctor
int ,int constructor
ch constructor
*/