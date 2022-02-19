// about exception handling : throws keyword
// try catch block handles the exception
// throws keyword delegate(pass on) the exception to the caller method.
// and at last main method is always responsible for calling the methods
// so, main method is called by JVM and JVM handles the exception at last  

// class without exception handling
/*
class  Pass_on_exception

{
void mro()
{
System.out.println("sleep mode");
Thread.sleep(2000); // 2000 mili second = 2 sec.
}

void mofficer()
{ 
mro();
}

void eseva()
{
mofficer();
}

public static void main(String []args)
{
Pass_on_exception p = new Pass_on_exception();
p. eseva();
}
}
*/ 
/*output: without thorws keyword 

F:\java by dragon\java programms\java exception handling>javac About_throws.java

About_throws.java:11: error: unreported exception InterruptedException; must be
caught or declared to be thrown
Thread.sleep(2000); // 2000 mili second = 2 sec.
            ^
1 error
*/


// class using try-catch block to handle the exception 
/*
class  Pass_on_exception

{
void mro()
{
System.out.println("sleep mode");
try{

Thread.sleep(2000); // 2000 mili second = 2 sec.

}
catch(InterruptedException ie)
{
ie.printStackTrace();   	
}
System.out.println("code after exceptional code");
}

void mofficer()
{ 
mro();
}

void eseva()
{
mofficer();
}

public static void main(String []args)
{
Pass_on_exception p = new Pass_on_exception();
p. eseva();
}
}
*/
/*
output: void mro() method is using try catch block to handle the excepiton


F:\java by dragon\java programms\java exception handling>java Pass_on_exception
sleep mode
code after exceptional code
*/


// class using throws keyword to delegate(pass on*) the exception to the caller method

class  Pass_on_exception

{
void mro() throws InterruptedException
{
System.out.println("sleep mode");
Thread.sleep(2000); // 2000 mili second = 2 sec.
}

void mofficer() throws InterruptedException
{ 
mro();
}

void eseva() throws InterruptedException
{
mofficer();
}

public static void main(String []args) throws InterruptedException
{
Pass_on_exception p = new Pass_on_exception();
p. eseva();
}
}


/* output: by passing on and on and on at last responsiblity comes to caller method 
  which is main method to handle the exception. 
  we have to decalre every caller method with "thorws" keyword until it delegate the 
  the exception to main method. and main method is called by using jvm , when we 
  declare main method with thorws keyword now jvm is responsible to deal with the exception


F:\java by dragon\java programms\java exception handling>java Pass_on_exceptio
sleep mode

*/  // program will terminate normally

// we can also use "throws Exception" in place of "throws InterruptedException"









/* delegate exception can be handled using try_cath block  by the caller method

class  Pass_on_exception

{
void mro() throws InterruptedException
{
System.out.println("sleep mode");
Thread.sleep(2000); // 2000 mili second = 2 sec.
}

void mofficer() throws InterruptedException
{ 
mro();
}

void eseva()
{try{
mofficer();}
catch(InterruptedException ae)
{
System.out.println("waked up");
}
}

public static void main(String []args) 
{
Pass_on_exception p = new Pass_on_exception();
p. eseva();
}
}
 
*/
 

































