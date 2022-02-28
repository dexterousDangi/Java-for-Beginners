// with using start()method, directly calling run() method of the thread class

// then thread will not be created because thread is not registered in the thread schedular.
// no thread is created here.

class Nothread extends Thread
{
public void run() // overriding thread class run method
{
for(int i=0; i<7;i++)
{
System.out.println("counting.."+i);
}
}
}
class ThreadDemo
{
public static void main(String [] args)   // main thread
{
Mythread t= new Mythread();

t.run();
	// directly calling the thread class method

for(int j=0; j<3;j++)
{
System.out.println("counting..by j .."+j);
}


}
}
/*output: the remains same every time


Microsoft@Microsoft-PC MINGW64 /f/java by dragon/java programms/multithreading (main)
$ javac No_thread.java

Microsoft@Microsoft-PC MINGW64 /f/java by dragon/java programms/multithreading (main)

$ java ThreadDemo
counting..0
counting..1
counting..2
counting..3
counting..4
counting..5
counting..6
counting..by j ..0
counting..by j ..1
counting..by j ..2

*/