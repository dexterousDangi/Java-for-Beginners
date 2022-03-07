// usage of Anonymous inner classes within multithreading concept
// help us to reduce the length of code , increase readablity, increase maintainablity
// we dont have to create the extra classes

// but there is one small limitation with this approach i.e., we can't call the same thread twice
// jvm will throw an exception: "IllegalThreadStateException".

/* case 1:   application without anonymous inner classes
  ----------
class Mythread1 extends Thread
{
public void run()
{
//logic here
}
}

class Mythread2 extends Thread
{
public void run()
{
//logic here
}
}


class ThreadDemo
{
public static void main(String []args)
{
// main thread logics 
// and calling user defined threads
}
}

*/


//case 2: application using anonymous inner class
//-------


class ThreadDemo
{
public static void main(String []args)
{
   			// directly create the object of thread class here
 Thread t1= new Thread()
{  			// this does'nt create the object of thread class, but this 
			// will create the nameless inner class which will override the run() method.
			//use t1.getClass().getName() to get the name less innre class name

public void run()
{
System.out.println("Ist user defined thread");
System.out.println(Thread.currentThread().getName());
}
};   // semicolon is mandatory is here, this will tell compiler we are using anonymous inner class

Thread t2 = new Thread ()
{
public void run()
{
System.out.println("2nd user defined thread");
System.out.println(Thread.currentThread().getName());

}
};   // semicolon is mandatory is here

t1.start();
t2.start();

System.out.println("inside main thread");
System.out.println("under control of--->  "+Thread.currentThread().getName());

}
}


/*output:

F:\java by dragon\java programms\multithreading>javac Using_AnonymousClass_inMultithreading.java

F:\java by dragon\java programms\multithreading>java ThreadDemo

Ist user defined thread
2nd user defined thread
Thread-1
inside main thread
Thread-0
under control of--->  main

F:\java by dragon\java programms\multithreading>java ThreadDemo

Ist user defined thread
2nd user defined thread
inside main thread
Thread-1
Thread-0
under control of--->  main

*/




