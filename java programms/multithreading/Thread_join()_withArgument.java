// About join() method, this mehtod is used to delay the execution of one thread and executed other 
// while the current thread waits(main thread) and targert thread(m1 thread or say , thread-0) execut its functionality .
//this mehtod also takes arguments and this arguments stands for mili second of the time.
// we can say that, this method cause the current thread to suspend execution for a specific period 
// and aftre that time they might execute their functionalities parallely.

class Mythread extends Thread
{
public void run()  
{
for(int i=0; i<10; i++)
{
System.out.println(Thread.currentThread().getName()+"  "+i);

try
{
Thread.sleep(1000);
}

catch(InterruptedException ie)
{
ie.printStackTrace();
} 

}
}
}



class Thread_join_withArguments
{
public static void main(String []args) throws InterruptedException
{
Mythread m1 = new Mythread();
Mythread m2= new Mythread();
m1.start();
 m2.start();

m1.join(3000); // here only current thread(main) waits for 3 sec, after that it also start its own executions


for(int i=0; i<10; i++)
{
System.out.println(Thread.currentThread().getName()+"  "+i);

Thread.sleep(1000);

}
}
}

/*
output:

// here "main thread" only waits for 3 sec. in the meantime, m1 and m2 were executing simelteniously. and  aftre 3 sec.
// all the 3 threads will be executed parallely.

F:\java by dragon\java programms\multithreading>javac "Thread_join()_withArgument.java"

F:\java by dragon\java programms\multithreading>java Thread_join_withArguments

Thread-1  0
Thread-0  0
Thread-1  1
Thread-0  1
Thread-1  2
Thread-0  2
main  0
Thread-1  3
Thread-0  3
main  1
Thread-1  4
Thread-0  4
main  2
Thread-1  5
Thread-0  5
main  3
Thread-1  6
Thread-0  6
main  4
Thread-1  7
Thread-0  7
main  5
Thread-1  8
Thread-0  8
main  6
Thread-1  9
Thread-0  9
main  7
main  8
main  9

F:\java by dragon\java programms\multithreading>java Thread_join_withArguments

Thread-1  0
Thread-0  0
Thread-1  1
Thread-0  1
Thread-1  2
Thread-0  2
main  0
Thread-1  3
Thread-0  3
main  1
Thread-1  4
Thread-0  4
main  2
Thread-0  5
Thread-1  5
main  3
Thread-0  6
Thread-1  6
main  4
Thread-0  7
Thread-1  7
main  5
Thread-0  8
Thread-1  8
main  6
Thread-0  9
Thread-1  9
main  7
main  8
main  9
