//Daemon thread: the threads which runs at the background and support the normal threads or the main thread is called daemon thread
// we have to set the nature of the thread as deamon, using setDaemon() method
// there is particular behaviour of the thread, that is , irrespect of the execution of the 
//daemon thread is completed or not completed, when ever the execution the main thread is completed 
// the daemon thread is closed with the main thread whether its execution is completed or not.




class Mythread extends Thread
{
public void run()  // hook thread
{
for(int i=0; i<10; i++)
{
System.out.println("a thread function");
}
}
}



class Daemonthread extends Thread
{
public void run()  // hook thread
{
for(int i=0; i<10; i++)
{
System.out.println("Deamon thread functionality");
try
{
Thread.sleep(1); 
 			// while sleep if any other thread interrupt the sleeping thread, that will cause the 
			// exception, to deal with such exception we have two ways, one to use try-catch block or use throws keyword

}
catch(InterruptedException ie)
{
ie.printStackTrace();
}


}
}
}

class Thread_daemon
{

public static void main(String []args)   // main thread

{  
 				// a normal thread
Mythread m = new Mythread();
m.start();

					// a daemon thread
Daemonthread m1 = new Daemonthread();
m1.setDaemon(true);  //setting the nature of the thread as daemon
m1.start();  //startig the daemon thread

for(int i=0;i<4;i++)
{ 
System.out.println(" main thread");
/*
try
{
Thread.sleep(1000); // for 1 sec.
 			// while sleep if any other thread interrupt the sleeping thread, that will cause the 
			// exception, to deal with such exception we have two ways, one to use try-catch block or use throws keyword

}
catch(InterruptedException ie)
{
ie.printStackTrace();
}
*/
}
}
}

/*output: Deamon thread is closed asap the main thread completes its execution


F:\java by dragon\java programms\multithreading>javac Thread_Daemon.java

F:\java by dragon\java programms\multithreading>java Thread_daemon

a thread function
a thread function
a thread function
a thread function
a thread function
a thread function
a thread function
a thread function
a thread function
a thread function
 main thread
Deamon thread functionality
 main thread
 main thread
 main thread

F:\java by dragon\java programms\multithreading>java Thread_daemon
a thread function
a thread function
a thread function
a thread function
a thread function
 main thread
 main thread
 main thread
a thread function
a thread function
a thread function
a thread function
a thread function
Deamon thread functionality
 main thread

F:\java by dragon\java programms\multithreading>java Thread_daemon
a thread function
a thread function
a thread function
a thread function
a thread function
a thread function
a thread function
 main thread
 main thread
 main thread
 main thread
a thread function
Deamon thread functionality
a thread function
a thread function

*/










