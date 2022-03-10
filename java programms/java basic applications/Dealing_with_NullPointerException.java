//Resolving the null pointer exception, by using 
// using "Object class"(root class of every java class) object and "instanceof" operator
// instanceof operator used to check the type of object
//(o instanceof Emp) if the value in the  o are of Emp type if yes then it will print true
// we also use type casting to retrive the data back into the same user defined type i.e., Emp type

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

class Dealing_with_NullPointerException
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
 
			// now we know that at e[1] and e[3] we have no elements so "null" value is present there and if we 
			// had printed all the index directly there will be NullPointerException

			// so to deal with such situation we uses ojbect class object and instanceof() method and if conditional statements

for(Object o : e)  	// here we are storing all the data values and null values inside the Objectclass object o
{ 

			// now with the help of instanceof method and if loop we will print the elements which are elements of Emp class only
			// no the null values

if(o instanceof Emp)  	// if the values present in the o are the values of Emp type then only it will enter the if loop, other wise it
			// will go back to for loop with Increments done and no exception for null data will occure
{
			// if this opertor condation is true we always perfor type casting 
			
			// to retrive the data into the same type that is Emp type


Emp ee=(Emp)o;           // now the "o" object is casted into Emp type and stored into the another variable of the Emp type

System.out.println(ee.eid+"---"+ee.ename);
}
if (o== null)   		// if you want to print the null data use this statement
{
System.out.println(o);
}
}
}
}

/*output:

F:\java by dragon\java programms\java basic applications>javac Dealing_with_NullPointerException.java

F:\java by dragon\java programms\java basic applications>java Dealing_with_NullPointerException

111---dangi
null
222---sam
null
333---duhan
*/