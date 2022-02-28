// multithreading : threads are just a light weight process, in a program
// a thread is not a program its a part of program
// multithreading is very important for gaming applications because we need multiple ojbects running.
// as we know execution starts from main method, when execution starts there is a thread created called main thread
// a normal class become threaded class just by extending Thread class

// single threaded model/application

class Single_thread
{
public static void main(String []args)   // main thread created
{
System.out.println("single thread");
System.out.println("execution starts from main method");   // main threads execution
System.out.println(" a thread is created when execution starts called main thread");

} // main threads ends here.
}
