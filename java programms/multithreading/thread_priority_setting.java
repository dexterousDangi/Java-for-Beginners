// About thread priorities 
// we can also set the priority of a thread using setPriority()method 
// we can get the priority of a method using getPriority() method.
// we can pass the integer value to set and getPriority() method.
// and java provide three constants for priorities
// priority range of the threads is 1 to 10. where highest priority is 10.
/*
 public static final int MIN_PRIORITY;   stands for 1
 public static final int NORM_PRIORITY;  stands for 5
 public static final int MAX_PRIORITY;   stands for 10 
*/

class Mythread extends Thread

{
public void run()
{
System.out.println("setting priority of  a thread");
System.out.println(Thread.currentThread().getName()+"-->"+Thread.currentThread().getPriority());
//System.out.println(Thread.currentThread().getPriority());
}
}
class ThreadDemo51
{
public static void main(String []args)   // main thread

{
Mythread m1 = new Mythread();
m1.setPriority(3);
m1.start();
Mythread m2 = new Mythread();
m1.setPriority(10);  // using interger to set priority
m2.start();

Mythread m3 = new Mythread();
m3.setPriority(Thread.NORM_PRIORITY);  //using static constants to set priority.
m3.start();

System.out.println("total active threads--->"+Thread.activeCount());

System.out.println("main Thread exceuted by which thread----->"+Thread.currentThread().getName());

}
}

/*
output: for windows opertaing system the priorities concept my not work sometimes that well.

F:\java by dragon\java programms\multithreading>javac thread_priority_setting.java

F:\java by dragon\java programms\multithreading>java ThreadDemo51

setting priority of  a thread
setting priority of  a thread
setting priority of  a thread
total active threads--->4
main Thread exceuted by which thread----->main
Thread-2-->5
Thread-1-->5
Thread-0-->10

F:\java by dragon\java programms\multithreading>java ThreadDemo51

setting priority of  a thread
setting priority of  a thread
setting priority of  a thread
Thread-0-->10
Thread-2-->5
Thread-1-->5
total active threads--->4
main Thread exceuted by which thread----->main
*/