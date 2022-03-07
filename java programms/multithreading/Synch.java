// concise code of file : Synchronized_usage_InMultihtreading.java
// using anonymous inner class concetp


class Ticketcounter
{

 static void disp(String str)    // one time without synchronized is used

{for (int i=0;i<4;i++)
{
System.out.println("ticket is booked by--->"+str);
try{Thread.sleep(1000);}
catch (Exception k)
{k.printStackTrace();}
}
}
}

class ThreadDemo23
{
public static void main(String []args)
{
new Thread()
{
public void run(){Ticketcounter.disp("dang");}
}.start();

new Thread()
{
public void run(){Ticketcounter.disp("sam");}
}.start();

Runnable r = new Runnable()
{
public void run(){Ticketcounter.disp("maddy");}
};

new Thread(r).start();

System.out.println("this is -->"+ Thread.currentThread().getName()+" thread");
}
}
 
/* output: when synchronized modifier is used

F:\java by dragon\java programms\multithreading>javac Synch.java

F:\java by dragon\java programms\multithreading>java ThreadDemo23

ticket is booked by--->dang
this is -->main thread
ticket is booked by--->dang
ticket is booked by--->dang
ticket is booked by--->dang
ticket is booked by--->maddy
ticket is booked by--->maddy
ticket is booked by--->maddy
ticket is booked by--->maddy
ticket is booked by--->sam
ticket is booked by--->sam
ticket is booked by--->sam
ticket is booked by--->sam

output: when there is no modifier used

F:\java by dragon\java programms\multithreading>javac Synch.java

F:\java by dragon\java programms\multithreading>java ThreadDemo23

ticket is booked by--->maddy
ticket is booked by--->sam
ticket is booked by--->dang
this is -->main thread
ticket is booked by--->maddy
ticket is booked by--->sam
ticket is booked by--->dang
ticket is booked by--->maddy
ticket is booked by--->sam
ticket is booked by--->dang
ticket is booked by--->maddy
ticket is booked by--->sam
ticket is booked by--->dang
*/