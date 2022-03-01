// how to find count the all alive threads in the application
		//use "activeCount()" method.
// how to find if thread is alive or not
		// use "isAlive()" method.

class Mythread extends Thread

{
public void run()
{
System.out.println("nameing a thread");

System.out.println(Mythread.activeCount());


System.out.println(isAlive());

}
}
class ThreadDemo45
{
public static void main(String []args)   // main thread

{
Mythread m1 = new Mythread();
m1.start();
Mythread m2 = new Mythread();
m2.start();
					// using getName() method to get the name of the thread.
System.out.println(m1.getName());   // geting default name of the 
System.out.println(m2.getName());
 		
m2.setName("alpha2");
m1.setName("alpha1");

System.out.println(m1.getName());    
System.out.println(m2.getName());

System.out.println(Mythread.activeCount()); 

System.out.println(m2.isAlive());

System.out.println(m1.isAlive());

}
}

/* output:


F:\java by dragon\java programms\multithreading>javac Multithreading_various_methods.java

F:\java by dragon\java programms\multithreading>java ThreadDemo45

nameing a thread
nameing a thread
Thread-0
3
3
true
Thread-1
true
alpha1
alpha2
1
false
false

F:\java by dragon\java programms\multithreading>java ThreadDemo45

nameing a thread
Thread-0
Thread-1
nameing a thread
alpha1
3
alpha2
3
true
3
true
false
false
*/