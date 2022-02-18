// Yes, it is possible to declare the try block with finally block
// without the catch block


class Must_block
{
public static void main (String []args)
{
try
{
System.out.println("try block without catch block");
}               
finally{
System.out.println("finallly block");
}

}
}

/*output:


F:\java by dragon\java programms\java exception handling>javac tryandfinally.java


F:\java by dragon\java programms\java exception handling>java Must_block

try block without catch block

finallly block
*/