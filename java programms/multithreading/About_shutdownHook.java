// About Hook thread : this thread is executed at the end  whenever jvm terminates
// either normally or abnormally(due to any system call or any system failure)
// to create the hook thread we have to use Runtime class's addshutdownHook() mehtod.

// runtime class is used to provide access to the java runtime system
// this class has only one  instance and we also can't create the instance for this class
// only one instance is available for one java application
// to get the runtime class instance , we use
// Runtime.getruntime(); method,
// and using this instance we use the Runtime class's
//addshutdownHook() method 

class Mythread extends Thread

{

public void run()  // hook thread
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
					// only way to get the runtime class instance
					// using Runtime.getRuntime() mehtod.

r.addShutdownHook(m1);       
				// using instance of Runtime class only
				// we can call the runtime class's addshutdownHook() method.

for (int i=0; i<10; i++)
{
System.out.println("main thread");
try
{
Thread.sleep(1000);   // while sleep ,  a thread can be interrupted , so complier will throw the InterruptedException
}
catch(InterruptedException ie) 
{
ie.printStackTrace();
}
/*
if (i==5)
{
System.exit(0); 
			 // when we add this block of code into the program 
			// jvm will be terminate abnormally and hook thread will be executed 
			// just before the termination of the jvm.
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

// output when we use ctrl+c
		      -------
	
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

// output when we use if block and at i=5, jvm will be shutdown abnormally

F:\java by dragon\java programms\multithreading>java ThreadDemo56
main thread
main thread
main thread
main thread
main thread
main thread
hook thread functionality
*/