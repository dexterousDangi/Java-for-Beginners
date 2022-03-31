// question on nested class as well as form interface:

 class Outer_class
{
public static void main(String []args)
{

 class Inner_class
{
public static String name="alpha";
}

Thread thread = new Thread(
new Runnable()
{
//override
public void run()
{
System.out.println(Inner_class.name);
}
}
                                );

thread.start();
}
}
/*output: here a normal inner class is printing static variable


F:\java by dragon\Java-for-Beginners\java programms\01 Exercises>javac Problem_related_to_threading_as_well_as_from_innerclass.java

F:\java by dragon\Java-for-Beginners\java programms\01 Exercises>java Outer_class

alpha
*/