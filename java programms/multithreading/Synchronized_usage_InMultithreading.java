// use of synchronized modifier inside the multithreading concept: with use of this 
// modifier only one thread can access provided synchronized method , this will increase 
// the thread safety, but have low performance and waiting time also increased
// but data consistency will be increased

// by default all the method are unsynchronized .

// when you need high performance use unsynchronized method.

// when you need data consistency use synchronized like in ticket reservation softwares.
// where only one person can get ticket at a time.

class Ticketcounter
{

synchronized static void disp(String str)    // one time without synchronized is used

{for (int i=0;i<4;i++)
{
System.out.println("ticket is booked by--->"+str);
try{Thread.sleep(1000);}
catch (Exception k)
{k.printStackTrace();}
}
}
}

class Mythread1 extends Thread
{
public void run()
{
Ticketcounter.disp("Pardeep");
}
}

class Mythread2 extends Thread
{
public void run()
{
Ticketcounter.disp("Aman");
}
}

class Mythread3 extends Thread
{
public void run()
{
Ticketcounter.disp("Pinku");
}
}

class ThreadDemo99
{
public static void main(String []args)
{                            // here 3 threads are using same method

new Mythread1().start();
new Mythread2().start();
new Mythread3().start();
}
}

/* output: 

case 1: using unsynchronized method : no order of accessing
-----------------------------------

F:\java by dragon\java programms\multithreading>javac Synchronized_usage_InMultithreading.java

F:\java by dragon\java programms\multithreading>java ThreadDemo99

ticket is booked by--->Pardeep
ticket is booked by--->Pinku
ticket is booked by--->Aman
ticket is booked by--->Aman
ticket is booked by--->Pinku
ticket is booked by--->Pardeep
ticket is booked by--->Aman
ticket is booked by--->Pinku
ticket is booked by--->Pardeep
ticket is booked by--->Aman
ticket is booked by--->Pinku
ticket is booked by--->Pardeep

Case 2: using synchronized method  :  one thread at a time
----------------------------------

F:\java by dragon\java programms\multithreading>javac Synchronized_usage_InMultithreading.java

F:\java by dragon\java programms\multithreading>java ThreadDemo99

ticket is booked by--->Pardeep
ticket is booked by--->Pardeep
ticket is booked by--->Pardeep
ticket is booked by--->Pardeep
ticket is booked by--->Pinku
ticket is booked by--->Pinku
ticket is booked by--->Pinku
ticket is booked by--->Pinku
ticket is booked by--->Aman
ticket is booked by--->Aman
ticket is booked by--->Aman
ticket is booked by--->Aman

*/


















