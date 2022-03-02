// About join() method, this mehtod is used to delay the execution of one thread and executed other 
// while the current thread waits(main thread) and targert thread(m1 thread or say , thread-0) execut its functionality .
//this mehtod also takes arguments and this arguments stands for mili second of the time.
// we can say that, this method cause the current thread to suspend execution for a specific period 
// and aftre that time they might execute their functionalities parallely.

class Mythread extends Thread
{
public void run()  
{
for(int i=0; i<5; i++)
{
System.out.println(Thread.currentThread().getName()+"  "+i);

try
{
Thread.sleep(100);
}

catch(InterruptedException ie)
{
ie.printStackTrace();
} 

}
}
}



class Thread_join
{
public static void main(String []args) throws InterruptedException
{
Mythread m1 = new Mythread();
Mythread m2= new Mythread();
m1.start();
 m2.start();

m1.join(); // here only current thread(main) waits while the completion of m1 thread(Thread-0)
		// while in the mean time both m1,m2 were executing parallely.


for(int i=0; i<10; i++)
{
System.out.println(Thread.currentThread().getName()+"  "+i);

Thread.sleep(100);

}
}
}

/*output:
F:\java by dragon\java programms\multithreading>javac "Thread_join().java"

F:\java by dragon\java programms\multithreading>java Thread_join
Thread-1  0
Thread-0  0
Thread-1  1
Thread-0  1
Thread-1  2
Thread-0  2
Thread-1  3
Thread-0  3
Thread-1  4
Thread-0  4
main  0
main  1
main  2
main  3
main  4
main  5
main  6
main  7
main  8
main  9
*/