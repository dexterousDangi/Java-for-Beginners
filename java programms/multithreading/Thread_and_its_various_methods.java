// To start  the user defined threads we depends upon the main thread.
// the user-defined threads are default names be like " Thread-0", "Thread-1", "Thread-2".
// we can also set the name of threads by using setName() method.
// and get the name of a thread using getName() method

// (Thread.currentThread()); thread class, currentThread() method to represent the current running thread 

	// we can also print the names of the main() method thread
	// but the approach is different here, we have to use "Thread" class "currentThread()" method
	// just to find out what the current thread running , now we are in main method , so here main thread will be running
	// now we get the current thread, just print its name using getName() method

// we use the above secenerio becasue main method class does not conatins setName(), or getName() method
// but we can find the current thread running in any application using currentThread()method of thread class

// other than "names" each thread contain an "Id" also.
// how to get that id: using getId() method


// to find out if the thread is alive or not use "isAlive()" method.

// to find out the count of all the alive threads use "activeCount()" method.


class Mythread extends Thread

{

public void run()
{
System.out.println("nameing a thread");
System.out.println("?"+Thread.currentThread().getName());
}
}
class ThreadDemo5
{
public static void main(String []args)   // main thread

{
Mythread m1 = new Mythread();
m1.start();
Mythread m2 = new Mythread();
m2.start();
					// using getName() method to get the name of the thread.
System.out.println(m1.getName());
System.out.println(m2.getName());   	// here we are printing the default names of user defined threads

	// we can set the names of the user defined threads using setName() methods.

m1.setName("aplha1");
m2.setName("aplha2");   // setted the user defined names

System.out.println(m1.getName());
System.out.println(m2.getName());  //now print the setted names.


	// we can also print the names of the main() method thread
	// but the approach is different here, we have to use "Thread" class "currentThread()" method
	// just to find out what the current thread running , now we are in main method , so here main thread will be running
	// now we get the current thread, just print its name using getName() method


System.out.println(Thread.currentThread().getName());  // to represent the current thread we have a method named, CurrentThread() of Thread class
      
		// we can also rename the main thread also;

Thread.currentThread().setName("main alpha");
 System.out.println(Thread.currentThread().getName()); // printing name of the current class thread again.


		// geting Id's of the threads

System.out.println(m1.getId());
System.out.println(m2.getId());
System.out.println(Thread.currentThread().getId());

	


}
}

/*output: as we know we can't predict the behaviour of the thread schedular.



F:\java by dragon\java programms\multithreading>javac "Thread_getName().java"

F:\java by dragon\java programms\multithreading>java ThreadDemo5
nameing a thread
nameing a thread
Thread-0
Thread-1
aplha1
aplha2
main
?Thread-0
?Thread-1
14
15
1

F:\java by dragon\java programms\multithreading>java ThreadDemo5
nameing a thread
nameing a thread
Thread-0
Thread-1
aplha1
aplha2

main   // main method thread name

?Thread-1    // threads accessing run() method of userdefined thread class
?Thread-0    // threads accessing run() method of userdefined thread class

14       //id's of threads 
15
1
*/
 					