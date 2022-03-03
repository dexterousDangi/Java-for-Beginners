// creating a thread class using Runnable interface: if you want to create a thread 
/* using Runnable interface then , first implement Runnable interface into the normal
  java class so that it became a thread class. when we implements Runnable interface
  it means that you want to execute this class using a thread.


  Runnable interface contains only one method inside it, and it is empty.

  Runnable provides the means for a class to be active while not 
  subclassing Thread. A class that implements Runnable can run without 
  subclassing Thread by instantiating a Thread instance and passing itself 
  in as the target. In most cases, the Runnable interface should be used if
   you are only planning to override the run() method
  and no other Thread methods. This is important because classes 
  should not be subclassed unless the programmer intends on modifying or
  enhancing the fundamental behavior of the class.
*/


class MyRunnable implements Runnable 
{
public void run()  // overriding run
{
for (int i=1; i<=7;i++)
{
System.out.println("undercontrol of--->"+Thread.currentThread().getName()+"  "+i+"  times");
}
}
}

class Thread_using_runnable
{
public static void main(String []args)
{
MyRunnable m1 = new MyRunnable();  // instantiating a Thread instance
				// this class does'nt have start() method nor the Runnable interface

				// so, how do we start the thread

			//passing itself in as the target thread in the constructor of Thread as a target thread

Thread t= new Thread(m1);
t.start();

for(int i=1; i<8; i++)
{
System.out.println("main thread--->"+i);
}
}
}

/*output:


F:\java by dragon\java programms\multithreading>java Thread_using_runnable

main thread--->1
main thread--->2
main thread--->3
main thread--->4
main thread--->5
main thread--->6
main thread--->7
undercontrol of--->Thread-0  1  times
undercontrol of--->Thread-0  2  times
undercontrol of--->Thread-0  3  times
undercontrol of--->Thread-0  4  times
undercontrol of--->Thread-0  5  times
undercontrol of--->Thread-0  6  times
undercontrol of--->Thread-0  7  times

F:\java by dragon\java programms\multithreading>java Thread_using_runnable

undercontrol of--->Thread-0  1  times
undercontrol of--->Thread-0  2  times
undercontrol of--->Thread-0  3  times
undercontrol of--->Thread-0  4  times
main thread--->1
undercontrol of--->Thread-0  5  times
main thread--->2
undercontrol of--->Thread-0  6  times
main thread--->3
undercontrol of--->Thread-0  7  times
main thread--->4
main thread--->5
main thread--->6
main thread--->7

*/