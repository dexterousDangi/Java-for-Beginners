// yes it is possible to call the methods inside the run() methods


class No_thread extends Thread
{
public void run()
{
m1();
m2();
}  // instance methods are directly accessed into instance area
void m1(){System.out.println("m1");}
void m2(){System.out.println("m2");}
}
class ThreadDemo2
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
/*
output:

F:\java by dragon\java programms\multithreading>javac calling_methods_inside_run
.java

F:\java by dragon\java programms\multithreading>java ThreadDemo2
m1
m2
counting..by j ..0
counting..by j ..1
counting..by j ..2
*/