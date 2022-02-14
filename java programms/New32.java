// about main methods
// is it possible to overload the main method---Yes

class Pa 
{
public static void main (String... args)
{
main(07);  
System.out.println("class main method");
}
public static void main (int a )
{
main('d');
System.out.println(" int type main method");
}
public static void main (char ch)
{
System.out.println(" char type main method");
}
}


// static methods can be called using their names directly(no object needed for calling)


/*output:

F:\java by dragon\java programms>javac New32.java

F:\java by dragon\java programms>java Pa
 char type main method
 int type main method
class main method
*/