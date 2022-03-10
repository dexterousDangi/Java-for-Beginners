//how to create user defined array and how to insert elements inside the userdefined array.
// to print the data we use the for each loop which was introduced in java 1.5

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

class Inserting_elements_in_userdefined_Array
{
public static void main(String []args)
{
Emp i1= new Emp(111,"dangi");
Emp i2= new Emp(222,"sam");
Emp i3= new Emp(333,"duhan");

		// now create the user defined array of Emp type

Emp [] e= new Emp[3];
			
e[0]=i1;	// now assign each index the object of Emp type
e[1]=i2;
e[2]=i3;

	// print the values using for each loop
for(Emp ee:e)
{
System.out.println(ee.eid+"-----"+ee.ename); 
			 // if we print the reference variable it will print the hashcode by calling toString() method internally;
			 // use the variable with it which you want to access.

}
}
}
/*output:

F:\java by dragon\java programms\java basic applications>javac Inserting_elements_in_userdefined_Array.java

F:\java by dragon\java programms\java basic applications>java Inserting_elements_in_userdefined_Array

111-----dangi
222-----sam
333-----duhan
*/