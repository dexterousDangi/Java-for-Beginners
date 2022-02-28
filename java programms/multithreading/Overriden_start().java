//what if we override the Thread class start() method here(in the user defined thread class)
// then Thread class start() method is not executed here so, our thread will not
// be registered into the thread schedular, means our thread is not created .
// thread is not created but our program will run normally.




class No_thread extends Thread
{
public void start() // overriding thread class run method
{
for(int i=0; i<3;i++)
{
System.out.println("counting.."+i);
}
}
}
class ThreadDemo1
{
public static void main(String [] args)   // main thread
{
No_thread t= new No_thread();

t.start();
	// directly calling the thread class method

for(int j=0; j<3;j++)
{
System.out.println("counting..by j .."+j);
}


}
}

/*output: normal program execution

F:\java by dragon\java programms\multithreading>javac "Overriden_start().java"

F:\java by dragon\java programms\multithreading>java ThreadDemo1

counting..0
counting..1
counting..2
counting..by j ..0
counting..by j ..1
counting..by j ..2

*/