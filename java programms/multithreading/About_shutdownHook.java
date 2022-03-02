// About Hook thread : this thread is executed at the end  whenever jvm terminates
// either normally or abnormally(due to any system call or any system failure)


class Mythread extends Thread

{

public void run()
{
System.out.println("hook thread functionality");
}
}
class ThreadDemo56
{
public static void main(String []args)   // main thread

{
Mythread m1 = new Mythread();

Runtime r= Runtime.getRuntime();

r.addShutdownHook(m1);

for (int i=0; i<10; i++)
{
System.out.println("main thread");
try
{
Thread.sleep(1000);
}
catch(InterruptedException ie) 
{
ie.printStackTrace();
}/*
if (i==5)
{
System.exit(0);
}
*/
}
}
}
/*output:

F:\java by dragon\java programms\multithreading>javac About_shutdownHook.java

F:\java by dragon\java programms\multithreading>java ThreadDemo56
main thread
main thread
main thread
main thread
main thread
main thread
main thread
main thread
main thread
main thread
hook thread functionality

F:\java by dragon\java programms\multithreading>java ThreadDemo56
main thread
main thread
main thread
main thread
main thread
main thread
main thread
hook thread functionality
^C
*/