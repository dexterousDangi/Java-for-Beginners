// one with finally block (Exception handling)
// finally block is always executed irresptive of try catch block exceptions
// program terminates normally or abnormally , finally block will exceuted always




class Must_ex_block
{
public static void main (String []args)
{



try
{
System.out.println("hi durga".charAt(43));  // exceptional code
}
          
               

catch (ArithmeticException ae)         // catch block didn't match the exception raised
{
System.out.println("enter correct value of divisor");
}
                                                               // as we know finally block is executed irrespective of try catch block
finally{System.out.println("finally always executed");}

}
}
  /*
output: program will  terminates abnormally after executing the finally block


F:\java by dragon\java programms\java exception handling>javac finally_block.java

F:\java by dragon\java programms\java exception handling>java Must_ex_block

finally always executed

Exception in thread "main" java.lang.StringIndexOutOfBoundsException: String ind
ex out of range: 43
        at java.base/java.lang.StringLatin1.charAt(StringLatin1.java:48)
        at java.base/java.lang.String.charAt(String.java:1512)
        at Must_ex_block.main(finally_block.java:15)*/
