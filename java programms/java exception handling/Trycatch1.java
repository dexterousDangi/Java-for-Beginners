// usage of try-catch block
// try block contains exceptional code, catch block contains alternative code.
// if exception occure in the try block, corresponding catch block is executed 
// and program will terminate normally.

// example 1 using try catch block


//    code with out try-catch block

class Trycatch
{

public static void main(String [] args)
{
System.out.println("tuff gong");
System.out.println("tuff gong");
System.out.println(10/0);
                                 // after this code is not executed because of exception
System.out.println("tuff gong");  
System.out.println("tuff gong");
 }
}     // programme will terminate abnormally


/*output:

F:\java by dragon\java programms\java exception handling>java Trycatch
tuff gong
tuff gong
Exception in thread "main" java.lang.ArithmeticException: / by zero
        at Trycatch.main(Trycatch1.java:18)
*/



 // code with try-catch block
// exception raised catch block is matched


class Handle
{
public static void main(String[] args)
{

System.out.println("tuff gong");
System.out.println("tuff gong");

 try       // try block contains exceptional code, which may cause exception    
{
System.out.println(10/0);
}

catch(ArithmeticException ae)          // catch block contains alternative code, which we execute after exception occure
{
System.out.println(10/1);
}
                 // to handle the exception we must know before 
                 // which kind of error may occure and spell it 
                  // correctly in the catch block with its reference variable
            

System.out.println("tuff gong");
System.out.println("tuff gong");
}
}

// programme will terminate normally
/*output:

F:\java by dragon\java programms\java exception handling>java Handle
tuff gong
tuff gong
10
tuff gong
tuff gong

*/

 












  