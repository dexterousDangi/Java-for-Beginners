// multiple threads performing same task

class Mythread1 extends Thread
{
public void run()
{
System.out.println("hi boy");
}
}



class ThreadDemo3
{
public static void main(String [] args)   // main thread
{
Mythread1 t1= new Mythread1();

t1.start();

Mythread1 t2= new Mythread1();

t2.start();

Mythread1 t3= new Mythread1();

t3.start();	
}
}

/*
output:

F:\java by dragon\java programms\multithreading>javac multiple_threads_singleTask.java

F:\java by dragon\java programms\multithreading>java ThreadDemo3

hi boy
hi boy
hi boy
*/