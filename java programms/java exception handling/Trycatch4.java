// about try catch block
// once the control comes out of the try block 
// control never returns back to the try block
// if there is some code after the exceptional code present
// in the try block , it will go unexecuted
// because whenever exception raised the control jumps to 
// corresponding catch block and catch block is executed.
// remaining code in the try block go in vein.

class Control_jump 
{
public static void main (String []args)
{
try{
System.out.println(10/0);    
   // from here control jumps directly into the catch block
    // rest two line of try block will go unexecuted.
System.out.println(" hi dang");
System.out.println("hi world");                         
        
}

catch (ArithmeticException ae)
{
float a=(10/7);
System.out.println(ae);
System.out.println("rest will be done");
}

System.out.println("rest of the code");
}
}



/* output:

F:\java by dragon\java programms\java exception handling>javac Trycatch4.java

F:\java by dragon\java programms\java exception handling>java Control_jump

java.lang.ArithmeticException: / by zero   // printing reference variable
rest will be done
rest of the code

*/