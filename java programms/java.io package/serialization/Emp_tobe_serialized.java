// class to used in serialization 
// because we need atleast one java class/object to perform serialization
//Serialization is the conversion of the state of an object into a byte stream

import java.io.*;

class Emp implements Serializable
{
	// instance variable 
int eid; 
String ename;
Emp(int eid, String ename)   // local variables
{
             // conversion of local to instance

this.eid=eid;
this.ename=ename;
}
}

// the class we want to serialize that class must implements serializable interface.
// not that class which perform serialization.