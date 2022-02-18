// About Try and multiple catch block
// a application can have only one try block with 
// multiple catch block. and this is recommended approach

//StringIndexOutOfBounds Exception
//Arithmetic Exception




import java.util.Scanner;
class Multiple_catch 
{
public static void main (String []args)
{

System.out.println("Enter a no. which will divide 1056");
Scanner s= new Scanner(System.in);
int q=s.nextInt();


try
{
System.out.println(("result only provide quosent...") +1056/q);              // exceptional code

System.out.println("hi durga".charAt(43));  // exceptional code
}
catch(ArithmeticException aw)  // correct exception spelling with its reference variable
{
System.out.println("You have entered incorrect no.");
}
catch(StringIndexOutOfBoundsException se)
{
System.out.println("incorrect index no. entered");
}
}
}

/*output:

F:\java by dragon\java programms\java exception handling>java Multiple_catch

Enter a no. which will divide 1056

10

result only provide quosent...105

incorrect index no. entered

*/

// if compiler found exception in first statement then first catch block is
// executed and second statement in the try block goes without execution
// as well as the second catch block
// we can say that the only one catch block is executed at a time 