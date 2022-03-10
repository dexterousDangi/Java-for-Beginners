// encounter a NullPointerException and how to resolve it
// using "Object class"(root class of every java class) object and "instanceof" operator




  //NullPointerException will occur in this application

class Emp     
{
int eid;
String ename;
Emp(int eid, String ename)
{
this.eid=eid;
this.ename=ename;
}
}

class About_NullPointerException
{
public static void main(String []args)
{
Emp i1= new Emp(111,"dangi");
Emp i2= new Emp(222,"sam");
Emp i3= new Emp(333,"duhan");

		// now create the user defined array of Emp type

Emp [] e= new Emp[5];
			
e[0]=i1;	// now assign each index the object of Emp type
e[2]=i2;
e[4]=i3;


					// print the values using for each loop
			for(Emp ee:e)
			{
			System.out.println(ee.eid+"-----"+ee.ename);   // here when ee[1] which is null , then "null.eid" and "null.ename" will be called  and 	
									// there is nothing that short of  statement , so complier generate the error


			 // if we print the reference variable it will print the hashcode by calling toString() method internally;
			 // use the variable with it which you want to access.
*/
}
}
}
/*output:

F:\java by dragon\java programms\java basic applications>javac About_NullPointerException.java

F:\java by dragon\java programms\java basic applications>java About_NullPointerException

111-----dangi

Exception in thread "main" java.lang.NullPointerException: Cannot read field "eid" because "<local8>" is null

        at About_NullPointerException.main(About_NullPointerException.java:33)

*/