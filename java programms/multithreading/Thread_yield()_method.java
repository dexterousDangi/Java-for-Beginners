//All about yield() method: this method behavious like the sleep method , but in this method if our thread
//our thread enters in sleep mode than there is no exit time provided by the programmer
// only thread schedular decides that when to wake up the corresponding thread

//If the thread executes the ‘yield’ function, the scheduler checks to 
//see if a thread with same or higher priority is present. If so, 
//the current thread is moved to runnable or ready state and 
//that thread is given processor resources or the cpu resources.

//public static native void yield();

class Mythread extends Thread
{
public void run()
{

Thread.yield();  // here the user defined should yield and let main thread access resources and finishes its execution.
for (int i=0; i<3 ; i++)
{

System.out.println("In control of " + Thread.currentThread().getName() + " thread");
}
}
}

class Thread_yield
{
public static void main(String[]args)
{
Mythread m1 = new Mythread();
m1.start();
for (int i=0; i<3; i++)
{
System.out.println("In control of " + Thread.currentThread().getName() + " thread");

}
}
}

/*output: when vve

F:\java by dragon\java programms\multithreading>java Thread_yield
In control of main thread
In control of main thread
In control of main thread
In control of Thread-0 thread
In control of Thread-0 thread
In control of Thread-0 thread

F:\java by dragon\java programms\multithreading>java Thread_yield
In control of main thread
In control of main thread
In control of main thread
In control of Thread-0 thread
In control of Thread-0 thread
In control of Thread-0 thread

F:\java by dragon\java programms\multithreading>java Thread_yield
In control of main thread
In control of main thread
In control of main thread
In control of Thread-0 thread
In control of Thread-0 thread
In control of Thread-0 thread

*/