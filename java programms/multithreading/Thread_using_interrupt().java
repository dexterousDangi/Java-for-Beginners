//About interrupt() method call: this method is called to interrupt 
//a sleeping(sleep()) or waiting(wait()) or joining(join()) thread, because it is
// only then possible to interrupt a thread while it is in rest state.

// if a thread is not in rest state then our interrupt() method call would go waste
// becaue it does not got executed.


//case no.1: when thread never enters into sleep mode.(interrupt() method call goes waste)
/*
class Mythread extends Thread
{
public void run()  
{
for(int i=0; i<5; i++)
{
System.out.println("user thread");
}
}
}

class Thread_interrupt
{
public static void main(String []args) throws InterruptedException
{
Mythread m1 = new Mythread();
m1.start();
m1.interrupt();

}
}
*/
/*output: interrupt() method does not got executed

F:\java by dragon\java programms\multithreading>javac "Thread_using_interrupt().java"

F:\java by dragon\java programms\multithreading>java Thread_interrupt

user thread
user thread
user thread
user thread
user thread
*/

// case no.2: when thread is sleeping and interrupt() method is called, when ever the thread is interrupted it 
// ----------
// the compiler will throw an InterruptedException and our try- catch block will deal wiht

class Mythread extends Thread
{
public void run()  
{
for(int i=0; i<5; i++)
{
System.out.println("user thread");

try
{
Thread.sleep(100);
}

catch(InterruptedException ie)
{
System.out.println("interrupted thread");
} 

}
}
}

class Thread_interrupt
{
public static void main(String []args) throws InterruptedException
{
Mythread m1 = new Mythread();
m1.start();
m1.interrupt();

}
}


/* output: as soon as thread goes to sleep mode, interrupt method is called and executed.


F:\java by dragon\java programms\multithreading>javac "Thread_using_interrupt().java"

F:\java by dragon\java programms\multithreading>java Thread_interrupt

user thread
interrupted thread
user thread
user thread
user thread
user thread
*/
























