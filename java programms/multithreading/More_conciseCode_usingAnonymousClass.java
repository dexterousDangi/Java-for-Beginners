// making code more concise with the help of anonymous inner classes and nameless object creation and directly calling the start metohd.
// this file is replica of Using_AnonymousClass_inMultithreading.java

class ThreadDemo
{
public static void main(String []args)
{


new Thread()
{  			
public void run()
{
System.out.println("Ist user defined thread");
System.out.println(Thread.currentThread().getName());
}
}.start();   
new Thread ()
{
public void run()
{
System.out.println("2nd user defined thread");
System.out.println(Thread.currentThread().getName());

}
}.start();
System.out.println("inside main thread");
System.out.println("under control of--->  "+Thread.currentThread().getName());

}
}

/*output:


F:\java by dragon\java programms\multithreading>javac More_conciseCode_usingAnonymousClass.java

F:\java by dragon\java programms\multithreading>java ThreadDemo

Ist user defined thread
Thread-0
inside main thread
2nd user defined thread
Thread-1
under control of--->  main

F:\java by dragon\java programms\multithreading>java ThreadDemo

Ist user defined thread
Thread-0
2nd user defined thread
inside main thread
Thread-1
under control of--->  main

*/
