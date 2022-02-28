//multiple threads performing multiple tasks
// for every thread created there is stack memory created

// no. of threads = no. of stack memory created

// after performing there task , stack memory as well as threads are distroyed




class Mythread1 extends Thread
{
public void run()
{
System.out.println("hi boy are you goood");
}
}
class Mythread2 extends Thread
{
public void run()
{
System.out.println("hi boy doing fine");
}
}
class Mythread3 extends Thread
{
public void run()
{
System.out.println("hi boy having fun");
}
}



class ThreadDemo4
{
public static void main(String [] args)   // main thread
{
Mythread1 t1= new Mythread1();

t1.start();

Mythread2 t2= new Mythread2();

t2.start();

Mythread3 t3= new Mythread3();

t3.start();	

System.out.println("hi boy having fun in main");
}
}


/* you can predict the behaviour of thread schedular
output:

F:\java by dragon\java programms\multithreading>java ThreadDemo4
hi boy are you goood
hi boy doing fine
hi boy having fun in main
hi boy having fun

F:\java by dragon\java programms\multithreading>java ThreadDemo4
hi boy are you goood
hi boy doing fine
hi boy having fun
hi boy having fun in main
*/