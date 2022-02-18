//exception raised in finally block only 


class Must_block
{
public static void main (String []args)
{



try
{
System.out.println(10/0);  // exceptional code
}
          
               

catch (ArithmeticException ae)         // catch block didn't match the exception raised
{
System.out.println("enter correct value of divisor");
}
                                                               // as we know finally block is executed irrespective of try catch block
finally{System.out.println(10/0);}

}
}

/*output: try block raised the exception, corresponding catch block is exceuted
but exception raised by finally block and programme will terminate abnormally


F:\java by dragon\java programms\java exception handling>java Must_block

               // execution of catch block is here
enter correct value of divisor

Exception in thread "main" java.lang.ArithmeticException: / by zero
        at Must_block.main(Final_error.java:23)
*/