// example 3 : if the try block didn't raise any exception 
// then the try block code is exceuted not the corresponding 
// catch block 		
  

class Tryonly
{
public static void main(String []args)
{
System.out.println("dangi1 only");					
System.out.println("dangi2 only");
try {
  System.out.println("try block without error");
System.out.println("dangi3 only");
System.out.println("dangi4 only");
}
catch (ArithmeticException noo )  // exception provided in the catch block must be correctly spelled
{
System.out.println("execute the catch block ");
System.out.println("if error found");
}
}
}   

/*output:

F:\java by dragon\java programms\java exception handling>java Tryonly
dangi1 only
dangi2 only
try block without error
dangi3 only
dangi4 only
*/