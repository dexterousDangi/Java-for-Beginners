// Multithreading : first application


// creating thread class by extending thread class.
//we write our business logic inside the run() method
// run() method is present in the thread class with empty implementations
// we override run() method and write our logic inside the method
// then we create the object of thread class and by using start() method we execute our thread

// t.start()method is called , it is present in Thread class and internally will call the run() method and our logic will be executed.
// there is another work of start() method, that is to "register our threads into the thread scheduler" .
// thread schedular is the part of the jvm like the garbage collectro,  which then decides which
//  thread is going to execute first, it also vary form os to os and also vary form processor to processor.
// we can predict the exect output but can guess possible output.

// thread scheduler internally follows two algorithems to execute the algorithm:
//1) pre-emptive algo
//2) time-slicing algo

class Mythread extends Thread
{
public void run() // overriding thread class run method
{
for(int i=0; i<7;i++)
{
System.out.println("counting.."+i);
}
}
}
class ThreadDemo
{
public static void main(String [] args)   // main thread
{
Mythread t= new Mythread();
//t.start();
		// from now on our application contains 2 threads

t.run();
for(int j=0; j<7;j++)
{
System.out.println("counting..by j .."+j);
}


}
}

/*output:

Microsoft@Microsoft-PC MINGW64 /f/java by dragon/java programms/multithreading (main)
$ javac First_threadclass.java

Microsoft@Microsoft-PC MINGW64 /f/java by dragon/java programms/multithreading (main)
$ java ThreadDemo
counting..by j ..0
counting..by j ..1
counting..by j ..2
counting..by j ..3
counting..by j ..4
counting..by j ..5
counting..by j ..6
counting..0
counting..1
counting..2
counting..3
counting..4
counting..5
counting..6

Microsoft@Microsoft-PC MINGW64 /f/java by dragon/java programms/multithreading (main)
$ java ThreadDemo
counting..by j ..0
counting..by j ..1
counting..by j ..2
counting..0
counting..by j ..3
counting..by j ..4
counting..1
counting..by j ..5
counting..2
counting..by j ..6
counting..3
counting..4
counting..5
counting..6


*/